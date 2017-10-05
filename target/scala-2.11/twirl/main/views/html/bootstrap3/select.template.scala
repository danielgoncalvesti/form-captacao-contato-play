
package views.html.bootstrap3

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object select_Scope0 {
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

class select extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template5[Field,String,Map[String, String],Boolean,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(field: Field, label: String = "CHANGEME", optionMap: Map[String, String], isMultiple: Boolean, help: String = ""):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.116*/("""

  """),format.raw/*3.3*/("""<div class="form-group """),_display_(/*3.27*/if(field.hasErrors)/*3.46*/ {_display_(Seq[Any](format.raw/*3.48*/("""has-error""")))}),format.raw/*3.58*/("""">
    <label class="col-sm-2 control-label" for=""""),_display_(/*4.49*/field/*4.54*/.id),format.raw/*4.57*/("""">"""),_display_(/*4.60*/label),format.raw/*4.65*/("""</label>
    <div class="col-sm-10">
      <select
        class="form-control"
        id=""""),_display_(/*8.14*/field/*8.19*/.id),format.raw/*8.22*/(""""
        name=""""),_display_(/*9.16*/if(isMultiple)/*9.30*/ {_display_(_display_(/*9.33*/(field.name + "[]")))}/*9.54*/else/*9.59*/{_display_(_display_(/*9.61*/field/*9.66*/.name))}),format.raw/*9.72*/(""""
        """),_display_(/*10.10*/if(isMultiple)/*10.24*/ {_display_(Seq[Any](format.raw/*10.26*/("""multiple="multiple"""")))}),format.raw/*10.46*/(""">
        """),_display_(/*11.10*/if(!isMultiple)/*11.25*/ {_display_(Seq[Any](format.raw/*11.27*/("""<option class="blank" value="null""""),format.raw/*11.61*/("""{"""),format.raw/*11.62*/("""selected"""),format.raw/*11.70*/("""}"""),format.raw/*11.71*/(""">Selecione seu nível</option>""")))}),format.raw/*11.101*/("""
        """),_display_(/*12.10*/for((idCJ, isSelected) <- optionMap) yield /*12.46*/ {_display_(Seq[Any](format.raw/*12.48*/("""
          """),format.raw/*13.11*/("""<option id=""""),_display_(/*13.24*/idCJ),format.raw/*13.28*/("""" value=""""),_display_(/*13.38*/idCJ),format.raw/*13.42*/("""">"""),_display_(/*13.45*/isSelected),format.raw/*13.55*/("""</option>
        """)))}),format.raw/*14.10*/("""

      """),format.raw/*16.7*/("""</select>
      <span class="help-block">"""),_display_(/*17.33*/help),format.raw/*17.37*/("""</span>
      <!--<span class="help-block">"""),_display_(/*18.37*/{field.error.map { error => error.message }}),format.raw/*18.81*/("""</span>-->
      <span class="help-block">"""),_display_(/*19.33*/{field.error.map { error => "Selecione um nível válido" }}),format.raw/*19.91*/("""</span>

    </div>
  </div>
"""))
      }
    }
  }

  def render(field:Field,label:String,optionMap:Map[String, String],isMultiple:Boolean,help:String): play.twirl.api.HtmlFormat.Appendable = apply(field,label,optionMap,isMultiple,help)

  def f:((Field,String,Map[String, String],Boolean,String) => play.twirl.api.HtmlFormat.Appendable) = (field,label,optionMap,isMultiple,help) => apply(field,label,optionMap,isMultiple,help)

  def ref: this.type = this

}


}

/**/
object select extends select_Scope0.select
              /*
                  -- GENERATED --
                  DATE: Wed Oct 04 23:27:50 BRT 2017
                  SOURCE: /Users/danielgoncalvesti/devel/form-captacao-contato-play/app/views/bootstrap3/select.scala.html
                  HASH: bc7063e66736db8538b1df40345f292878ed5d83
                  MATRIX: 799->1|1009->115|1039->119|1089->143|1116->162|1155->164|1195->174|1272->225|1285->230|1308->233|1337->236|1362->241|1481->334|1494->339|1517->342|1560->359|1582->373|1612->376|1642->397|1654->402|1683->404|1696->409|1724->415|1762->426|1785->440|1825->442|1876->462|1914->473|1938->488|1978->490|2040->524|2069->525|2105->533|2134->534|2196->564|2233->574|2285->610|2325->612|2364->623|2404->636|2429->640|2466->650|2491->654|2521->657|2552->667|2602->686|2637->694|2706->736|2731->740|2802->784|2867->828|2937->871|3016->929
                  LINES: 27->1|32->1|34->3|34->3|34->3|34->3|34->3|35->4|35->4|35->4|35->4|35->4|39->8|39->8|39->8|40->9|40->9|40->9|40->9|40->9|40->9|40->9|40->9|41->10|41->10|41->10|41->10|42->11|42->11|42->11|42->11|42->11|42->11|42->11|42->11|43->12|43->12|43->12|44->13|44->13|44->13|44->13|44->13|44->13|44->13|45->14|47->16|48->17|48->17|49->18|49->18|50->19|50->19
                  -- GENERATED --
              */
          