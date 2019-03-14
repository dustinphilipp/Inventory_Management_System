
package views.html.util

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

object modal extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template5[String,String,String,String,Boolean,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(modalButtonName: String,
  modalActionLoad: String,
  modalButtonText: String,
  modalButtonIconClass: String,
  centerButton: Boolean = false):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*5.33*/("""

"""),format.raw/*7.1*/("""<!-- Button trigger modal -->
"""),_display_(/*8.2*/if(centerButton)/*8.18*/{_display_(Seq[Any](format.raw/*8.19*/("""<div class="container text-center">""")))}),format.raw/*8.55*/("""
"""),format.raw/*9.1*/("""<button id='"""),_display_(/*9.14*/modalButtonName),format.raw/*9.29*/("""' aria-labelledby='"""),_display_(/*9.49*/modalButtonName),format.raw/*9.64*/("""' type="button" class="btn btn-primary" data-toggle="modal" data-target="#modal" >
  <i class=""""),_display_(/*10.14*/modalButtonIconClass),format.raw/*10.34*/(""""></i>
  """),_display_(/*11.4*/modalButtonText),format.raw/*11.19*/("""
"""),format.raw/*12.1*/("""</button>
"""),_display_(/*13.2*/if(centerButton)/*13.18*/{_display_(Seq[Any](format.raw/*13.19*/("""</div>""")))}),format.raw/*13.26*/("""


"""),format.raw/*16.1*/("""<script>
  $('#"""),_display_(/*17.8*/modalButtonName),format.raw/*17.23*/("""').click(function () """),format.raw/*17.44*/("""{"""),format.raw/*17.45*/("""
    """),format.raw/*18.5*/("""var $buffer = $('<div />').load('"""),_display_(/*18.39*/modalActionLoad),format.raw/*18.54*/("""', function(data) """),format.raw/*18.72*/("""{"""),format.raw/*18.73*/("""
      """),format.raw/*19.7*/("""$('#modal_title').html($buffer.find(' #product_form_header'));
      $('#modal_body').html($buffer.find(' #form_fieldset'));
    """),format.raw/*21.5*/("""}"""),format.raw/*21.6*/(""")
  """),format.raw/*22.3*/("""}"""),format.raw/*22.4*/(""")
</script>"""))
      }
    }
  }

  def render(modalButtonName:String,modalActionLoad:String,modalButtonText:String,modalButtonIconClass:String,centerButton:Boolean): play.twirl.api.HtmlFormat.Appendable = apply(modalButtonName,modalActionLoad,modalButtonText,modalButtonIconClass,centerButton)

  def f:((String,String,String,String,Boolean) => play.twirl.api.HtmlFormat.Appendable) = (modalButtonName,modalActionLoad,modalButtonText,modalButtonIconClass,centerButton) => apply(modalButtonName,modalActionLoad,modalButtonText,modalButtonIconClass,centerButton)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed Mar 13 20:53:36 CET 2019
                  SOURCE: C:/Users/dusti/OneDrive/play_project_1/app/views/util/modalButton.scala.html
                  HASH: be6bb618afe463f8bab4eac9162f88b70837a526
                  MATRIX: 982->1|1225->149|1255->153|1312->185|1336->201|1374->202|1440->238|1468->240|1507->253|1542->268|1588->288|1623->303|1747->400|1788->420|1825->431|1861->446|1890->448|1928->460|1953->476|1992->477|2030->484|2063->490|2106->507|2142->522|2191->543|2220->544|2253->550|2314->584|2350->599|2396->617|2425->618|2460->626|2618->757|2646->758|2678->763|2706->764
                  LINES: 28->1|37->5|39->7|40->8|40->8|40->8|40->8|41->9|41->9|41->9|41->9|41->9|42->10|42->10|43->11|43->11|44->12|45->13|45->13|45->13|45->13|48->16|49->17|49->17|49->17|49->17|50->18|50->18|50->18|50->18|50->18|51->19|53->21|53->21|54->22|54->22
                  -- GENERATED --
              */
          