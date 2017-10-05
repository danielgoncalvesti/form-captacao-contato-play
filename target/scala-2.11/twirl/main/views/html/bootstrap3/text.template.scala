
package views.html.bootstrap3

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object text_Scope0 {
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

class text extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[Field,String,String,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(field: Field, label: String = "CHANGEME", placeholder: String = "", help: String = ""):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.89*/("""

  """),format.raw/*3.3*/("""<div class="form-group """),_display_(/*3.27*/if(field.hasErrors)/*3.46*/ {_display_(Seq[Any](format.raw/*3.48*/("""has-error""")))}),format.raw/*3.58*/("""">
    <label class="col-sm-2 control-label">"""),_display_(/*4.44*/label),format.raw/*4.49*/("""</label>
    <div class="col-sm-10">
      <input type="text" 
             class="form-control" 
             id=""""),_display_(/*8.19*/field/*8.24*/.id),format.raw/*8.27*/("""" 
             name=""""),_display_(/*9.21*/field/*9.26*/.name),format.raw/*9.31*/("""" 
             value=""""),_display_(/*10.22*/field/*10.27*/.value.getOrElse("")),format.raw/*10.47*/(""""
             placeholder=""""),_display_(/*11.28*/placeholder),format.raw/*11.39*/("""" />
      <span class="help-block">"""),_display_(/*12.33*/help),format.raw/*12.37*/(""" """),format.raw/*12.38*/("""<span>"""),_display_(/*12.45*/{field.error.map {error => error.message }}),format.raw/*12.88*/("""</span>  </span>
      <!--<span class="help-block">"""),_display_(/*13.37*/{field.error.map { error => error.message }}),format.raw/*13.81*/("""</span>-->
<br />
    </div>
  </div>
"""))
      }
    }
  }

  def render(field:Field,label:String,placeholder:String,help:String): play.twirl.api.HtmlFormat.Appendable = apply(field,label,placeholder,help)

  def f:((Field,String,String,String) => play.twirl.api.HtmlFormat.Appendable) = (field,label,placeholder,help) => apply(field,label,placeholder,help)

  def ref: this.type = this

}


}

/**/
object text extends text_Scope0.text
              /*
                  -- GENERATED --
                  DATE: Thu Oct 05 18:54:36 BRT 2017
                  SOURCE: /home/ufabc/devel/form-captacao-contato-play/app/views/bootstrap3/text.scala.html
                  HASH: f5d5b0f905ce53b177abaa49a1e2e7fc01183605
                  MATRIX: 774->1|956->88|986->92|1036->116|1063->135|1102->137|1142->147|1214->193|1239->198|1381->314|1394->319|1417->322|1466->345|1479->350|1504->355|1555->379|1569->384|1610->404|1666->433|1698->444|1762->481|1787->485|1816->486|1850->493|1914->536|1994->589|2059->633
                  LINES: 27->1|32->1|34->3|34->3|34->3|34->3|34->3|35->4|35->4|39->8|39->8|39->8|40->9|40->9|40->9|41->10|41->10|41->10|42->11|42->11|43->12|43->12|43->12|43->12|43->12|44->13|44->13
                  -- GENERATED --
              */
          