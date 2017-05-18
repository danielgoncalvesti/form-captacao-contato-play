
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

class select extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[Field,String,Boolean,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(field: Field, label: String = "CHANGEME", isMultiple: Boolean, help: String = ""):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.84*/("""

  """),format.raw/*3.3*/("""<div class="form-group """),_display_(/*3.27*/if(field.hasErrors)/*3.46*/ {_display_(Seq[Any](format.raw/*3.48*/("""has-error""")))}),format.raw/*3.58*/("""">
    <label class="col-sm-2 control-label" for=""""),_display_(/*4.49*/field/*4.54*/.id),format.raw/*4.57*/("""">"""),_display_(/*4.60*/label),format.raw/*4.65*/("""</label>
    <div class="col-sm-10">
      <select
        class="form-control"
        id=""""),_display_(/*8.14*/field/*8.19*/.id),format.raw/*8.22*/(""""
        name=""""),_display_(/*9.16*/if(isMultiple)/*9.30*/ {_display_(_display_(/*9.33*/(field.name + "[]")))}/*9.54*/else/*9.59*/{_display_(_display_(/*9.61*/field/*9.66*/.name))}),format.raw/*9.72*/(""""
        """),_display_(/*10.10*/if(isMultiple)/*10.24*/ {_display_(Seq[Any](format.raw/*10.26*/("""multiple="multiple"""")))}),format.raw/*10.46*/(""">
        """),_display_(/*11.10*/if(!isMultiple)/*11.25*/ {_display_(Seq[Any](format.raw/*11.27*/("""<option class="blank" value="">Please select a value</option>""")))}),format.raw/*11.89*/("""
        """),format.raw/*12.9*/("""<option id="" value="">0</option>
        <option id="" value="">1</option>

      </select>
      <span class="help-block">"""),_display_(/*16.33*/help),format.raw/*16.37*/("""</span>
      <span class="help-block">"""),_display_(/*17.33*/{field.error.map { error => error.message }}),format.raw/*17.77*/("""</span>
    </div>
  </div>
"""))
      }
    }
  }

  def render(field:Field,label:String,isMultiple:Boolean,help:String): play.twirl.api.HtmlFormat.Appendable = apply(field,label,isMultiple,help)

  def f:((Field,String,Boolean,String) => play.twirl.api.HtmlFormat.Appendable) = (field,label,isMultiple,help) => apply(field,label,isMultiple,help)

  def ref: this.type = this

}


}

/**/
object select extends select_Scope0.select
              /*
                  -- GENERATED --
                  DATE: Thu May 18 00:04:02 BRT 2017
                  SOURCE: /Users/danielgoncalvesti/devel/captacao-email-play/app/views/bootstrap3/select.scala.html
                  HASH: eca9d45d2074b0088fccfe83b47d5946c917cbe3
                  MATRIX: 779->1|956->83|986->87|1036->111|1063->130|1102->132|1142->142|1219->193|1232->198|1255->201|1284->204|1309->209|1428->302|1441->307|1464->310|1507->327|1529->341|1559->344|1589->365|1601->370|1630->372|1643->377|1671->383|1709->394|1732->408|1772->410|1823->430|1861->441|1885->456|1925->458|2018->520|2054->529|2206->654|2231->658|2298->698|2363->742
                  LINES: 27->1|32->1|34->3|34->3|34->3|34->3|34->3|35->4|35->4|35->4|35->4|35->4|39->8|39->8|39->8|40->9|40->9|40->9|40->9|40->9|40->9|40->9|40->9|41->10|41->10|41->10|41->10|42->11|42->11|42->11|42->11|43->12|47->16|47->16|48->17|48->17
                  -- GENERATED --
              */
          