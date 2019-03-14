
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

object main extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /*
* This template is called from the `index` template. This template
* handles the rendering of the page header and body tags. It takes
* two arguments, a `String` for the title of the page and an `Html`
* object to insert into the body of the page.
*/
  def apply/*7.2*/(title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*7.32*/("""

"""),format.raw/*9.1*/("""<!DOCTYPE html>
<html lang="en">
<head>
  """),format.raw/*12.56*/("""
  """),format.raw/*13.3*/("""<title>"""),_display_(/*13.11*/title),format.raw/*13.16*/("""</title>
  <meta name="viewport" content="width=device-width, initial-scale=1.0">

  <link href=""""),_display_(/*16.16*/routes/*16.22*/.Assets.versioned("bootstrap/css/bootstrap.min.css")),format.raw/*16.74*/("""" rel="stylesheet" media="screen">
  <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.7.2/css/all.css" integrity="sha384-fnmOCqbTlWIlj8LyTjo7mOUStjsKC4pOpQbqyi7RrhN7udi9RwhKkMHpvLbHG9Sr" crossorigin="anonymous">
  <link rel="stylesheet" media="screen" href=""""),_display_(/*18.48*/routes/*18.54*/.Assets.versioned("stylesheets/main.css")),format.raw/*18.95*/("""">
  <link rel="shortcut icon" type="image/png" href=""""),_display_(/*19.53*/routes/*19.59*/.Assets.versioned("images/favicon.png")),format.raw/*19.98*/("""">

  <script src=""""),_display_(/*21.17*/routes/*21.23*/.Assets.versioned("javascripts/jquery-3.3.1.min.js")),format.raw/*21.75*/("""" type="text/javascript"></script>
  <script src=""""),_display_(/*22.17*/routes/*22.23*/.Assets.versioned("bootstrap/js/bootstrap.js")),format.raw/*22.69*/("""" type="text/javascript"></script>
</head>
<body>
  """),_display_(/*25.4*/navigation()),format.raw/*25.16*/("""
  """),format.raw/*26.3*/("""<div class="container-fluid">
    <div class="row mt-3">
      <div class="col">
        """),_display_(/*29.10*/if(flash.containsKey("success"))/*29.42*/{_display_(Seq[Any](format.raw/*29.43*/("""
        """),format.raw/*30.9*/("""<div class="alert alert-success">
          """),_display_(/*31.12*/flash/*31.17*/.get("success")),format.raw/*31.32*/("""
        """),format.raw/*32.9*/("""</div>
        """)))}),format.raw/*33.10*/("""
        """),_display_(/*34.10*/if(flash.containsKey("error"))/*34.40*/{_display_(Seq[Any](format.raw/*34.41*/("""
        """),format.raw/*35.9*/("""<div class="alert alert-danger">
          """),_display_(/*36.12*/flash/*36.17*/.get("error")),format.raw/*36.30*/("""
        """),format.raw/*37.9*/("""</div>
        """)))}),format.raw/*38.10*/("""
        """),_display_(/*39.10*/content),format.raw/*39.17*/("""
      """),format.raw/*40.7*/("""</div>
    </div>
    <div class="row mt-3"></div>
  </div>
  """),_display_(/*44.4*/footer()),format.raw/*44.12*/("""
  """),format.raw/*45.3*/("""<script src=""""),_display_(/*45.17*/routes/*45.23*/.Assets.versioned("javascripts/main.js")),format.raw/*45.63*/("""" type="text/javascript"></script>
    </body>
</html>
"""))
      }
    }
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed Mar 13 19:50:50 CET 2019
                  SOURCE: C:/Users/dusti/OneDrive/play_project_1/app/views/main.scala.html
                  HASH: f2f6c95ef2501a33dfba956358d8f838c47c29ff
                  MATRIX: 1206->261|1331->291|1361->295|1434->393|1465->397|1500->405|1526->410|1654->511|1669->517|1742->569|2050->850|2065->856|2127->897|2210->953|2225->959|2285->998|2334->1020|2349->1026|2422->1078|2501->1130|2516->1136|2583->1182|2665->1238|2698->1250|2729->1254|2849->1347|2890->1379|2929->1380|2966->1390|3039->1436|3053->1441|3089->1456|3126->1466|3174->1483|3212->1494|3251->1524|3290->1525|3327->1535|3399->1580|3413->1585|3447->1598|3484->1608|3532->1625|3570->1636|3598->1643|3633->1651|3726->1718|3755->1726|3786->1730|3827->1744|3842->1750|3903->1790
                  LINES: 33->7|38->7|40->9|43->12|44->13|44->13|44->13|47->16|47->16|47->16|49->18|49->18|49->18|50->19|50->19|50->19|52->21|52->21|52->21|53->22|53->22|53->22|56->25|56->25|57->26|60->29|60->29|60->29|61->30|62->31|62->31|62->31|63->32|64->33|65->34|65->34|65->34|66->35|67->36|67->36|67->36|68->37|69->38|70->39|70->39|71->40|75->44|75->44|76->45|76->45|76->45|76->45
                  -- GENERATED --
              */
          