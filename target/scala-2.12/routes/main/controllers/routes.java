// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/dusti/OneDrive/play_project_1/conf/routes
// @DATE:Thu Mar 14 00:02:13 CET 2019

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseAssets Assets = new controllers.ReverseAssets(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseWarehouses Warehouses = new controllers.ReverseWarehouses(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseStockItems StockItems = new controllers.ReverseStockItems(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseHomeController HomeController = new controllers.ReverseHomeController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseProducts Products = new controllers.ReverseProducts(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseAssets Assets = new controllers.javascript.ReverseAssets(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseWarehouses Warehouses = new controllers.javascript.ReverseWarehouses(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseStockItems StockItems = new controllers.javascript.ReverseStockItems(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseHomeController HomeController = new controllers.javascript.ReverseHomeController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseProducts Products = new controllers.javascript.ReverseProducts(RoutesPrefix.byNamePrefix());
  }

}
