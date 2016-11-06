
package views.html.gerente

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object facturacion_Scope0 {
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

     object facturacion_Scope1 {
import helper._

class facturacion extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

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

"""),_display_(/*11.2*/gerente/*11.9*/.base("Manager SIIAF","Facturacion de Clientes","Detalle Facturacion","facturacion",css,js)/*11.100*/{_display_(Seq[Any](format.raw/*11.101*/("""
	"""),format.raw/*12.2*/("""consulata de facturacion
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
object facturacion extends facturacion_Scope0.facturacion_Scope1.facturacion
              /*
                  -- GENERATED --
                  DATE: Sun Nov 06 08:15:22 CST 2016
                  SOURCE: /home/sarahi/siiaf-play/app/views/gerente/facturacion.scala.html
                  HASH: 17c73a3b365cd4faa6cc2192bac3d63e32fcb96d
                  MATRIX: 881->19|891->22|970->24|996->31|1005->33|1084->35|1126->28|1154->39|1183->42|1198->49|1299->140|1339->141|1368->143
                  LINES: 34->3|34->3|36->3|38->7|38->7|40->7|43->5|45->9|47->11|47->11|47->11|47->11|48->12
                  -- GENERATED --
              */
          