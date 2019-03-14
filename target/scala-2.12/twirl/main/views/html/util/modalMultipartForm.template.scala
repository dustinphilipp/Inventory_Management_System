
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

object modalMultipartForm extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(modalActionPost: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.27*/("""
"""),format.raw/*2.1*/("""<!-- Modal -->
<div class="modal fade" id="modal" tabindex="-1" role="dialog" aria-labelledby='modal_title'>
  <div class="modal-dialog">
    <div class="modal-content">
      <div class="modal-header">
        <h4 class="modal-title" id='modal_title'></h4>
        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
      </div>
      <form id="modalForm" method="POST" action=""""),_display_(/*10.51*/modalActionPost),format.raw/*10.66*/("""" enctype="multipart/form-data">
        <div class="modal-body" id="modal_body">
          <!-- Content is loaded via script -->
        </div>
        <div class="modal-footer">
          <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
          <button type="submit" class="btn btn-primary">Save changes</button>
        </div>
      </form>
    </div>
  </div>
</div>"""))
      }
    }
  }

  def render(modalActionPost:String): play.twirl.api.HtmlFormat.Appendable = apply(modalActionPost)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (modalActionPost) => apply(modalActionPost)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed Mar 13 20:53:36 CET 2019
                  SOURCE: C:/Users/dusti/OneDrive/play_project_1/app/views/util/modalMultipartForm.scala.html
                  HASH: 513343d50ef1589cf06ce9361fdc7af7ed4eb676
                  MATRIX: 966->1|1086->26|1114->28|1603->490|1639->505
                  LINES: 28->1|33->1|34->2|42->10|42->10
                  -- GENERATED --
              */
          