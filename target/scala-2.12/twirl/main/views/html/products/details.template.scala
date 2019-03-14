
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

object details extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Form[Product],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(productForm: Form[Product]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import helper._


Seq[Any](format.raw/*1.30*/("""

"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/main("Product form")/*5.22*/ {_display_(Seq[Any](format.raw/*5.24*/("""
"""),format.raw/*6.1*/("""<div>
<h1><div id="form_header">Product form</div></h1>
<div>
  """),_display_(/*9.4*/helper/*9.10*/.form(action = routes.Products.save(), 'enctype -> "multipart/form-data")/*9.83*/ {_display_(Seq[Any](format.raw/*9.85*/("""
  """),format.raw/*10.3*/("""<fieldset id="form_fieldset">
    <legend>
      Product
      """),_display_(/*13.8*/(productForm("name").getValue().orElse("New"))),format.raw/*13.54*/("""
    """),format.raw/*14.5*/("""</legend>
    """),_display_(/*15.6*/helper/*15.12*/.CSRF.formField),format.raw/*15.27*/("""
    """),format.raw/*16.5*/("""<input type="hidden" value=""""),_display_(/*16.34*/productForm("id")/*16.51*/.value.orElse("")),format.raw/*16.68*/("""" name="id"/>
    <input type="hidden" value=""""),_display_(/*17.34*/productForm("active")/*17.55*/.value.orElse("true")),format.raw/*17.76*/("""" name="id"/>

    <div class="form-group">
    """),_display_(/*20.6*/helper/*20.12*/.inputText(productForm("ean"), '_label -> "EAN", '_showConstraints -> false, 'class -> "form-control")),format.raw/*20.114*/("""
    """),format.raw/*21.5*/("""</div>
    <div class="form-group">
    """),_display_(/*23.6*/helper/*23.12*/.inputText(productForm("name"), '_label -> "Name", '_showConstraints -> false, 'class -> "form-control")),format.raw/*23.116*/("""
    """),format.raw/*24.5*/("""</div>
    <div class="form-group">
    """),_display_(/*26.6*/helper/*26.12*/.textarea(productForm("description"), '_label -> "Description", 'class -> "form-control")),format.raw/*26.101*/("""
    """),format.raw/*27.5*/("""</div>
    <div class="form-group">
      <dl class=" " id="description_field">
        <dt><label for="picture">Picture</label></dt>
        <dd>
          <input type="file" id="picture" name="picture">
        </dd>
      </dl>
      """),_display_(/*35.8*/if(!productForm("pictureFileName").value().isEmpty())/*35.61*/{_display_(Seq[Any](format.raw/*35.62*/("""
        """),format.raw/*36.9*/("""<div class="control-group">
          <div class="controls">
            <img
              style="position:relative; left:50px;height:80px"
              src=""""),_display_(/*40.21*/("/assets/images/" + productForm("pictureFileName").value().orElse(""))),format.raw/*40.92*/("""">
          </div>
        </div>
      """)))}),format.raw/*43.8*/("""
    """),format.raw/*44.5*/("""</div>

    """),format.raw/*46.66*/("""
    """),format.raw/*47.5*/("""<div class="control-group">
      <div class="controls">
        """),format.raw/*57.11*/("""
        """),format.raw/*58.9*/("""<div class="form-check form-check-inline">
          <input class="form-check-input" id="tags[0].id" name="tags[0].id" value="1" type="checkbox"
            """),_display_(/*60.14*/for(i <- 0 to 2) yield /*60.30*/ {_display_(Seq[Any](format.raw/*60.32*/("""
              """),_display_(/*61.16*/if(productForm("tags[" + i + "].id").getValue().orElse("")=="1")/*61.80*/{_display_(Seq[Any](format.raw/*61.81*/(""" """),format.raw/*61.82*/("""checked """)))}),format.raw/*61.91*/("""
            """)))}),format.raw/*62.14*/("""> <label class="form-check-label" for="tags[0].id">lightweight</label>
        </div>
        <div class="form-check form-check-inline">
          <input class="form-check-input" id="tags[1].id" name="tags[1].id" value="2" type="checkbox"
            """),_display_(/*66.14*/for(i <- 0 to 2) yield /*66.30*/ {_display_(Seq[Any](format.raw/*66.32*/("""
              """),_display_(/*67.16*/if(productForm("tags[" + i + "].id").getValue().orElse("")=="2")/*67.80*/{_display_(Seq[Any](format.raw/*67.81*/(""" """),format.raw/*67.82*/("""checked """)))}),format.raw/*67.91*/("""
            """)))}),format.raw/*68.14*/("""> <label class="form-check-label" for="tags[1].id">metal</label>
        </div>
        <div class="form-check form-check-inline">
          <input class="form-check-input" id="tags[2].id" name="tags[2].id" value="3" type="checkbox"
            """),_display_(/*72.14*/for(i <- 0 to 2) yield /*72.30*/ {_display_(Seq[Any](format.raw/*72.32*/("""
              """),_display_(/*73.16*/if(productForm("tags[" + i + "].id").getValue().orElse("")=="3")/*73.80*/{_display_(Seq[Any](format.raw/*73.81*/(""" """),format.raw/*73.82*/("""checked """)))}),format.raw/*73.91*/("""
          """)))}),format.raw/*74.12*/("""> <label class="form-check-label" for="tags[2].id">plastic</label>
        </div>
      </div>
    </div>
  </fieldset>
  <div class="control-group">
    <div class="controls">
      <button value="submit" class="btn btn-primary icon-save">
      <i class="far fa-save"> Save</i>
    </button>
      <a id="cancel" class="btn btn-secondary" href=""""),_display_(/*84.55*/routes/*84.61*/.Products.list()),format.raw/*84.77*/("""">
        Cancel
      </a>
    </div>
  </div>
  """)))}),format.raw/*89.4*/("""
"""),format.raw/*90.1*/("""</div>
</div>
""")))}))
      }
    }
  }

  def render(productForm:Form[Product]): play.twirl.api.HtmlFormat.Appendable = apply(productForm)

  def f:((Form[Product]) => play.twirl.api.HtmlFormat.Appendable) = (productForm) => apply(productForm)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Mar 14 01:21:45 CET 2019
                  SOURCE: C:/Users/dusti/OneDrive/play_project_1/app/views/products/details.scala.html
                  HASH: d1c1d6c3ec56fda2a04b88a5775812f3772367bb
                  MATRIX: 966->1|1067->34|1112->29|1142->51|1170->54|1198->74|1237->76|1265->78|1358->146|1372->152|1453->225|1492->227|1523->231|1616->298|1683->344|1716->350|1758->366|1773->372|1809->387|1842->393|1898->422|1924->439|1962->456|2037->504|2067->525|2109->546|2187->598|2202->604|2326->706|2359->712|2428->755|2443->761|2569->865|2602->871|2671->914|2686->920|2797->1009|2830->1015|3102->1261|3164->1314|3203->1315|3240->1325|3432->1490|3524->1561|3599->1606|3632->1612|3674->1687|3707->1693|3802->2410|3839->2420|4026->2580|4058->2596|4098->2598|4142->2615|4215->2679|4254->2680|4283->2681|4323->2690|4369->2705|4652->2961|4684->2977|4724->2979|4768->2996|4841->3060|4880->3061|4909->3062|4949->3071|4995->3086|5272->3336|5304->3352|5344->3354|5388->3371|5461->3435|5500->3436|5529->3437|5569->3446|5613->3459|5998->3817|6013->3823|6050->3839|6137->3896|6166->3898
                  LINES: 28->1|31->3|34->1|36->4|37->5|37->5|37->5|38->6|41->9|41->9|41->9|41->9|42->10|45->13|45->13|46->14|47->15|47->15|47->15|48->16|48->16|48->16|48->16|49->17|49->17|49->17|52->20|52->20|52->20|53->21|55->23|55->23|55->23|56->24|58->26|58->26|58->26|59->27|67->35|67->35|67->35|68->36|72->40|72->40|75->43|76->44|78->46|79->47|81->57|82->58|84->60|84->60|84->60|85->61|85->61|85->61|85->61|85->61|86->62|90->66|90->66|90->66|91->67|91->67|91->67|91->67|91->67|92->68|96->72|96->72|96->72|97->73|97->73|97->73|97->73|97->73|98->74|108->84|108->84|108->84|113->89|114->90
                  -- GENERATED --
              */
          