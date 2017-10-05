
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
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0,target-densitydpi=device-dpi, user-scalable=no" />
    <link rel="stylesheet" href=""""),_display_(/*8.35*/routes/*8.41*/.Assets.at("stylesheets/bootstrap.min.css")),format.raw/*8.84*/("""">
    <link rel="stylesheet" href=""""),_display_(/*9.35*/routes/*9.41*/.Assets.at("stylesheets/bootflat.min.css")),format.raw/*9.83*/("""">
    

    <!--  Load site-specific customizations after bootstrap. -->
    <link rel="stylesheet" media="screen" href=""""),_display_(/*13.50*/routes/*13.56*/.Assets.at("stylesheets/main.css")),format.raw/*13.90*/("""">
    <link rel="shortcut icon" type="image/png" href=""""),_display_(/*14.55*/routes/*14.61*/.Assets.at("images/favicon.png")),format.raw/*14.93*/("""">

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
        <!--    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse"> -->
                <!--  Display three horizontal lines when navbar collapsed. -->
        <!--           <span class="icon-bar"></span> <span class="icon-bar"></span> <span class="icon-bar"></span> -->
        <!--     </button>  -->
            <a class="navbar-brand" href="/">Curso de Scala</a>
        </div>
    </div>
</div>

"""),_display_(/*35.2*/content),format.raw/*35.9*/("""
"""),format.raw/*36.1*/("""<script src=""""),_display_(/*36.15*/routes/*36.21*/.Assets.at("javascripts/jquery.min.js")),format.raw/*36.60*/(""""></script>
<script src=""""),_display_(/*37.15*/routes/*37.21*/.Assets.at("javascripts/bootstrap.min.js")),format.raw/*37.63*/(""""></script>

<!-- Enable tooltips. Used primarily to validate that JQuery + Bootstrap JS are loaded. Remove this script if you don't want tooltips. -->
<script type="text/javascript">
    jQuery(function ($) """),format.raw/*41.25*/("""{"""),format.raw/*41.26*/("""
        """),format.raw/*42.9*/("""$("[rel='tooltip']").tooltip()
    """),format.raw/*43.5*/("""}"""),format.raw/*43.6*/(""");
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
                  DATE: Thu Oct 05 11:16:02 BRT 2017
                  SOURCE: /home/ufabc/devel/form-captacao-contato-play/app/views/main.scala.html
                  HASH: f513990165a9436307139e4acd8c589b75d3cdc5
                  MATRIX: 748->1|873->31|901->33|1187->293|1201->299|1264->342|1327->379|1341->385|1403->427|1553->550|1568->556|1623->590|1707->647|1722->653|1775->685|2703->1587|2730->1594|2758->1595|2799->1609|2814->1615|2874->1654|2927->1680|2942->1686|3005->1728|3241->1936|3270->1937|3306->1946|3368->1981|3396->1982
                  LINES: 27->1|32->1|34->3|39->8|39->8|39->8|40->9|40->9|40->9|44->13|44->13|44->13|45->14|45->14|45->14|66->35|66->35|67->36|67->36|67->36|67->36|68->37|68->37|68->37|72->41|72->41|73->42|74->43|74->43
                  -- GENERATED --
              */
          