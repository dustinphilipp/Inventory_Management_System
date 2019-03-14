package controllers;

import io.ebean.PagedList;
import models.Address;
import models.Warehouse;
import play.data.Form;
import play.data.FormFactory;
import play.mvc.Controller;
import play.mvc.Http;
import play.mvc.Result;
import views.html.warehouses.details;
import views.html.warehouses.list;

import javax.inject.Inject;
import java.util.List;

public class Warehouses extends Controller {

  // warehouse Form
  private Form<Warehouse> warehouseForm;

  @Inject // Injecting the FormFactory for this Controller
  public Warehouses(FormFactory formFactory) {
    this.warehouseForm = formFactory.form(Warehouse.class);
  }

  public Result index() {

    return redirect(routes.Warehouses.list(0));
  }

  public Result list(int page, Http.Request request) {
    if(page < 0) page = 0;
    PagedList<Warehouse> warehousePage = Warehouse.find(page);//findAll();
    List<Warehouse> warehouses = warehousePage.getList();
    for(Warehouse warehouse : warehouses){
      warehouse.setAddress(Address.findById(warehouse.address.id));
    }
    return ok(list.render(warehousePage, warehouses));
  }

  public Result save(Http.Request request) {

    Form<Warehouse> boundForm = warehouseForm.bindFromRequest(request);
    if(boundForm.hasErrors()) {
      request.flash().adding("error", "Please correct the form below.");
      return badRequest(details.render(boundForm));
    }

    Warehouse warehouse = boundForm.get();
    Address address = warehouse.address;
    warehouse.setActive(true);

    if(warehouse.address.id != null) {
      address.update();
    } else {
      address.save();
    }

    if(warehouse.id == null) {
      warehouse.save();
    } else {
      warehouse.update();
    }

    return redirect(routes.Warehouses.list(0)).flashing("success", String.format("Successfully added warehouse %s", warehouse));
  }

  public Result newWarehouse(Http.Request request) {

    return ok(details.render(warehouseForm));
  }

  public Result details(Warehouse warehouse, Http.Request request) {


    System.out.println(warehouse.toString());
    System.out.println(warehouse.address.toString());
    System.out.println(warehouse.getAddress().toString());
    System.out.println(warehouse.address.getId());



    Form<Warehouse> filledForm = warehouseForm.fill(warehouse);
    return ok(details.render(filledForm));
  }

  public Result delete(Warehouse warehouse, Http.Request request) {

    if(warehouse == null) {
      return notFound(String.format("Product %s does not exist", warehouse.id));
    }

    warehouse.setActive(false);
    warehouse.save();
    return redirect(routes.Products.list(0)).flashing("success", String.format("Successfully deleted product"));
  }
}
