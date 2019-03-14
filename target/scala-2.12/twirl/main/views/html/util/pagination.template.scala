
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

object pagination extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template5[Boolean,String,Boolean,String,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(hasPrev: Boolean, prevPageLink: String
, hasNext: Boolean, nextPageLink: String
, XtoYofZ: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*3.19*/("""

"""),format.raw/*5.1*/("""<ul class="pagination justify-content-center">
  """),_display_(/*6.4*/if(hasPrev)/*6.15*/ {_display_(Seq[Any](format.raw/*6.17*/("""
  """),format.raw/*7.3*/("""<li class="page-item prev">
    <a class="page-link" href=""""),_display_(/*8.33*/prevPageLink),format.raw/*8.45*/(""""><i class="fas fa-arrow-left"></i></a>
  </li>
  """)))}/*10.5*/else/*10.10*/{_display_(Seq[Any](format.raw/*10.11*/("""
  """),format.raw/*11.3*/("""<li class="page-item prev disabled">
    <a class="page-link"><i class="fas fa-arrow-left"></i></a>
  </li>
  """)))}),format.raw/*14.4*/("""
  """),format.raw/*15.3*/("""<li class="page-item active current">
    <a class="page-link">"""),_display_(/*16.27*/XtoYofZ),format.raw/*16.34*/("""</a>
  </li>
  """),_display_(/*18.4*/if(hasNext)/*18.15*/ {_display_(Seq[Any](format.raw/*18.17*/("""
  """),format.raw/*19.3*/("""<li class="page-item next">
    <a class="page-link" href=""""),_display_(/*20.33*/nextPageLink),format.raw/*20.45*/(""""><i class="fas fa-arrow-right"></i></a>
  </li>
  """)))}/*22.5*/else/*22.10*/{_display_(Seq[Any](format.raw/*22.11*/("""
  """),format.raw/*23.3*/("""<li class="page-item next disabled">
    <a class="page-link"><i class="fas fa-arrow-right"></i></a>
  </li>
  """)))}),format.raw/*26.4*/("""
"""),format.raw/*27.1*/("""</ul>"""))
      }
    }
  }

  def render(hasPrev:Boolean,prevPageLink:String,hasNext:Boolean,nextPageLink:String,XtoYofZ:String): play.twirl.api.HtmlFormat.Appendable = apply(hasPrev,prevPageLink,hasNext,nextPageLink,XtoYofZ)

  def f:((Boolean,String,Boolean,String,String) => play.twirl.api.HtmlFormat.Appendable) = (hasPrev,prevPageLink,hasNext,nextPageLink,XtoYofZ) => apply(hasPrev,prevPageLink,hasNext,nextPageLink,XtoYofZ)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed Mar 13 16:55:28 CET 2019
                  SOURCE: C:/Users/dusti/OneDrive/play_project_1/app/views/util/pagination.scala.html
                  HASH: b875b4164b03ab632a792fc84c33a309aff7db50
                  MATRIX: 988->1|1184->102|1214->106|1290->157|1309->168|1348->170|1378->174|1465->235|1497->247|1568->301|1581->306|1620->307|1651->311|1795->425|1826->429|1918->494|1946->501|1990->519|2010->530|2050->532|2081->536|2169->597|2202->609|2274->664|2287->669|2326->670|2357->674|2502->789|2531->791
                  LINES: 28->1|35->3|37->5|38->6|38->6|38->6|39->7|40->8|40->8|42->10|42->10|42->10|43->11|46->14|47->15|48->16|48->16|50->18|50->18|50->18|51->19|52->20|52->20|54->22|54->22|54->22|55->23|58->26|59->27
                  -- GENERATED --
              */
          