package controllers;

import io.ebean.PagedList;
import models.Product;
import models.StockItem;
import models.Warehouse;
import play.mvc.Controller;
import play.mvc.Http;
import play.mvc.Result;
import views.html.stockitems.list;

public class StockItems extends Controller {

  public Result index() {
    return redirect(routes.StockItems.list(0));
  }

  public Result list(int page) {

    PagedList<StockItem> stockItems = StockItem.find(page);
    for(StockItem stockItem : stockItems.getList()){
      stockItem.setWarehouse(Warehouse.findById(stockItem.warehouse.getId()));
      stockItem.setProduct(Product.findById(stockItem.product.getId()));
    }
    return ok(list.render(stockItems));
  }

  public Result save(Http.Request request) {

    return Controller.TODO(request);
  }

  public Result delete(StockItem stockItem, Http.Request request) {

    return Controller.TODO(request);
  }

  public Result details(StockItem stockItem, Http.Request request) {

    return Controller.TODO(request);
  }

  public Result newStockItem(Http.Request request) {

    return Controller.TODO(request);
  }

}
