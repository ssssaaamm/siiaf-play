
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object index_Scope0 {
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

class index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*1.2*/base("Home CRM")/*1.18*/{_display_(Seq[Any](format.raw/*1.19*/("""
	
	"""),format.raw/*3.2*/("""<h1>PAGINA DE INICIO DEL SISTEMA</h1>

""")))}))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


}

/**/
object index extends index_Scope0.index
              /*
                  -- GENERATED --
                  DATE: Sun Nov 06 01:31:06 CST 2016
                  SOURCE: /home/samuel/Desarrollo/siiaf/app/views/index.scala.html
                  HASH: 510707eca341644b49e8a399922fff5da70266c4
                  MATRIX: 827->1|851->17|889->18|919->22
                  LINES: 32->1|32->1|32->1|34->3
                  -- GENERATED --
              */
          