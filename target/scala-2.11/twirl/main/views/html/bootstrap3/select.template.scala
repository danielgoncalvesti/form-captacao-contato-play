
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
    """),_display_(/*6.6*/field/*6.11*/.value.getOrElse("0")),format.raw/*6.32*/("""
      """),format.raw/*7.7*/("""<select
        class="form-control"
        id=""""),_display_(/*9.14*/field/*9.19*/.id),format.raw/*9.22*/(""""
        name=""""),_display_(/*10.16*/if(isMultiple)/*10.30*/ {_display_(_display_(/*10.33*/(field.name + "[]")))}/*10.54*/else/*10.59*/{_display_(_display_(/*10.61*/field/*10.66*/.name))}),format.raw/*10.72*/(""""
        """),_display_(/*11.10*/if(isMultiple)/*11.24*/ {_display_(Seq[Any](format.raw/*11.26*/("""multiple="multiple"""")))}),format.raw/*11.46*/(""">
        """),_display_(/*12.10*/if(!isMultiple)/*12.25*/ {_display_(Seq[Any](format.raw/*12.27*/("""
        	"""),format.raw/*13.10*/("""<option class="blank" value="null""""),format.raw/*13.44*/("""{"""),format.raw/*13.45*/("""selected"""),format.raw/*13.53*/("""}"""),format.raw/*13.54*/(""">Selecione seu nível</option>
        """)))}),format.raw/*14.10*/("""
        """),_display_(/*15.10*/for((idCJ, isSelected) <- optionMap) yield /*15.46*/ {_display_(Seq[Any](format.raw/*15.48*/("""
          """),format.raw/*16.11*/("""<option id=""""),_display_(/*16.24*/idCJ),format.raw/*16.28*/("""" value=""""),_display_(/*16.38*/idCJ),format.raw/*16.42*/("""" """),_display_(/*16.45*/if(idCJ.toString == null)/*16.70*/{_display_(Seq[Any](format.raw/*16.71*/("""selected="selected"""")))}),format.raw/*16.91*/(""" """),format.raw/*16.92*/(""">"""),_display_(/*16.94*/isSelected),format.raw/*16.104*/(""" """),format.raw/*16.105*/("""- """),_display_(/*16.108*/idCJ/*16.112*/.toString),format.raw/*16.121*/("""</option>
          
        """)))}),format.raw/*18.10*/("""
        
      """),format.raw/*20.7*/("""</select>
      <span class="help-block">"""),_display_(/*21.33*/help),format.raw/*21.37*/("""</span>
      <!--<span class="help-block">"""),_display_(/*22.37*/{field.error.map { error => error.message }}),format.raw/*22.81*/("""</span>-->
      <span class="help-block">"""),_display_(/*23.33*/{field.error.map { error => "Selecione um nível válido" }}),format.raw/*23.91*/("""</span>

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
                  DATE: Thu Oct 05 20:41:09 BRT 2017
                  SOURCE: /home/ufabc/devel/form-captacao-contato-play/app/views/bootstrap3/select.scala.html
                  HASH: b176677d9ebb32e0d371295cc8eecfbb3eeba78f
                  MATRIX: 799->1|1009->115|1039->119|1089->143|1116->162|1155->164|1195->174|1272->225|1285->230|1308->233|1337->236|1362->241|1429->283|1442->288|1483->309|1516->316|1592->366|1605->371|1628->374|1672->391|1695->405|1726->408|1757->429|1770->434|1800->436|1814->441|1843->447|1881->458|1904->472|1944->474|1995->494|2033->505|2057->520|2097->522|2135->532|2197->566|2226->567|2262->575|2291->576|2361->615|2398->625|2450->661|2490->663|2529->674|2569->687|2594->691|2631->701|2656->705|2686->708|2720->733|2759->734|2810->754|2839->755|2868->757|2900->767|2930->768|2961->771|2975->775|3006->784|3067->814|3110->830|3179->872|3204->876|3275->920|3340->964|3410->1007|3489->1065
                  LINES: 27->1|32->1|34->3|34->3|34->3|34->3|34->3|35->4|35->4|35->4|35->4|35->4|37->6|37->6|37->6|38->7|40->9|40->9|40->9|41->10|41->10|41->10|41->10|41->10|41->10|41->10|41->10|42->11|42->11|42->11|42->11|43->12|43->12|43->12|44->13|44->13|44->13|44->13|44->13|45->14|46->15|46->15|46->15|47->16|47->16|47->16|47->16|47->16|47->16|47->16|47->16|47->16|47->16|47->16|47->16|47->16|47->16|47->16|47->16|49->18|51->20|52->21|52->21|53->22|53->22|54->23|54->23
                  -- GENERATED --
              */
          