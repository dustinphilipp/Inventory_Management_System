
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

object modalButton extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template5[String,String,String,String,Boolean,play.twirl.api.HtmlFormat.Appendable] {

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
      """),format.raw/*19.7*/("""$('#modal_title').html($buffer.find(' #form_header'));
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
                  DATE: Thu Mar 14 01:21:45 CET 2019
                  SOURCE: C:/Users/dusti/OneDrive/play_project_1/app/views/util/modalButton.scala.html
                  HASH: 7efe13bad4ae93156671cd4e8ff7fab131479ecc
                  MATRIX: 988->1|1231->149|1261->153|1318->185|1342->201|1380->202|1446->238|1474->240|1513->253|1548->268|1594->288|1629->303|1753->400|1794->420|1831->431|1867->446|1896->448|1934->460|1959->476|1998->477|2036->484|2069->490|2112->507|2148->522|2197->543|2226->544|2259->550|2320->584|2356->599|2402->617|2431->618|2466->626|2616->749|2644->750|2676->755|2704->756
                  LINES: 28->1|37->5|39->7|40->8|40->8|40->8|40->8|41->9|41->9|41->9|41->9|41->9|42->10|42->10|43->11|43->11|44->12|45->13|45->13|45->13|45->13|48->16|49->17|49->17|49->17|49->17|50->18|50->18|50->18|50->18|50->18|51->19|53->21|53->21|54->22|54->22
                  -- GENERATED --
              */
          