
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

object javascriptDelete extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.4*/("""
"""),format.raw/*2.1*/("""<script>
    function del(urlToDelete) """),format.raw/*3.31*/("""{"""),format.raw/*3.32*/("""
      """),format.raw/*4.7*/("""$.ajax("""),format.raw/*4.14*/("""{"""),format.raw/*4.15*/("""
        """),format.raw/*5.9*/("""url: urlToDelete,
        type: 'DELETE',
        success: function(results) """),format.raw/*7.36*/("""{"""),format.raw/*7.37*/("""
          """),format.raw/*8.11*/("""// Refresh the page
          location.reload();
        """),format.raw/*10.9*/("""}"""),format.raw/*10.10*/("""
      """),format.raw/*11.7*/("""}"""),format.raw/*11.8*/(""");
    """),format.raw/*12.5*/("""}"""),format.raw/*12.6*/("""
"""),format.raw/*13.1*/("""</script>"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed Mar 13 16:48:06 CET 2019
                  SOURCE: C:/Users/dusti/OneDrive/play_project_1/app/views/util/javascriptDelete.scala.html
                  HASH: 2db075719011841cf949f8014bd6a98b0e57068c
                  MATRIX: 957->1|1053->3|1081->5|1148->45|1176->46|1210->54|1244->61|1272->62|1308->72|1414->151|1442->152|1481->164|1567->223|1596->224|1631->232|1659->233|1694->241|1722->242|1751->244
                  LINES: 28->1|33->1|34->2|35->3|35->3|36->4|36->4|36->4|37->5|39->7|39->7|40->8|42->10|42->10|43->11|43->11|44->12|44->12|45->13
                  -- GENERATED --
              */
          