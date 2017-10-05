
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
        """),_display_(/*11.10*/if(!isMultiple)/*11.25*/ {_display_(Seq[Any](format.raw/*11.27*/("""
        	"""),format.raw/*12.10*/("""<option class="blank" value="null""""),format.raw/*12.44*/("""{"""),format.raw/*12.45*/("""selected"""),format.raw/*12.53*/("""}"""),format.raw/*12.54*/(""">Selecione seu nível</option>
        """)))}),format.raw/*13.10*/("""
        """),_display_(/*14.10*/for((idCJ, isSelected) <- optionMap) yield /*14.46*/ {_display_(Seq[Any](format.raw/*14.48*/("""
          """),format.raw/*15.11*/("""<option id=""""),_display_(/*15.24*/idCJ),format.raw/*15.28*/("""" value=""""),_display_(/*15.38*/idCJ),format.raw/*15.42*/("""" """),_display_(/*15.45*/if(idCJ.toString == field.value.get)/*15.81*/{_display_(Seq[Any](format.raw/*15.82*/("""selected="selected"""")))}),format.raw/*15.102*/(""" """),format.raw/*15.103*/(""">"""),_display_(/*15.105*/isSelected),format.raw/*15.115*/("""</option>
          
        """)))}),format.raw/*17.10*/("""
        
      """),format.raw/*19.7*/("""</select>
      <span class="help-block">"""),_display_(/*20.33*/help),format.raw/*20.37*/("""</span>
      <!--<span class="help-block">"""),_display_(/*21.37*/{field.error.map { error => error.message }}),format.raw/*21.81*/("""</span>-->
      <span class="help-block">"""),_display_(/*22.33*/{field.error.map { error => "Selecione um nível válido" }}),format.raw/*22.91*/("""</span>

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
                  DATE: Thu Oct 05 20:29:26 BRT 2017
                  SOURCE: /home/ufabc/devel/form-captacao-contato-play/app/views/bootstrap3/select.scala.html
                  HASH: ec49f83675e8b83233146110d23bdc6dcddcf231
                  MATRIX: 799->1|1009->115|1039->119|1089->143|1116->162|1155->164|1195->174|1272->225|1285->230|1308->233|1337->236|1362->241|1481->334|1494->339|1517->342|1560->359|1582->373|1612->376|1642->397|1654->402|1683->404|1696->409|1724->415|1762->426|1785->440|1825->442|1876->462|1914->473|1938->488|1978->490|2016->500|2078->534|2107->535|2143->543|2172->544|2242->583|2279->593|2331->629|2371->631|2410->642|2450->655|2475->659|2512->669|2537->673|2567->676|2612->712|2651->713|2703->733|2733->734|2763->736|2795->746|2856->776|2899->792|2968->834|2993->838|3064->882|3129->926|3199->969|3278->1027
                  LINES: 27->1|32->1|34->3|34->3|34->3|34->3|34->3|35->4|35->4|35->4|35->4|35->4|39->8|39->8|39->8|40->9|40->9|40->9|40->9|40->9|40->9|40->9|40->9|41->10|41->10|41->10|41->10|42->11|42->11|42->11|43->12|43->12|43->12|43->12|43->12|44->13|45->14|45->14|45->14|46->15|46->15|46->15|46->15|46->15|46->15|46->15|46->15|46->15|46->15|46->15|46->15|48->17|50->19|51->20|51->20|52->21|52->21|53->22|53->22
                  -- GENERATED --
              */
          