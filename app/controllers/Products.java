package controllers;

import annotation.Catch;
import io.ebean.PagedList;
import models.Product;
import models.StockItem;
import models.Tag;
import play.data.Form;
import play.data.FormFactory;
import play.mvc.Controller;
import play.mvc.Http;
import play.mvc.Result;
import views.html.products.details;
import views.html.products.list;
import javax.inject.Inject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import play.libs.Files.TemporaryFile;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.nio.file.Paths;

@Catch // our own Annotation for @With(CatchAction.class)
public class Products extends Controller {

  // products form
  private Form<Product> productForm;

  @Inject // Injecting the FormFactory for this Controller
  public Products(FormFactory formFactory) {
    this.productForm = formFactory.form(Product.class);
  }

  // instantiate logger for this class
  final Logger log = LoggerFactory.getLogger(this.getClass());

  // list all products
  public Result list(int page) {
    if(page < 0) page = 0;
    PagedList<Product> products = Product.find(page);//findAll();
    return ok(list.render(products));
  }

  // show a blank product form
  public Result newProduct() {
    return ok(details.render(productForm));
  }

  // show a product edit form
  public Result details(Product product) {

    for(Tag tag : product.tags){

      System.out.println(tag.toString());
    }
    Form<Product> filledForm = productForm.fill(product);
    for(Tag tag : product.tags){

      System.out.println(tag.toString());
    }
    return ok(details.render(filledForm));
  }

  // save a product
  public Result save(Http.Request request) {
    Form<Product> boundForm = productForm.bindFromRequest(request);
    if(boundForm.hasErrors()) {
      request.flash().adding("error", "Please correct the form below.");
      return badRequest(details.render(boundForm));
    }

    Product product = boundForm.get();

    /* Begin: Picture file handling */
    Http.MultipartFormData<TemporaryFile> body = request.body().asMultipartFormData();
    Http.MultipartFormData.FilePart<TemporaryFile> part = body.getFile("picture");

    if(part != null) {
      TemporaryFile picture = part.getRef();
      String fileName = part.getFilename();
      String contentType = fileName.substring(fileName.indexOf('.')+1);

      Path path = picture.moveFileTo(Paths.get("C:/Users/dusti/OneDrive/inventory_management_system/public/images/" + product.getEan() + "." + contentType), true);
      product.setPictureFileName(path.getFileName().toString());
    }
    /* End: Picture file handling */

    List<Tag> tags = new ArrayList<Tag>();
    for(Tag tag : product.tags) {
      if(tag.id != null) {
        tags.add(Tag.findById(tag.id));
      }
    }
    product.tags = tags;
    StockItem item = new StockItem();
    item.quantity = 0L;
    item.product = product;

    if(product.id == null) {
      product.save();
      item.save();
    } else {
      product.update();
    }

    return redirect(routes.Products.list(0)).flashing("success", String.format("Successfully added product %s", product));
  }

  public Result delete(String ean) {
    final Product product = Product.findByEan(ean);
    if(product == null) {
      return notFound(String.format("Product %s does not exist", ean));
    }
    //Product.remove(product);

    product.setActive(false);
    product.save();
    return redirect(routes.Products.list(0)).flashing("success", String.format("Successfully deleted product"));
  }

  public Result index() {
    return redirect(routes.Products.list(0));
  }
}
