
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

object details extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Form[Warehouse],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(warehouseForm: Form[Warehouse]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import helper._


Seq[Any](format.raw/*1.34*/("""

"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/main("Warehouse form")/*5.24*/ {_display_(Seq[Any](format.raw/*5.26*/("""
"""),format.raw/*6.1*/("""<div>
  <h1><div id="form_header">Warehouse form</div></h1>
  <div>
    """),_display_(/*9.6*/helper/*9.12*/.form(action = routes.Warehouses.save(), 'enctype -> "multipart/form-data")/*9.87*/ {_display_(Seq[Any](format.raw/*9.89*/("""
    """),format.raw/*10.5*/("""<fieldset id="form_fieldset">
      <legend>
        Warehouse
        """),_display_(/*13.10*/(warehouseForm("name").getValue().orElse("New"))),format.raw/*13.58*/("""
      """),format.raw/*14.7*/("""</legend>
      """),_display_(/*15.8*/helper/*15.14*/.CSRF.formField),format.raw/*15.29*/("""
      """),format.raw/*16.7*/("""<input type="hidden" value=""""),_display_(/*16.36*/warehouseForm("id")/*16.55*/.value.orElse("")),format.raw/*16.72*/("""" name="id"/>
      <input type="hidden" value=""""),_display_(/*17.36*/warehouseForm("address.id")/*17.63*/.value.orElse("")),format.raw/*17.80*/("""" name="address.id"/>

      <div class="form-group">
        """),_display_(/*20.10*/helper/*20.16*/.inputText(warehouseForm("name"), '_label -> "Name", '_showConstraints -> false, 'class -> "form-control")),format.raw/*20.122*/("""
      """),format.raw/*21.7*/("""</div>
      <div class="form-group">
        """),_display_(/*23.10*/helper/*23.16*/.inputText(warehouseForm("address.street"), '_label -> "Street", '_showConstraints -> false, 'class -> "form-control")),format.raw/*23.134*/("""
      """),format.raw/*24.7*/("""</div>
      <div class="form-group">
        """),_display_(/*26.10*/helper/*26.16*/.inputText(warehouseForm("address.number"), '_label -> "Street Nr.", '_showConstraints -> false, 'class -> "form-control")),format.raw/*26.138*/("""
      """),format.raw/*27.7*/("""</div>
      <div class="form-group">
        """),_display_(/*29.10*/helper/*29.16*/.inputText(warehouseForm("address.postalCode"), '_label -> "Postal Code", '_showConstraints -> false, 'class -> "form-control")),format.raw/*29.143*/("""
      """),format.raw/*30.7*/("""</div>
      <div class="form-group">
        """),_display_(/*32.10*/helper/*32.16*/.inputText(warehouseForm("address.city"), '_label -> "City", '_showConstraints -> false, 'class -> "form-control")),format.raw/*32.130*/("""
      """),format.raw/*33.7*/("""</div>
      <div class="form-group">
        """),_display_(/*35.10*/helper/*35.16*/.inputText(warehouseForm("address.country"), '_label -> "Country", '_showConstraints -> false, 'class -> "form-control")),format.raw/*35.136*/("""
      """),format.raw/*36.7*/("""</div>
    </fieldset>
    <div class="control-group">
      <div class="controls">
        <button value="submit" class="btn btn-primary icon-save">
          <i class="far fa-save"> Save</i>
        </button>
        <a id="cancel" class="btn btn-secondary" href=""""),_display_(/*43.57*/routes/*43.63*/.Warehouses.list()),format.raw/*43.81*/("""">
          Cancel
        </a>
      </div>
    </div>
    """)))}),format.raw/*48.6*/("""
  """),format.raw/*49.3*/("""</div>
</div>
""")))}))
      }
    }
  }

  def render(warehouseForm:Form[Warehouse]): play.twirl.api.HtmlFormat.Appendable = apply(warehouseForm)

  def f:((Form[Warehouse]) => play.twirl.api.HtmlFormat.Appendable) = (warehouseForm) => apply(warehouseForm)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Mar 14 03:02:03 CET 2019
                  SOURCE: C:/Users/dusti/OneDrive/play_project_1/app/views/warehouses/details.scala.html
                  HASH: 642981380c9f451824904723d71e3598fdd7a687
                  MATRIX: 970->1|1075->38|1120->33|1150->55|1178->58|1208->80|1247->82|1275->84|1376->160|1390->166|1473->241|1512->243|1545->249|1647->324|1716->372|1751->380|1795->398|1810->404|1846->419|1881->427|1937->456|1965->475|2003->492|2080->542|2116->569|2154->586|2247->652|2262->658|2390->764|2425->772|2501->821|2516->827|2656->945|2691->953|2767->1002|2782->1008|2926->1130|2961->1138|3037->1187|3052->1193|3201->1320|3236->1328|3312->1377|3327->1383|3463->1497|3498->1505|3574->1554|3589->1560|3731->1680|3766->1688|4067->1962|4082->1968|4121->1986|4218->2053|4249->2057
                  LINES: 28->1|31->3|34->1|36->4|37->5|37->5|37->5|38->6|41->9|41->9|41->9|41->9|42->10|45->13|45->13|46->14|47->15|47->15|47->15|48->16|48->16|48->16|48->16|49->17|49->17|49->17|52->20|52->20|52->20|53->21|55->23|55->23|55->23|56->24|58->26|58->26|58->26|59->27|61->29|61->29|61->29|62->30|64->32|64->32|64->32|65->33|67->35|67->35|67->35|68->36|75->43|75->43|75->43|80->48|81->49
                  -- GENERATED --
              */
          