package controllers;

import models.StockItem;
import models.StockItemMovement;
import play.mvc.Controller;
import play.mvc.Result;

import java.util.List;

public class StockItemMovements extends Controller{

  public Result list(StockItem stockItem){

    List<StockItemMovement> stockItemMovements = StockItemMovement.findForStockItem(stockItem);
    return ok();
  }
}
