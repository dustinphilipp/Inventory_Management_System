
package views.html.warehouses

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object list extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[io.ebean.PagedList[Warehouse],List[Warehouse],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(currentPage: io.ebean.PagedList[Warehouse], warehouses: List[Warehouse]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.2*/import helper._


Seq[Any](format.raw/*1.75*/("""
"""),format.raw/*3.1*/("""
"""),_display_(/*4.2*/main("Warehouse management")/*4.30*/ {_display_(Seq[Any](format.raw/*4.32*/("""
  """),format.raw/*5.3*/("""<div class="container text-center">
    <h2>All warehouses</h2>
  </div>
  """),_display_(/*8.4*/if(currentPage.getTotalCount != 0)/*8.38*/{_display_(Seq[Any](format.raw/*8.39*/("""
    """),_display_(/*9.6*/util/*9.10*/.javascriptDelete()),format.raw/*9.29*/("""
    """),format.raw/*10.5*/("""<div class="table-responsive-sm">
      <table class="table table-striped w-auto mx-auto">
        <thead class="thead-light">
        <tr>
          <th>ID</th>
          <th>Name</th>
          <th>Address</th>
          <th></th>
        </tr>
        </thead>
        <tbody>
        """),_display_(/*21.10*/for(warehouse <- warehouses) yield /*21.38*/ {_display_(Seq[Any](format.raw/*21.40*/("""
          """),_display_(/*22.12*/if(warehouse.active)/*22.32*/{_display_(Seq[Any](format.raw/*22.33*/("""
            """),format.raw/*23.13*/("""<tr>
              <td><a href=""""),_display_(/*24.29*/routes/*24.35*/.Warehouses.details(warehouse)),format.raw/*24.65*/("""">"""),_display_(/*24.68*/warehouse/*24.77*/.id),format.raw/*24.80*/("""</a></td>
              <td><a href=""""),_display_(/*25.29*/routes/*25.35*/.Warehouses.details(warehouse)),format.raw/*25.65*/("""">"""),_display_(/*25.68*/warehouse/*25.77*/.name),format.raw/*25.82*/("""</a></td>
              <td><a href=""""),_display_(/*26.29*/routes/*26.35*/.Warehouses.details(warehouse)),format.raw/*26.65*/("""">"""),_display_(/*26.68*/warehouse/*26.77*/.address),format.raw/*26.85*/("""</a></td>
              <td>
                """),_display_(/*28.18*/(util.modalButton(("Product_" + warehouse.id), routes.Warehouses.details(warehouse).toString(), "", "fas fa-pencil-alt"))),format.raw/*28.139*/("""
                """),format.raw/*29.17*/("""<a href="#"><button type="button" class="btn btn-danger" onclick="javascript:del('"""),_display_(/*29.100*/helper/*29.106*/.CSRF(routes.Warehouses.delete(warehouse))),format.raw/*29.148*/("""')">
                  <i class="fas fa-trash"></i>
                </button></a>
              </td>
            </tr>
          """)))}),format.raw/*34.12*/("""
        """)))}),format.raw/*35.10*/("""
        """),format.raw/*36.9*/("""</tbody>
      </table>
    </div>

    """),_display_(/*40.6*/util/*40.10*/.pagination(currentPage.hasPrev, routes.Warehouses.list(currentPage.getPageIndex - 1).toString
    ,currentPage.hasNext, routes.Warehouses.list(currentPage.getPageIndex + 1).toString
    ,currentPage.getDisplayXtoYofZ(" - "," / "))),format.raw/*42.49*/("""

  """)))}/*44.5*/else/*44.10*/{_display_(Seq[Any](format.raw/*44.11*/("""
  """),format.raw/*45.3*/("""<div class="container mt-3 text-center">
    There are no registered warehouses.
  </div>
  """)))}),format.raw/*48.4*/("""
  """),format.raw/*49.3*/("""<div class="container mt-3">
    """),_display_(/*50.6*/(util.modalButton("Warehouse_New", routes.Warehouses.newWarehouse().toString(), "New Warehouse", "fas fa-plus", true))),format.raw/*50.124*/("""
    """),_display_(/*51.6*/(util.modalMultipartForm(routes.Warehouses.save().toString()))),format.raw/*51.68*/("""

  """),format.raw/*53.3*/("""</div>
""")))}))
      }
    }
  }

  def render(currentPage:io.ebean.PagedList[Warehouse],warehouses:List[Warehouse]): play.twirl.api.HtmlFormat.Appendable = apply(currentPage,warehouses)

  def f:((io.ebean.PagedList[Warehouse],List[Warehouse]) => play.twirl.api.HtmlFormat.Appendable) = (currentPage,warehouses) => apply(currentPage,warehouses)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Mar 14 03:36:33 CET 2019
                  SOURCE: C:/Users/dusti/OneDrive/play_project_1/app/views/warehouses/list.scala.html
                  HASH: cf837c29229832779a468816b75a7b2aed30be5a
                  MATRIX: 997->1|1143->77|1188->74|1216->94|1244->97|1280->125|1319->127|1349->131|1453->210|1495->244|1533->245|1565->252|1577->256|1616->275|1649->281|1976->581|2020->609|2060->611|2100->624|2129->644|2168->645|2210->659|2271->693|2286->699|2337->729|2367->732|2385->741|2409->744|2475->783|2490->789|2541->819|2571->822|2589->831|2615->836|2681->875|2696->881|2747->911|2777->914|2795->923|2824->931|2899->979|3042->1100|3088->1118|3199->1201|3215->1207|3279->1249|3446->1385|3488->1396|3525->1406|3596->1451|3609->1455|3863->1688|3888->1696|3901->1701|3940->1702|3971->1706|4097->1802|4128->1806|4189->1841|4329->1959|4362->1966|4445->2028|4478->2034
                  LINES: 28->1|31->2|34->1|35->3|36->4|36->4|36->4|37->5|40->8|40->8|40->8|41->9|41->9|41->9|42->10|53->21|53->21|53->21|54->22|54->22|54->22|55->23|56->24|56->24|56->24|56->24|56->24|56->24|57->25|57->25|57->25|57->25|57->25|57->25|58->26|58->26|58->26|58->26|58->26|58->26|60->28|60->28|61->29|61->29|61->29|61->29|66->34|67->35|68->36|72->40|72->40|74->42|76->44|76->44|76->44|77->45|80->48|81->49|82->50|82->50|83->51|83->51|85->53
                  -- GENERATED --
              */
          