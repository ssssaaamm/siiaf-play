
package views.html.gerente

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object politica_cobro_Scope0 {
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

class politica_cobro extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Form[PoliticaCobro],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(cliente_form: Form[PoliticaCobro]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import helper._
def /*4.2*/css/*4.5*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*4.7*/("""
	
""")))};def /*8.2*/js/*8.4*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*8.6*/("""
	
""")))};
Seq[Any](format.raw/*1.37*/("""
"""),format.raw/*3.1*/("""
"""),format.raw/*6.2*/("""

"""),format.raw/*10.2*/("""

"""),_display_(/*12.2*/gerente/*12.9*/.base("Manager SIIAF","Politica de Cobro","Configuracion","politica_cobro",css,js)/*12.91*/{_display_(Seq[Any](format.raw/*12.92*/("""
	"""),format.raw/*13.2*/("""configuracion de politica de cobro
""")))}))
      }
    }
  }

  def render(cliente_form:Form[PoliticaCobro]): play.twirl.api.HtmlFormat.Appendable = apply(cliente_form)

  def f:((Form[PoliticaCobro]) => play.twirl.api.HtmlFormat.Appendable) = (cliente_form) => apply(cliente_form)

  def ref: this.type = this

}


}

/**/
object politica_cobro extends politica_cobro_Scope0.politica_cobro
              /*
                  -- GENERATED --
                  DATE: Sun Nov 06 09:16:26 CST 2016
                  SOURCE: /home/samuel/Desarrollo/siiaf/app/views/gerente/politica_cobro.scala.html
                  HASH: 4b4a328aa4cde20d0fa5b2aec2a8713ea637d1e7
                  MATRIX: 784->1|912->56|922->59|1001->61|1027->68|1036->70|1115->72|1158->36|1185->54|1212->65|1241->76|1270->79|1285->86|1376->168|1415->169|1444->171
                  LINES: 27->1|31->4|31->4|33->4|35->8|35->8|37->8|40->1|41->3|42->6|44->10|46->12|46->12|46->12|46->12|47->13
                  -- GENERATED --
              */
          