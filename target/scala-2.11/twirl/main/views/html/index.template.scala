
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
"""),_display_(/*6.2*/main("Inscrição do Workshop do PlayFramework")/*6.48*/ {_display_(Seq[Any](format.raw/*6.50*/("""
"""),format.raw/*7.1*/("""<div class="container">
    <div class="well">
        """),_display_(/*9.10*/form(routes.InteressadoCRUD.add(), 'class -> "form-vertical")/*9.71*/ {_display_(Seq[Any](format.raw/*9.73*/("""
            """),_display_(/*10.14*/fieldset(intForm)),format.raw/*10.31*/("""

        """)))}),format.raw/*12.10*/("""
    """),format.raw/*13.5*/("""</div>
    """),_display_(/*14.6*/if(flash.containsKey("success"))/*14.38*/ {_display_(Seq[Any](format.raw/*14.40*/("""
    """),format.raw/*15.5*/("""<div class="well">
        <div id="success-message" class="text-success">
            """),_display_(/*17.14*/flash/*17.19*/.get("success")),format.raw/*17.34*/("""
        """),format.raw/*18.9*/("""</div>
    </div>
    """)))}),format.raw/*20.6*/("""
    """),_display_(/*21.6*/if(flash.containsKey("error"))/*21.36*/ {_display_(Seq[Any](format.raw/*21.38*/("""
    """),format.raw/*22.5*/("""<div class="well">
        <div id="error-message" class="text-danger">
            """),_display_(/*24.14*/flash/*24.19*/.get("error")),format.raw/*24.32*/("""
        """),format.raw/*25.9*/("""</div>
    </div>
    """)))}),format.raw/*27.6*/("""





"""),format.raw/*33.1*/("""</div>
""")))}),format.raw/*34.2*/("""
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
                  DATE: Wed May 17 23:40:05 BRT 2017
                  SOURCE: /Users/danielgoncalvesti/devel/captacao-email-play/app/views/index.scala.html
                  HASH: 88aa79117f2357b5cdededfe5687d607105df605
                  MATRIX: 763->1|949->46|977->97|1004->99|1058->145|1097->147|1124->148|1206->204|1275->265|1314->267|1355->281|1393->298|1435->309|1467->314|1505->326|1546->358|1586->360|1618->365|1733->453|1747->458|1783->473|1819->482|1872->505|1904->511|1943->541|1983->543|2015->548|2127->633|2141->638|2175->651|2211->660|2264->683|2297->689|2335->697
                  LINES: 27->1|33->1|35->5|36->6|36->6|36->6|37->7|39->9|39->9|39->9|40->10|40->10|42->12|43->13|44->14|44->14|44->14|45->15|47->17|47->17|47->17|48->18|50->20|51->21|51->21|51->21|52->22|54->24|54->24|54->24|55->25|57->27|63->33|64->34
                  -- GENERATED --
              */
          