package controllers;

import models.StockItem;
import play.mvc.Controller;
import play.mvc.Result;

import java.util.List;

public class StockItems extends Controller {

  public Result index(play.mvc.Http.Request request) {

    List<StockItem> items = StockItem.find.query()
        .where()
        .ge("quantity", 250)
        .orderBy("quantity desc")
        .setMaxRows(10)
        .findList();
    return ok(items.toString());

    //return Controller.TODO(request);
  }
}
