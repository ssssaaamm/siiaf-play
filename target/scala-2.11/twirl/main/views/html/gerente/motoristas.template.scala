
package views.html.gerente

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object motoristas_Scope0 {
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

     object motoristas_Scope1 {
import helper._

class motoristas extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

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

"""),_display_(/*11.2*/gerente/*11.9*/.base("Manager SIIAF","Motoristas","Gestion de motoristas","motoristas",css,js)/*11.88*/{_display_(Seq[Any](format.raw/*11.89*/("""
	"""),format.raw/*12.2*/("""gestion de motoristas
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
object motoristas extends motoristas_Scope0.motoristas_Scope1.motoristas
              /*
                  -- GENERATED --
                  DATE: Sun Nov 06 01:31:08 CST 2016
                  SOURCE: /home/samuel/Desarrollo/siiaf/app/views/gerente/motoristas.scala.html
                  HASH: 5af426c67423ffd52ad3db655ef612a549179949
                  MATRIX: 878->19|888->22|967->24|993->31|1002->33|1081->35|1123->28|1151->39|1180->42|1195->49|1283->128|1322->129|1351->131
                  LINES: 34->3|34->3|36->3|38->7|38->7|40->7|43->5|45->9|47->11|47->11|47->11|47->11|48->12
                  -- GENERATED --
              */
          