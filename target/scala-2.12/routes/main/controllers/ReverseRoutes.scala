// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/dusti/OneDrive/play_project_1/conf/routes
// @DATE:Thu Mar 14 00:02:13 CET 2019

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers {

  // @LINE:29
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:29
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }

  // @LINE:18
  class ReverseWarehouses(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:22
    def details(id:models.Warehouse): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "warehouses/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[models.Warehouse]].unbind("id", id)))
    }
  
    // @LINE:20
    def save(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "warehouses/")
    }
  
    // @LINE:19
    def list(page:Integer = 0): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "warehouses/" + play.core.routing.queryString(List(if(page == 0) None else Some(implicitly[play.api.mvc.QueryStringBindable[Integer]].unbind("page", page)))))
    }
  
    // @LINE:23
    def delete(id:models.Warehouse): Call = {
      
      Call("DELETE", _prefix + { _defaultPrefix } + "warehouses/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[models.Warehouse]].unbind("id", id)))
    }
  
    // @LINE:21
    def newWarehouse(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "warehouses/new")
    }
  
    // @LINE:18
    def index(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "warehouses/index")
    }
  
  }

  // @LINE:26
  class ReverseStockItems(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:26
    def index(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "stockitems/")
    }
  
  }

  // @LINE:7
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:8
    def impressum(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "impressum")
    }
  
    // @LINE:7
    def hello(name:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "hello" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("name", name)))))
    }
  
  }

  // @LINE:6
  class ReverseProducts(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:12
    def save(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "products/")
    }
  
    // @LINE:14
    def details(ean:models.Product): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "products/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[models.Product]].unbind("ean", ean)))
    }
  
    // @LINE:15
    def delete(ean:String): Call = {
      
      Call("DELETE", _prefix + { _defaultPrefix } + "products/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("ean", ean)))
    }
  
    // @LINE:6
    def index(): Call = {
      
      Call("GET", _prefix)
    }
  
    // @LINE:13
    def newProduct(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "products/new")
    }
  
    // @LINE:11
    def list(page:Integer = 0): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "products/" + play.core.routing.queryString(List(if(page == 0) None else Some(implicitly[play.api.mvc.QueryStringBindable[Integer]].unbind("page", page)))))
    }
  
  }


}
