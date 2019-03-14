// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/dusti/OneDrive/play_project_1/conf/routes
// @DATE:Thu Mar 14 00:02:13 CET 2019

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers.javascript {

  // @LINE:29
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:29
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[play.api.mvc.PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }

  // @LINE:18
  class ReverseWarehouses(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:22
    def details: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Warehouses.details",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "warehouses/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[models.Warehouse]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:20
    def save: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Warehouses.save",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "warehouses/"})
        }
      """
    )
  
    // @LINE:19
    def list: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Warehouses.list",
      """
        function(page0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "warehouses/" + _qS([(page0 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[Integer]].javascriptUnbind + """)("page", page0))])})
        }
      """
    )
  
    // @LINE:23
    def delete: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Warehouses.delete",
      """
        function(id0) {
          return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "warehouses/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[models.Warehouse]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:21
    def newWarehouse: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Warehouses.newWarehouse",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "warehouses/new"})
        }
      """
    )
  
    // @LINE:18
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Warehouses.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "warehouses/index"})
        }
      """
    )
  
  }

  // @LINE:26
  class ReverseStockItems(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:26
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.StockItems.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "stockitems/"})
        }
      """
    )
  
  }

  // @LINE:7
  class ReverseHomeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:8
    def impressum: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.impressum",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "impressum"})
        }
      """
    )
  
    // @LINE:7
    def hello: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.hello",
      """
        function(name0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "hello" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("name", name0)])})
        }
      """
    )
  
  }

  // @LINE:6
  class ReverseProducts(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:12
    def save: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Products.save",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "products/"})
        }
      """
    )
  
    // @LINE:14
    def details: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Products.details",
      """
        function(ean0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "products/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[models.Product]].javascriptUnbind + """)("ean", ean0))})
        }
      """
    )
  
    // @LINE:15
    def delete: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Products.delete",
      """
        function(ean0) {
          return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "products/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("ean", ean0))})
        }
      """
    )
  
    // @LINE:6
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Products.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
    // @LINE:13
    def newProduct: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Products.newProduct",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "products/new"})
        }
      """
    )
  
    // @LINE:11
    def list: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Products.list",
      """
        function(page0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "products/" + _qS([(page0 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[Integer]].javascriptUnbind + """)("page", page0))])})
        }
      """
    )
  
  }


}
