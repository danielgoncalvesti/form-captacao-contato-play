
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object index_Scope0 {
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

class index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,Form[Interessado],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message: String, intForm: Form[Interessado]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import helper._
import views.html.bootstrap3._

Seq[Any](format.raw/*1.47*/("""

"""),format.raw/*5.1*/("""

"""),_display_(/*7.2*/main("Inscrição do Workshop do PlayFramework")/*7.48*/ {_display_(Seq[Any](format.raw/*7.50*/("""
"""),format.raw/*8.1*/("""<div class="container">
    """),_display_(/*9.6*/if(flash.containsKey("success"))/*9.38*/ {_display_(Seq[Any](format.raw/*9.40*/("""
    """),format.raw/*10.5*/("""<div class="well">
        <div id="success-message" class="text-success">
            """),_display_(/*12.14*/flash/*12.19*/.get("success")),format.raw/*12.34*/("""
        """),format.raw/*13.9*/("""</div>
    </div>
    """)))}),format.raw/*15.6*/("""
    """),_display_(/*16.6*/if(flash.containsKey("error"))/*16.36*/ {_display_(Seq[Any](format.raw/*16.38*/("""
    """),format.raw/*17.5*/("""<div class="well">
        <div id="error-message" class="text-danger">
            """),_display_(/*19.14*/flash/*19.19*/.get("error")),format.raw/*19.32*/("""
        """),format.raw/*20.9*/("""</div>
    </div>
    """)))}),format.raw/*22.6*/("""

    """),format.raw/*24.5*/("""<div class="well">
        """),_display_(/*25.10*/form(routes.InteressadoCRUD.add(), 'class -> "form-vertical")/*25.71*/ {_display_(Seq[Any](format.raw/*25.73*/("""
            """),_display_(/*26.14*/fieldset(intForm)),format.raw/*26.31*/("""
        """)))}),format.raw/*27.10*/("""
    """),format.raw/*28.5*/("""</div>

</div>
""")))}),format.raw/*31.2*/("""
"""))
      }
    }
  }

  def render(message:String,intForm:Form[Interessado]): play.twirl.api.HtmlFormat.Appendable = apply(message,intForm)

  def f:((String,Form[Interessado]) => play.twirl.api.HtmlFormat.Appendable) = (message,intForm) => apply(message,intForm)

  def ref: this.type = this

}


}

/**/
object index extends index_Scope0.index
              /*
                  -- GENERATED --
                  DATE: Thu Oct 05 20:01:36 BRT 2017
                  SOURCE: /home/ufabc/devel/form-captacao-contato-play/app/views/index.scala.html
                  HASH: d58278508db6065ae38d4a64cec13ee4ed01f2cd
                  MATRIX: 763->1|949->46|977->97|1005->100|1059->146|1098->148|1125->149|1179->178|1219->210|1258->212|1290->217|1405->305|1419->310|1455->325|1491->334|1544->357|1576->363|1615->393|1655->395|1687->400|1799->485|1813->490|1847->503|1883->512|1936->535|1969->541|2024->569|2094->630|2134->632|2175->646|2213->663|2254->673|2286->678|2332->694
                  LINES: 27->1|33->1|35->5|37->7|37->7|37->7|38->8|39->9|39->9|39->9|40->10|42->12|42->12|42->12|43->13|45->15|46->16|46->16|46->16|47->17|49->19|49->19|49->19|50->20|52->22|54->24|55->25|55->25|55->25|56->26|56->26|57->27|58->28|61->31
                  -- GENERATED --
              */
          