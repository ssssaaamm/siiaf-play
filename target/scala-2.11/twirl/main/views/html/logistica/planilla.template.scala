
package views.html.logistica

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

"""),_display_(/*11.2*/logistica/*11.11*/.base("Logistic SIIAF","Planilla de Pago","Planilla de pago a motoristas","planilla",css,js)/*11.103*/{_display_(Seq[Any](format.raw/*11.104*/("""
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
                  DATE: Sun Nov 06 01:31:06 CST 2016
                  SOURCE: /home/samuel/Desarrollo/siiaf/app/views/logistica/planilla.scala.html
                  HASH: eeace9fb87e3661ac5a49f11716274daa3e66d4b
                  MATRIX: 874->19|884->22|963->24|989->31|998->33|1077->35|1119->28|1147->39|1176->42|1194->51|1296->143|1336->144|1365->146
                  LINES: 34->3|34->3|36->3|38->7|38->7|40->7|43->5|45->9|47->11|47->11|47->11|47->11|48->12
                  -- GENERATED --
              */
          