// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/dusti/OneDrive/play_project_1/conf/routes
// @DATE:Thu Mar 14 00:02:13 CET 2019

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  Products_1: controllers.Products,
  // @LINE:7
  HomeController_4: controllers.HomeController,
  // @LINE:18
  Warehouses_2: controllers.Warehouses,
  // @LINE:26
  StockItems_0: controllers.StockItems,
  // @LINE:29
  Assets_3: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    Products_1: controllers.Products,
    // @LINE:7
    HomeController_4: controllers.HomeController,
    // @LINE:18
    Warehouses_2: controllers.Warehouses,
    // @LINE:26
    StockItems_0: controllers.StockItems,
    // @LINE:29
    Assets_3: controllers.Assets
  ) = this(errorHandler, Products_1, HomeController_4, Warehouses_2, StockItems_0, Assets_3, "/")

  def withPrefix(addPrefix: String): Routes = {
    val prefix = play.api.routing.Router.concatPrefix(addPrefix, this.prefix)
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, Products_1, HomeController_4, Warehouses_2, StockItems_0, Assets_3, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.Products.index()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """hello""", """controllers.HomeController.hello(name:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """impressum""", """controllers.HomeController.impressum()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """products/""", """controllers.Products.list(page:Integer ?= 0)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """products/""", """controllers.Products.save(request:Request)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """products/new""", """controllers.Products.newProduct()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """products/""" + "$" + """ean<[^/]+>""", """controllers.Products.details(ean:models.Product)"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """products/""" + "$" + """ean<[^/]+>""", """controllers.Products.delete(ean:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """warehouses/index""", """controllers.Warehouses.index()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """warehouses/""", """controllers.Warehouses.list(page:Integer ?= 0, request:Request)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """warehouses/""", """controllers.Warehouses.save(request:Request)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """warehouses/new""", """controllers.Warehouses.newWarehouse(request:Request)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """warehouses/""" + "$" + """id<[^/]+>""", """controllers.Warehouses.details(id:models.Warehouse, request:Request)"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """warehouses/""" + "$" + """id<[^/]+>""", """controllers.Warehouses.delete(id:models.Warehouse, request:Request)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """stockitems/""", """controllers.StockItems.index(request:Request)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_Products_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_Products_index0_invoker = createInvoker(
    Products_1.index(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Products",
      "index",
      Nil,
      "GET",
      this.prefix + """""",
      """ An example controller showing a sample home page""",
      Seq()
    )
  )

  // @LINE:7
  private[this] lazy val controllers_HomeController_hello1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("hello")))
  )
  private[this] lazy val controllers_HomeController_hello1_invoker = createInvoker(
    HomeController_4.hello(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "hello",
      Seq(classOf[String]),
      "GET",
      this.prefix + """hello""",
      """""",
      Seq()
    )
  )

  // @LINE:8
  private[this] lazy val controllers_HomeController_impressum2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("impressum")))
  )
  private[this] lazy val controllers_HomeController_impressum2_invoker = createInvoker(
    HomeController_4.impressum(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "impressum",
      Nil,
      "GET",
      this.prefix + """impressum""",
      """""",
      Seq()
    )
  )

  // @LINE:11
  private[this] lazy val controllers_Products_list3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("products/")))
  )
  private[this] lazy val controllers_Products_list3_invoker = createInvoker(
    Products_1.list(fakeValue[Integer]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Products",
      "list",
      Seq(classOf[Integer]),
      "GET",
      this.prefix + """products/""",
      """ Adding routes for product catalog""",
      Seq()
    )
  )

  // @LINE:12
  private[this] lazy val controllers_Products_save4_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("products/")))
  )
  private[this] lazy val controllers_Products_save4_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      Products_1.save(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Products",
      "save",
      Seq(classOf[play.mvc.Http.Request]),
      "POST",
      this.prefix + """products/""",
      """""",
      Seq()
    )
  )

  // @LINE:13
  private[this] lazy val controllers_Products_newProduct5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("products/new")))
  )
  private[this] lazy val controllers_Products_newProduct5_invoker = createInvoker(
    Products_1.newProduct(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Products",
      "newProduct",
      Nil,
      "GET",
      this.prefix + """products/new""",
      """""",
      Seq()
    )
  )

  // @LINE:14
  private[this] lazy val controllers_Products_details6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("products/"), DynamicPart("ean", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Products_details6_invoker = createInvoker(
    Products_1.details(fakeValue[models.Product]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Products",
      "details",
      Seq(classOf[models.Product]),
      "GET",
      this.prefix + """products/""" + "$" + """ean<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:15
  private[this] lazy val controllers_Products_delete7_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("products/"), DynamicPart("ean", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Products_delete7_invoker = createInvoker(
    Products_1.delete(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Products",
      "delete",
      Seq(classOf[String]),
      "DELETE",
      this.prefix + """products/""" + "$" + """ean<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:18
  private[this] lazy val controllers_Warehouses_index8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("warehouses/index")))
  )
  private[this] lazy val controllers_Warehouses_index8_invoker = createInvoker(
    Warehouses_2.index(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Warehouses",
      "index",
      Nil,
      "GET",
      this.prefix + """warehouses/index""",
      """ Adding routes for warehouse management""",
      Seq()
    )
  )

  // @LINE:19
  private[this] lazy val controllers_Warehouses_list9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("warehouses/")))
  )
  private[this] lazy val controllers_Warehouses_list9_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      Warehouses_2.list(fakeValue[Integer], fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Warehouses",
      "list",
      Seq(classOf[Integer], classOf[play.mvc.Http.Request]),
      "GET",
      this.prefix + """warehouses/""",
      """""",
      Seq()
    )
  )

  // @LINE:20
  private[this] lazy val controllers_Warehouses_save10_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("warehouses/")))
  )
  private[this] lazy val controllers_Warehouses_save10_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      Warehouses_2.save(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Warehouses",
      "save",
      Seq(classOf[play.mvc.Http.Request]),
      "POST",
      this.prefix + """warehouses/""",
      """""",
      Seq()
    )
  )

  // @LINE:21
  private[this] lazy val controllers_Warehouses_newWarehouse11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("warehouses/new")))
  )
  private[this] lazy val controllers_Warehouses_newWarehouse11_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      Warehouses_2.newWarehouse(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Warehouses",
      "newWarehouse",
      Seq(classOf[play.mvc.Http.Request]),
      "GET",
      this.prefix + """warehouses/new""",
      """""",
      Seq()
    )
  )

  // @LINE:22
  private[this] lazy val controllers_Warehouses_details12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("warehouses/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Warehouses_details12_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      Warehouses_2.details(fakeValue[models.Warehouse], fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Warehouses",
      "details",
      Seq(classOf[models.Warehouse], classOf[play.mvc.Http.Request]),
      "GET",
      this.prefix + """warehouses/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:23
  private[this] lazy val controllers_Warehouses_delete13_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("warehouses/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Warehouses_delete13_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      Warehouses_2.delete(fakeValue[models.Warehouse], fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Warehouses",
      "delete",
      Seq(classOf[models.Warehouse], classOf[play.mvc.Http.Request]),
      "DELETE",
      this.prefix + """warehouses/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:26
  private[this] lazy val controllers_StockItems_index14_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("stockitems/")))
  )
  private[this] lazy val controllers_StockItems_index14_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      StockItems_0.index(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.StockItems",
      "index",
      Seq(classOf[play.mvc.Http.Request]),
      "GET",
      this.prefix + """stockitems/""",
      """ Adding routes for the stockitems""",
      Seq()
    )
  )

  // @LINE:29
  private[this] lazy val controllers_Assets_versioned15_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned15_invoker = createInvoker(
    Assets_3.versioned(fakeValue[String], fakeValue[Asset]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """ Map static resources from the /public folder to the /assets URL path""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_Products_index0_route(params@_) =>
      call { 
        controllers_Products_index0_invoker.call(Products_1.index())
      }
  
    // @LINE:7
    case controllers_HomeController_hello1_route(params@_) =>
      call(params.fromQuery[String]("name", None)) { (name) =>
        controllers_HomeController_hello1_invoker.call(HomeController_4.hello(name))
      }
  
    // @LINE:8
    case controllers_HomeController_impressum2_route(params@_) =>
      call { 
        controllers_HomeController_impressum2_invoker.call(HomeController_4.impressum())
      }
  
    // @LINE:11
    case controllers_Products_list3_route(params@_) =>
      call(params.fromQuery[Integer]("page", Some(0))) { (page) =>
        controllers_Products_list3_invoker.call(Products_1.list(page))
      }
  
    // @LINE:12
    case controllers_Products_save4_route(params@_) =>
      call { 
        controllers_Products_save4_invoker.call(
          req => Products_1.save(req))
      }
  
    // @LINE:13
    case controllers_Products_newProduct5_route(params@_) =>
      call { 
        controllers_Products_newProduct5_invoker.call(Products_1.newProduct())
      }
  
    // @LINE:14
    case controllers_Products_details6_route(params@_) =>
      call(params.fromPath[models.Product]("ean", None)) { (ean) =>
        controllers_Products_details6_invoker.call(Products_1.details(ean))
      }
  
    // @LINE:15
    case controllers_Products_delete7_route(params@_) =>
      call(params.fromPath[String]("ean", None)) { (ean) =>
        controllers_Products_delete7_invoker.call(Products_1.delete(ean))
      }
  
    // @LINE:18
    case controllers_Warehouses_index8_route(params@_) =>
      call { 
        controllers_Warehouses_index8_invoker.call(Warehouses_2.index())
      }
  
    // @LINE:19
    case controllers_Warehouses_list9_route(params@_) =>
      call(params.fromQuery[Integer]("page", Some(0))) { (page) =>
        controllers_Warehouses_list9_invoker.call(
          req => Warehouses_2.list(page, req))
      }
  
    // @LINE:20
    case controllers_Warehouses_save10_route(params@_) =>
      call { 
        controllers_Warehouses_save10_invoker.call(
          req => Warehouses_2.save(req))
      }
  
    // @LINE:21
    case controllers_Warehouses_newWarehouse11_route(params@_) =>
      call { 
        controllers_Warehouses_newWarehouse11_invoker.call(
          req => Warehouses_2.newWarehouse(req))
      }
  
    // @LINE:22
    case controllers_Warehouses_details12_route(params@_) =>
      call(params.fromPath[models.Warehouse]("id", None)) { (id) =>
        controllers_Warehouses_details12_invoker.call(
          req => Warehouses_2.details(id, req))
      }
  
    // @LINE:23
    case controllers_Warehouses_delete13_route(params@_) =>
      call(params.fromPath[models.Warehouse]("id", None)) { (id) =>
        controllers_Warehouses_delete13_invoker.call(
          req => Warehouses_2.delete(id, req))
      }
  
    // @LINE:26
    case controllers_StockItems_index14_route(params@_) =>
      call { 
        controllers_StockItems_index14_invoker.call(
          req => StockItems_0.index(req))
      }
  
    // @LINE:29
    case controllers_Assets_versioned15_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned15_invoker.call(Assets_3.versioned(path, file))
      }
  }
}
