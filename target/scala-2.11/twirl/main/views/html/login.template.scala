
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object login_Scope0 {
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

class login extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

def /*1.2*/css/*1.5*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*1.9*/("""
    """),format.raw/*2.5*/("""<link rel="stylesheet" media="screen" href=""""),_display_(/*2.50*/routes/*2.56*/.Assets.versioned("stylesheets/login.css")),format.raw/*2.98*/("""">
""")))};
Seq[Any](format.raw/*3.2*/("""
"""),_display_(/*4.2*/base("Login SIIAF",css)/*4.25*/{_display_(Seq[Any](format.raw/*4.26*/("""
"""),format.raw/*5.1*/("""<div class="row">
	<div class="col-md-6 col-md-offset-3">
		<div class="panel panel-login">
			<div class="panel-heading">
				<div class="row">
					<div class="col-xs-12">
						<p class="active" id="login-form-link">Iniciar Sesion</p>
					</div>
				</div>
				<hr>
			</div>
			<div class="panel-body">
				<div class="row">
					<div class="col-lg-12">
						"""),_display_(/*19.8*/if(flash.containsKey("no_registered"))/*19.46*/{_display_(Seq[Any](format.raw/*19.47*/("""
							"""),format.raw/*20.8*/("""<div class="alert alert-danger" role="alert">
								<p>"""),_display_(/*21.13*/flash/*21.18*/.get("no_registered")),format.raw/*21.39*/("""</p>
							</div>
						""")))}),format.raw/*23.8*/("""
						
						"""),_display_(/*25.8*/if(flash.containsKey("no_password"))/*25.44*/{_display_(Seq[Any](format.raw/*25.45*/("""
							"""),format.raw/*26.8*/("""<div class="alert alert-warning" role="alert">
								<p>"""),_display_(/*27.13*/flash/*27.18*/.get("no_password")),format.raw/*27.37*/("""</p>
							</div>
						""")))}),format.raw/*29.8*/("""
						"""),format.raw/*30.7*/("""<form id="login-form" action=""""),_display_(/*30.38*/routes/*30.44*/.HomeController.login_post),format.raw/*30.70*/("""" method="post" role="form" style="display: block;">
							<div class="form-group">
								<input type="text" name="username" id="username" tabindex="1" class="form-control" placeholder="Username" value="">
							</div>
							<div class="form-group">
								<input type="password" name="password" id="password" tabindex="2" class="form-control" placeholder="Password">
							</div>
							<div class="form-group">
								<div class="row">
									<div class="col-sm-6 col-sm-offset-3">
										<input type="submit" name="login-submit" id="login-submit" tabindex="4" class="form-control btn btn-login" value="Log In">
									</div>
								</div>
							</div>
							<div class="form-group">

							</div>
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>

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
object login extends login_Scope0.login
              /*
                  -- GENERATED --
                  DATE: Sun Nov 06 08:15:22 CST 2016
                  SOURCE: /home/sarahi/siiaf-play/app/views/login.scala.html
                  HASH: 5680c636e4d89a91da6b56b4a60599f16c19c299
                  MATRIX: 811->1|821->4|900->8|931->13|1002->58|1016->64|1078->106|1120->110|1147->112|1178->135|1216->136|1243->137|1635->503|1682->541|1721->542|1756->550|1841->608|1855->613|1897->634|1953->660|1994->675|2039->711|2078->712|2113->720|2199->779|2213->784|2253->803|2309->829|2343->836|2401->867|2416->873|2463->899
                  LINES: 31->1|31->1|33->1|34->2|34->2|34->2|34->2|36->3|37->4|37->4|37->4|38->5|52->19|52->19|52->19|53->20|54->21|54->21|54->21|56->23|58->25|58->25|58->25|59->26|60->27|60->27|60->27|62->29|63->30|63->30|63->30|63->30
                  -- GENERATED --
              */
          