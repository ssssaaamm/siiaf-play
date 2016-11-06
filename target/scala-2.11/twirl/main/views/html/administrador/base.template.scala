
package views.html.administrador

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object base_Scope0 {
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

class base extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template7[String,String,String,String,Html,Html,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(title: String, opcion: String, descripcion: String, activo: String, css: Html = Html(""), js: Html = Html(""))(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.128*/("""

"""),format.raw/*4.1*/("""<!DOCTYPE html>
<html lang="en">
    <head>
        """),format.raw/*7.62*/("""
        """),format.raw/*8.9*/("""<title>"""),_display_(/*8.17*/title),format.raw/*8.22*/("""</title>
        <!-- <link rel="stylesheet" media="screen" href=""""),_display_(/*9.59*/routes/*9.65*/.Assets.versioned("stylesheets/main.css")),format.raw/*9.106*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*10.59*/routes/*10.65*/.Assets.versioned("images/favicon.png")),format.raw/*10.104*/(""""> -->
        <link rel="stylesheet" media="screen" href=""""),_display_(/*11.54*/routes/*11.60*/.Assets.versioned("stylesheets/bootstrap.min.css")),format.raw/*11.110*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(/*12.54*/routes/*12.60*/.Assets.versioned("stylesheets/sb-admin.css")),format.raw/*12.105*/("""">
        <link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(/*13.70*/routes/*13.76*/.Assets.versioned("font-awesome/css/font-awesome.min.css")),format.raw/*13.134*/("""">
        """),_display_(/*14.10*/css),format.raw/*14.13*/(""" 
        
    """),format.raw/*16.5*/("""</head>
    <body>

        <div id="wrapper">
            
            <!-- Navigation -->
            <nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
                <!-- Brand and toggle get grouped for better mobile display -->
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-ex1-collapse">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <a class="navbar-brand" href=""""),_display_(/*31.52*/routes/*31.58*/.AdministradorController.usuarios),format.raw/*31.91*/(""""><span class="glyphicon glyphicon-home" aria-hidden="true"></span> Inicio</a>
                </div>
                <!-- Top Menu Items -->
                <ul class="nav navbar-right top-nav">

                    <li class="dropdown">
                        <a href="#" class="dropdown-toggle toggle" data-toggle="dropdown"><i class="fa fa-user"></i> """),_display_(/*37.119*/session()/*37.128*/.get("username")),format.raw/*37.144*/(""" """),format.raw/*37.145*/("""<b class="caret"></b></a>
                        <ul class="dropdown-menu">
                            <li class="divider"></li>
                            <li>
                                <a href=""""),_display_(/*41.43*/routes/*41.49*/.HomeController.logout),format.raw/*41.71*/(""""><span class="glyphicon glyphicon-off" aria-hidden="true"></span> Salir</a>
                            </li>
                        </ul>
                    </li>
                    
                </ul>
                <!-- Sidebar Menu Items - These collapse to the responsive navigation menu on small screens -->
                <div class="collapse navbar-collapse navbar-ex1-collapse">
                    <ul class="nav navbar-nav side-nav">
                        """),_display_(/*50.26*/if(activo=="usuarios")/*50.48*/{_display_(Seq[Any](format.raw/*50.49*/("""
                            """),format.raw/*51.29*/("""<li class="active">
                        """)))}/*52.26*/else/*52.30*/{_display_(Seq[Any](format.raw/*52.31*/("""
                            """),format.raw/*53.29*/("""<li>
                        """)))}),format.raw/*54.26*/("""
                            """),format.raw/*55.29*/("""<a href=""""),_display_(/*55.39*/routes/*55.45*/.AdministradorController.usuarios),format.raw/*55.78*/(""""><span class="glyphicon glyphicon-briefcase" aria-hidden="true"></span> Usuarios</a>
                        </li>
                    </ul>
                </div>
                <!-- /.navbar-collapse -->
            </nav>
            <!-- End Navigation -->

            <!--Content-->
            <div id="page-wrapper">

                <div class="container-fluid">

                    <!-- Page Heading -->
                    <div class="row">
                        <div class="col-lg-12">
                            <h1 class="page-header">
                                """),_display_(/*72.34*/opcion),format.raw/*72.40*/("""
                                """),format.raw/*73.33*/("""<small>"""),_display_(/*73.41*/descripcion),format.raw/*73.52*/("""</small>
                            </h1>
                            """),_display_(/*75.30*/content),format.raw/*75.37*/("""

                            """),format.raw/*77.29*/("""<div class="well">
                                
                            </div>

                        </div>
                    </div>
                    <!-- /.row -->


                </div>
                <!-- /.container-fluid -->

            </div>
            <!--/.page-wrapper-->
            <!--End Content-->



        </div>
        <!--/.wrapper-->




        

        """),format.raw/*104.32*/("""
        

        """),format.raw/*107.9*/("""<script src=""""),_display_(/*107.23*/routes/*107.29*/.Assets.versioned("javascripts/jquery.js")),format.raw/*107.71*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*108.23*/routes/*108.29*/.Assets.versioned("javascripts/bootstrap.min.js")),format.raw/*108.78*/("""" type="text/javascript"></script>
        """),_display_(/*109.10*/js),format.raw/*109.12*/("""
    """),format.raw/*110.5*/("""</body>
</html>
"""))
      }
    }
  }

  def render(title:String,opcion:String,descripcion:String,activo:String,css:Html,js:Html,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title,opcion,descripcion,activo,css,js)(content)

  def f:((String,String,String,String,Html,Html) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title,opcion,descripcion,activo,css,js) => (content) => apply(title,opcion,descripcion,activo,css,js)(content)

  def ref: this.type = this

}


}

/**/
object base extends base_Scope0.base
              /*
                  -- GENERATED --
                  DATE: Sun Nov 06 00:23:13 CST 2016
                  SOURCE: /home/sarahi/siiaf-play/app/views/administrador/base.scala.html
                  HASH: af15591a346629503806111e6a1829087c572ba9
                  MATRIX: 793->2|1015->128|1043->130|1122->235|1157->244|1191->252|1216->257|1309->324|1323->330|1385->371|1473->432|1488->438|1549->477|1636->537|1651->543|1723->593|1806->649|1821->655|1888->700|1987->772|2002->778|2082->836|2121->848|2145->851|2187->866|2953->1605|2968->1611|3022->1644|3407->2001|3426->2010|3464->2026|3494->2027|3727->2233|3742->2239|3785->2261|4291->2740|4322->2762|4361->2763|4418->2792|4482->2837|4495->2841|4534->2842|4591->2871|4652->2901|4709->2930|4746->2940|4761->2946|4815->2979|5431->3568|5458->3574|5519->3607|5554->3615|5586->3626|5685->3698|5713->3705|5771->3735|6199->4224|6246->4243|6288->4257|6304->4263|6368->4305|6453->4362|6469->4368|6540->4417|6612->4461|6636->4463|6669->4468
                  LINES: 27->2|32->2|34->4|37->7|38->8|38->8|38->8|39->9|39->9|39->9|40->10|40->10|40->10|41->11|41->11|41->11|42->12|42->12|42->12|43->13|43->13|43->13|44->14|44->14|46->16|61->31|61->31|61->31|67->37|67->37|67->37|67->37|71->41|71->41|71->41|80->50|80->50|80->50|81->51|82->52|82->52|82->52|83->53|84->54|85->55|85->55|85->55|85->55|102->72|102->72|103->73|103->73|103->73|105->75|105->75|107->77|133->104|136->107|136->107|136->107|136->107|137->108|137->108|137->108|138->109|138->109|139->110
                  -- GENERATED --
              */
          