
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

object footer extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.4*/("""
"""),format.raw/*2.1*/("""<footer>
  <div class="container-fluid text-white bg-dark">
    <div class="row justify-content-center">
      <a class="text-muted" href=""""),_display_(/*5.36*/routes/*5.42*/.HomeController.impressum()),format.raw/*5.69*/("""">Impressum</a>
    </div>
    <div class="row justify-content-center">
      Webapp by Dustin Philipp
    </div>
  </div>
</footer>"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed Mar 13 19:45:31 CET 2019
                  SOURCE: C:/Users/dusti/OneDrive/play_project_1/app/views/footer.scala.html
                  HASH: 84f96aa7f091e8447104a05ae7c89182748cd84e
                  MATRIX: 942->1|1038->3|1066->5|1235->148|1249->154|1296->181
                  LINES: 28->1|33->1|34->2|37->5|37->5|37->5
                  -- GENERATED --
              */
          