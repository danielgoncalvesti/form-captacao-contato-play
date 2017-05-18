
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
    """),_display_(/*11.6*/text(intForm("nome"),
        label = "Nome",
        placeholder = "Nome Completo",
        help = "Por favor, coloque seu nome.")),format.raw/*14.47*/("""

    """),_display_(/*16.6*/text(intForm("email"),
        label = "Email",
        placeholder = "Email",
        help = "Por favor, coloque seu email válido.")),format.raw/*19.55*/("""

    """),format.raw/*21.5*/("""<!-- GPA -->
    """),_display_(/*22.6*/select(intForm("conhecimentoJava"),
    label = "Conhecimento em Java",
    isMultiple = false,
    help = "Select your GPA. (required)")),format.raw/*25.42*/("""

    """),format.raw/*27.5*/("""<div class="form-group">
        <div class="col-sm-offset-2 col-sm-10">
            <button id="submit" type="submit" value="Submit" class="btn btn-primary">Enviar Inscrição</button>
        </div>
    </div>
</fieldset>"""))
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
                  DATE: Wed May 17 23:45:43 BRT 2017
                  SOURCE: /Users/danielgoncalvesti/devel/captacao-email-play/app/views/fieldset.scala.html
                  HASH: 0e9ca080c4c97d9efefbb7bc6d30d390d545c5c2
                  MATRIX: 762->1|915->29|943->63|1106->200|1258->331|1291->338|1445->471|1478->477|1522->495|1680->632|1713->638
                  LINES: 27->1|32->1|34->4|41->11|44->14|46->16|49->19|51->21|52->22|55->25|57->27
                  -- GENERATED --
              */
          