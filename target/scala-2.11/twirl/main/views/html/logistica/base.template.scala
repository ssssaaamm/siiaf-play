
package views.html.logistica

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
                    <a class="navbar-brand" href=""""),_display_(/*31.52*/routes/*31.58*/.LogisticaController.viajes),format.raw/*31.85*/(""""><span class="glyphicon glyphicon-home" aria-hidden="true"></span> Inicio</a>
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
                        
                        """),_display_(/*51.26*/if(activo=="viajes")/*51.46*/{_display_(Seq[Any](format.raw/*51.47*/("""
                            """),format.raw/*52.29*/("""<li class="active">
                        """)))}/*53.26*/else/*53.30*/{_display_(Seq[Any](format.raw/*53.31*/("""
                            """),format.raw/*54.29*/("""<li>
                        """)))}),format.raw/*55.26*/("""
                            """),format.raw/*56.29*/("""<a href=""""),_display_(/*56.39*/routes/*56.45*/.LogisticaController.viajes),format.raw/*56.72*/(""""><span class="glyphicon glyphicon-road" aria-hidden="true"></span> Viajes</a>
                        </li>


                        """),_display_(/*60.26*/if(activo=="planilla")/*60.48*/{_display_(Seq[Any](format.raw/*60.49*/("""
                            """),format.raw/*61.29*/("""<li class="active">
                        """)))}/*62.26*/else/*62.30*/{_display_(Seq[Any](format.raw/*62.31*/("""
                            """),format.raw/*63.29*/("""<li>
                        """)))}),format.raw/*64.26*/("""
                            """),format.raw/*65.29*/("""<a href=""""),_display_(/*65.39*/routes/*65.45*/.LogisticaController.planilla),format.raw/*65.74*/(""""><span class="glyphicon glyphicon-list-alt" aria-hidden="true"></span> Planilla</a>
                        </li>


                        """),_display_(/*69.26*/if(activo=="facturacion")/*69.51*/{_display_(Seq[Any](format.raw/*69.52*/("""
                            """),format.raw/*70.29*/("""<li class="active">
                        """)))}/*71.26*/else/*71.30*/{_display_(Seq[Any](format.raw/*71.31*/("""
                            """),format.raw/*72.29*/("""<li>
                        """)))}),format.raw/*73.26*/("""
                            """),format.raw/*74.29*/("""<a href=""""),_display_(/*74.39*/routes/*74.45*/.LogisticaController.facturacion),format.raw/*74.77*/(""""><span class="glyphicon glyphicon-list-alt" aria-hidden="true"></span> Facturacion</a>
                        </li>


                        """),_display_(/*78.26*/if(activo=="politica_cobro")/*78.54*/{_display_(Seq[Any](format.raw/*78.55*/("""
                            """),format.raw/*79.29*/("""<li class="active">
                        """)))}/*80.26*/else/*80.30*/{_display_(Seq[Any](format.raw/*80.31*/("""
                            """),format.raw/*81.29*/("""<li>
                        """)))}),format.raw/*82.26*/("""
                            """),format.raw/*83.29*/("""<a href=""""),_display_(/*83.39*/routes/*83.45*/.LogisticaController.politica_cobro),format.raw/*83.80*/(""""><span class="glyphicon glyphicon-euro" aria-hidden="true"></span> Politica Cobro</a>
                        </li>


                        """),_display_(/*87.26*/if(activo=="politica_pago")/*87.53*/{_display_(Seq[Any](format.raw/*87.54*/("""
                            """),format.raw/*88.29*/("""<li class="active">
                        """)))}/*89.26*/else/*89.30*/{_display_(Seq[Any](format.raw/*89.31*/("""
                            """),format.raw/*90.29*/("""<li>
                        """)))}),format.raw/*91.26*/("""
                            """),format.raw/*92.29*/("""<a href=""""),_display_(/*92.39*/routes/*92.45*/.LogisticaController.politica_pago),format.raw/*92.79*/(""""><span class="glyphicon glyphicon-euro" aria-hidden="true"></span> Politica pago</a>
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
                                """),_display_(/*111.34*/opcion),format.raw/*111.40*/("""
                                """),format.raw/*112.33*/("""<small>"""),_display_(/*112.41*/descripcion),format.raw/*112.52*/("""</small>
                            </h1>
                            """),_display_(/*114.30*/content),format.raw/*114.37*/("""

                            """),format.raw/*116.29*/("""<div class="well">
                                
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




        

        """),format.raw/*143.32*/("""
        

        """),format.raw/*146.9*/("""<script src=""""),_display_(/*146.23*/routes/*146.29*/.Assets.versioned("javascripts/jquery.js")),format.raw/*146.71*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*147.23*/routes/*147.29*/.Assets.versioned("javascripts/bootstrap.min.js")),format.raw/*147.78*/("""" type="text/javascript"></script>
        """),_display_(/*148.10*/js),format.raw/*148.12*/("""
    """),format.raw/*149.5*/("""</body>
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
                  DATE: Sun Nov 06 08:15:22 CST 2016
                  SOURCE: /home/sarahi/siiaf-play/app/views/logistica/base.scala.html
                  HASH: c0e8ba289a81d7e2485273a11cba1bfb201e291a
                  MATRIX: 789->2|1011->128|1039->130|1118->235|1153->244|1187->252|1212->257|1305->324|1319->330|1381->371|1469->432|1484->438|1545->477|1632->537|1647->543|1719->593|1802->649|1817->655|1884->700|1983->772|1998->778|2078->836|2117->848|2141->851|2183->866|2949->1605|2964->1611|3012->1638|3397->1995|3416->2004|3454->2020|3484->2021|3717->2227|3732->2233|3775->2255|4306->2759|4335->2779|4374->2780|4431->2809|4495->2854|4508->2858|4547->2859|4604->2888|4665->2918|4722->2947|4759->2957|4774->2963|4822->2990|4985->3126|5016->3148|5055->3149|5112->3178|5176->3223|5189->3227|5228->3228|5285->3257|5346->3287|5403->3316|5440->3326|5455->3332|5505->3361|5674->3503|5708->3528|5747->3529|5804->3558|5868->3603|5881->3607|5920->3608|5977->3637|6038->3667|6095->3696|6132->3706|6147->3712|6200->3744|6372->3889|6409->3917|6448->3918|6505->3947|6569->3992|6582->3996|6621->3997|6678->4026|6739->4056|6796->4085|6833->4095|6848->4101|6904->4136|7075->4280|7111->4307|7150->4308|7207->4337|7271->4382|7284->4386|7323->4387|7380->4416|7441->4446|7498->4475|7535->4485|7550->4491|7605->4525|8224->5116|8252->5122|8314->5155|8350->5163|8383->5174|8483->5246|8512->5253|8571->5283|8999->5772|9046->5791|9088->5805|9104->5811|9168->5853|9253->5910|9269->5916|9340->5965|9412->6009|9436->6011|9469->6016
                  LINES: 27->2|32->2|34->4|37->7|38->8|38->8|38->8|39->9|39->9|39->9|40->10|40->10|40->10|41->11|41->11|41->11|42->12|42->12|42->12|43->13|43->13|43->13|44->14|44->14|46->16|61->31|61->31|61->31|67->37|67->37|67->37|67->37|71->41|71->41|71->41|81->51|81->51|81->51|82->52|83->53|83->53|83->53|84->54|85->55|86->56|86->56|86->56|86->56|90->60|90->60|90->60|91->61|92->62|92->62|92->62|93->63|94->64|95->65|95->65|95->65|95->65|99->69|99->69|99->69|100->70|101->71|101->71|101->71|102->72|103->73|104->74|104->74|104->74|104->74|108->78|108->78|108->78|109->79|110->80|110->80|110->80|111->81|112->82|113->83|113->83|113->83|113->83|117->87|117->87|117->87|118->88|119->89|119->89|119->89|120->90|121->91|122->92|122->92|122->92|122->92|141->111|141->111|142->112|142->112|142->112|144->114|144->114|146->116|172->143|175->146|175->146|175->146|175->146|176->147|176->147|176->147|177->148|177->148|178->149
                  -- GENERATED --
              */
          