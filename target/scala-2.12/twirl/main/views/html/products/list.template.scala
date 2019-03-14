
package views.html.products

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

object list extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[io.ebean.PagedList[Product],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(currentPage: io.ebean.PagedList[Product]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.2*/import helper._


Seq[Any](format.raw/*1.44*/("""
"""),format.raw/*3.1*/("""
"""),_display_(/*4.2*/main("Products catalogue")/*4.28*/ {_display_(Seq[Any](format.raw/*4.30*/("""
  """),format.raw/*5.3*/("""<div class="container text-center">
    <h2>All products</h2>
  </div>
  """),_display_(/*8.4*/util/*8.8*/.javascriptDelete()),format.raw/*8.27*/("""
  """),format.raw/*9.3*/("""<div class="table-responsive-sm">
    <table class="table table-striped w-auto mx-auto">
      <thead class="thead-light">
        <tr>
          <th></th>
          <th>EAN</th>
          <th>Name</th>
          <th>Description</th>
          <th></th>
        </tr>
      </thead>
      <tbody>
      """),_display_(/*21.8*/for(product <- currentPage.getList()) yield /*21.45*/ {_display_(Seq[Any](format.raw/*21.47*/("""
      """),_display_(/*22.8*/if(product.active)/*22.26*/{_display_(Seq[Any](format.raw/*22.27*/("""
        """),format.raw/*23.9*/("""<tr>
          <td>"""),_display_(/*24.16*/if(product.pictureFileName != null)/*24.51*/{_display_(Seq[Any](format.raw/*24.52*/("""<img
              style="position:relative; height:80px"
              src=""""),_display_(/*26.21*/("/assets/images/" + product.pictureFileName)),format.raw/*26.66*/("""">""")))}),format.raw/*26.69*/("""</td>
          <td><a href=""""),_display_(/*27.25*/routes/*27.31*/.Products.details(product)),format.raw/*27.57*/(""" """),format.raw/*27.58*/("""">"""),_display_(/*27.61*/product/*27.68*/.ean),format.raw/*27.72*/("""</a></td>
          <td><a href=""""),_display_(/*28.25*/routes/*28.31*/.Products.details(product)),format.raw/*28.57*/(""" """),format.raw/*28.58*/("""">"""),_display_(/*28.61*/product/*28.68*/.name),format.raw/*28.73*/("""</a></td>
          <td><a href=""""),_display_(/*29.25*/routes/*29.31*/.Products.details(product)),format.raw/*29.57*/(""" """),format.raw/*29.58*/("""">"""),_display_(/*29.61*/product/*29.68*/.description),format.raw/*29.80*/("""</a></td>
          <td>
            """),_display_(/*31.14*/(util.modalButton(("Product_" + product.ean), routes.Products.details(product).toString(), "", "fas fa-pencil-alt"))),format.raw/*31.130*/("""
            """),format.raw/*32.13*/("""<a href="#"><button type="button" class="btn btn-danger" onclick="javascript:del('"""),_display_(/*32.96*/helper/*32.102*/.CSRF(routes.Products.delete(product.ean))),format.raw/*32.144*/("""')">
              <i class="fas fa-trash"></i>
            </button></a>
          </td>
        </tr>
      """)))}),format.raw/*37.8*/("""
      """)))}),format.raw/*38.8*/("""
      """),format.raw/*39.7*/("""</tbody>
    </table>
  </div>

  """),_display_(/*43.4*/util/*43.8*/.pagination(currentPage.hasPrev, routes.Products.list(currentPage.getPageIndex - 1).toString
                  ,currentPage.hasNext, routes.Products.list(currentPage.getPageIndex + 1).toString
                  ,currentPage.getDisplayXtoYofZ(" - "," / "))),format.raw/*45.63*/("""

  """),format.raw/*47.3*/("""<div class="container">
    """),_display_(/*48.6*/(util.modalButton("Product_New", routes.Products.newProduct().toString(), "New Product", "fas fa-plus", true))),format.raw/*48.116*/("""
    """),_display_(/*49.6*/(util.modalMultipartForm(routes.Products.save().toString()))),format.raw/*49.66*/("""
  """),format.raw/*50.3*/("""</div>
""")))}))
      }
    }
  }

  def render(currentPage:io.ebean.PagedList[Product]): play.twirl.api.HtmlFormat.Appendable = apply(currentPage)

  def f:((io.ebean.PagedList[Product]) => play.twirl.api.HtmlFormat.Appendable) = (currentPage) => apply(currentPage)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed Mar 13 20:56:49 CET 2019
                  SOURCE: C:/Users/dusti/OneDrive/play_project_1/app/views/products/list.scala.html
                  HASH: 9990ebcba00f43c9d18c735f58dcd4a6d40bc61e
                  MATRIX: 977->1|1092->46|1137->43|1165->63|1193->66|1227->92|1266->94|1296->98|1398->175|1409->179|1448->198|1478->202|1820->518|1873->555|1913->557|1948->566|1975->584|2014->585|2051->595|2099->616|2143->651|2182->652|2289->732|2355->777|2389->780|2447->811|2462->817|2509->843|2538->844|2568->847|2584->854|2609->858|2671->893|2686->899|2733->925|2762->926|2792->929|2808->936|2834->941|2896->976|2911->982|2958->1008|2987->1009|3017->1012|3033->1019|3066->1031|3133->1071|3271->1187|3313->1201|3423->1284|3439->1290|3503->1332|3649->1448|3688->1457|3723->1465|3788->1504|3800->1508|4078->1765|4111->1771|4167->1801|4299->1911|4332->1918|4413->1978|4444->1982
                  LINES: 28->1|31->2|34->1|35->3|36->4|36->4|36->4|37->5|40->8|40->8|40->8|41->9|53->21|53->21|53->21|54->22|54->22|54->22|55->23|56->24|56->24|56->24|58->26|58->26|58->26|59->27|59->27|59->27|59->27|59->27|59->27|59->27|60->28|60->28|60->28|60->28|60->28|60->28|60->28|61->29|61->29|61->29|61->29|61->29|61->29|61->29|63->31|63->31|64->32|64->32|64->32|64->32|69->37|70->38|71->39|75->43|75->43|77->45|79->47|80->48|80->48|81->49|81->49|82->50
                  -- GENERATED --
              */
          