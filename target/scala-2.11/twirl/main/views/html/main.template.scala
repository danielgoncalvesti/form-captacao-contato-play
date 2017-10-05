
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object main_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._

class main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.32*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>
<html>
<head>
    <title>Curso de Scala</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href=""""),_display_(/*8.35*/routes/*8.41*/.Assets.at("stylesheets/bootstrap.min.css")),format.raw/*8.84*/("""">

    <!--  Load site-specific customizations after bootstrap. -->
    <link rel="stylesheet" media="screen" href=""""),_display_(/*11.50*/routes/*11.56*/.Assets.at("stylesheets/main.css")),format.raw/*11.90*/("""">
    <link rel="shortcut icon" type="image/png" href=""""),_display_(/*12.55*/routes/*12.61*/.Assets.at("images/favicon.png")),format.raw/*12.93*/("""">

    <!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
    <script src="http://cdnjs.cloudflare.com/ajax/libs/html5shiv/3.7.2/html5shiv.js"></script>
    <script src="http://cdnjs.cloudflare.com/ajax/libs/respond.js/1.4.2/respond.js"></script>
    <![endif]-->
</head>
<body>
<div class="navbar navbar-inverse" role="navigation">
    <div class="container">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                <!--  Display three horizontal lines when navbar collapsed. -->
                <span class="icon-bar"></span> <span class="icon-bar"></span> <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="/">Curso de Scala</a>
        </div>
    </div>
</div>

"""),_display_(/*33.2*/content),format.raw/*33.9*/("""
"""),format.raw/*34.1*/("""<script src=""""),_display_(/*34.15*/routes/*34.21*/.Assets.at("javascripts/jquery.min.js")),format.raw/*34.60*/(""""></script>
<script src=""""),_display_(/*35.15*/routes/*35.21*/.Assets.at("javascripts/bootstrap.min.js")),format.raw/*35.63*/(""""></script>

<!-- Enable tooltips. Used primarily to validate that JQuery + Bootstrap JS are loaded. Remove this script if you don't want tooltips. -->
<script type="text/javascript">
    jQuery(function ($) """),format.raw/*39.25*/("""{"""),format.raw/*39.26*/("""
        """),format.raw/*40.9*/("""$("[rel='tooltip']").tooltip()
    """),format.raw/*41.5*/("""}"""),format.raw/*41.6*/(""");
    </script>
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


}

/**/
object main extends main_Scope0.main
              /*
                  -- GENERATED --
                  DATE: Thu Oct 05 00:40:08 BRT 2017
                  SOURCE: /Users/danielgoncalvesti/devel/form-captacao-contato-play/app/views/main.scala.html
                  HASH: dd80490eb63249fef8ec6e47b4b51b2d55bcf804
                  MATRIX: 748->1|873->31|901->33|1100->206|1114->212|1177->255|1322->373|1337->379|1392->413|1476->470|1491->476|1544->508|2443->1381|2470->1388|2498->1389|2539->1403|2554->1409|2614->1448|2667->1474|2682->1480|2745->1522|2981->1730|3010->1731|3046->1740|3108->1775|3136->1776
                  LINES: 27->1|32->1|34->3|39->8|39->8|39->8|42->11|42->11|42->11|43->12|43->12|43->12|64->33|64->33|65->34|65->34|65->34|65->34|66->35|66->35|66->35|70->39|70->39|71->40|72->41|72->41
                  -- GENERATED --
              */
          