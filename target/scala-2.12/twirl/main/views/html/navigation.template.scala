
package views.html

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

object navigation extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.4*/("""
"""),format.raw/*2.1*/("""<nav class="navbar navbar-expand-sm navbar-dark bg-dark" id="navigation">
  <a class="navbar-brand" href=""""),_display_(/*3.34*/routes/*3.40*/.Products.index()),format.raw/*3.57*/("""">Inventory Management</a>
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
  <div class="collapse navbar-collapse" id="navbarSupportedContent">
    <ul class="navbar-nav container">
      <li class="nav-item active"><a class="nav-link" href=""""),_display_(/*9.62*/routes/*9.68*/.Products.index()),format.raw/*9.85*/("""">Home</a></li>
      <li class="nav-item active"><a class="nav-link" href=""""),_display_(/*10.62*/routes/*10.68*/.Products.list()),format.raw/*10.84*/("""">Products</a></li>
      <li class="nav-item active"><a class="nav-link" href=""""),_display_(/*11.62*/routes/*11.68*/.Warehouses.index()),format.raw/*11.87*/("""">Warehouses</a></li>
      <li class="nav-item active"><a class="nav-link" href=""""),_display_(/*12.62*/routes/*12.68*/.HomeController.impressum()),format.raw/*12.95*/("""">Contact</a></li>
    </ul>
  </div>
</nav>"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Mar 14 00:02:13 CET 2019
                  SOURCE: C:/Users/dusti/OneDrive/play_project_1/app/views/navigation.scala.html
                  HASH: b13be517e4ae4df822f47aa39c11ac1a3b8719be
                  MATRIX: 946->1|1042->3|1070->5|1204->113|1218->119|1255->136|1747->602|1761->608|1798->625|1903->703|1918->709|1955->725|2064->807|2079->813|2119->832|2230->916|2245->922|2293->949
                  LINES: 28->1|33->1|34->2|35->3|35->3|35->3|41->9|41->9|41->9|42->10|42->10|42->10|43->11|43->11|43->11|44->12|44->12|44->12
                  -- GENERATED --
              */
          