
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object fieldset_Scope0 {
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

class fieldset extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Form[Interessado],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(intForm: Form[Interessado]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import views.html.bootstrap3._

Seq[Any](format.raw/*1.30*/("""

"""),format.raw/*4.1*/("""<fieldset>

    <!-- Header -->
    <div id="legend">
        <legend>Formulário de Inscrição</legend>
    </div>

    <!-- Name -->
    """),_display_(/*12.6*/text(intForm("nome"),
        label = "Nome*",
        placeholder = "Nome Completo",
        help = "Por favor, coloque seu nome.")),format.raw/*15.47*/("""

    """),_display_(/*17.6*/text(intForm("email"),
        label = "Email*",
        placeholder = "Email",
        help = "Por favor, coloque seu email válido.")),format.raw/*20.55*/("""

    """),format.raw/*22.5*/("""<!-- GPA -->
    """),_display_(/*23.6*/select(intForm("conhecimentoJava.id"),
          label = "Meu nível em PROGRAMAÇÃO é: *",
          optionMap = ConhecimentoJava.options,
          isMultiple = false,
          help = "")),format.raw/*27.21*/("""

    """),format.raw/*29.5*/("""<div class="form-group">
        <div class="col-sm-offset-2 col-sm-10">
            <button id="submit" type="submit" value="Submit" class="btn btn-primary">Enviar Inscrição</button>
        </div>
    </div>
    <br />

</fieldset>

"""))
      }
    }
  }

  def render(intForm:Form[Interessado]): play.twirl.api.HtmlFormat.Appendable = apply(intForm)

  def f:((Form[Interessado]) => play.twirl.api.HtmlFormat.Appendable) = (intForm) => apply(intForm)

  def ref: this.type = this

}


}

/**/
object fieldset extends fieldset_Scope0.fieldset
              /*
                  -- GENERATED --
                  DATE: Thu Oct 05 20:10:11 BRT 2017
                  SOURCE: /home/ufabc/devel/form-captacao-contato-play/app/views/fieldset.scala.html
                  HASH: 30b462035625f2558284d8e08c04cca24ae1cad8
                  MATRIX: 762->1|915->29|943->63|1107->201|1260->333|1293->340|1448->474|1481->480|1525->498|1734->686|1767->692
                  LINES: 27->1|32->1|34->4|42->12|45->15|47->17|50->20|52->22|53->23|57->27|59->29
                  -- GENERATED --
              */
          