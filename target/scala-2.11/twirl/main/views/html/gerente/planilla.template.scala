
package views.html.gerente

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object planilla_Scope0 {
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

     object planilla_Scope1 {
import helper._

class planilla extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

def /*3.2*/css/*3.5*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*3.7*/("""
	
""")))};def /*7.2*/js/*7.4*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*7.6*/("""
	
""")))};
Seq[Any](format.raw/*5.2*/("""

"""),format.raw/*9.2*/("""

"""),_display_(/*11.2*/gerente/*11.9*/.base("Manager SIIAF","Planilla de Pago","Planilla de pago a motoristas","planilla",css,js)/*11.100*/{_display_(Seq[Any](format.raw/*11.101*/("""
	"""),format.raw/*12.2*/("""consulata de planilla planilla
""")))}))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


}
}

/**/
object planilla extends planilla_Scope0.planilla_Scope1.planilla
              /*
                  -- GENERATED --
                  DATE: Sun Nov 06 00:23:13 CST 2016
                  SOURCE: /home/sarahi/siiaf-play/app/views/gerente/planilla.scala.html
                  HASH: 3e855e2b53d5fb48f77cec91e89ad11fc5d13e33
                  MATRIX: 872->19|882->22|961->24|987->31|996->33|1075->35|1117->28|1145->39|1174->42|1189->49|1290->140|1330->141|1359->143
                  LINES: 34->3|34->3|36->3|38->7|38->7|40->7|43->5|45->9|47->11|47->11|47->11|47->11|48->12
                  -- GENERATED --
              */
          