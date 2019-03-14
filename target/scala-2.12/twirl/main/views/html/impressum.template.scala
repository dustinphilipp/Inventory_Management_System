
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

object impressum extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*1.2*/main("Impressum")/*1.19*/ {_display_(Seq[Any](format.raw/*1.21*/("""
"""),format.raw/*2.1*/("""<div class="card text-center mx-auto" style="width: 20rem;">
  <div class="card-body">
    <h5 class="card-title">Dustin Philipp</h5>
    <p class="card-text">Learning by doing.<br>Always looking for the next challenge!</p>
    <a href="mailto:dustinphilipp@hotmail.de" class="card-link">dustinphilipp@hotmail.de</a>
  </div>
</div>
""")))}))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed Mar 13 19:45:23 CET 2019
                  SOURCE: C:/Users/dusti/OneDrive/play_project_1/app/views/impressum.scala.html
                  HASH: 7f7740c795f50512d971ad2c40faad8c111f6640
                  MATRIX: 1034->1|1059->18|1098->20|1126->22
                  LINES: 33->1|33->1|33->1|34->2
                  -- GENERATED --
              */
          