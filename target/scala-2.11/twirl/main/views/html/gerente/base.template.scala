
package views.html.gerente

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
                    <a class="navbar-brand" href=""""),_display_(/*31.52*/routes/*31.58*/.GerenteController.clientes),format.raw/*31.85*/(""""><span class="glyphicon glyphicon-home" aria-hidden="true"></span> Inicio</a>
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
                        """),_display_(/*50.26*/if(activo=="clientes")/*50.48*/{_display_(Seq[Any](format.raw/*50.49*/("""
                            """),format.raw/*51.29*/("""<li class="active">
                        """)))}/*52.26*/else/*52.30*/{_display_(Seq[Any](format.raw/*52.31*/("""
                            """),format.raw/*53.29*/("""<li>
                        """)))}),format.raw/*54.26*/("""
                            """),format.raw/*55.29*/("""<a href=""""),_display_(/*55.39*/routes/*55.45*/.GerenteController.clientes),format.raw/*55.72*/(""""><span class="glyphicon glyphicon-briefcase" aria-hidden="true"></span> Clientes</a>
                        </li>

                        """),_display_(/*58.26*/if(activo=="motoristas")/*58.50*/{_display_(Seq[Any](format.raw/*58.51*/("""
                            """),format.raw/*59.29*/("""<li class="active">
                        """)))}/*60.26*/else/*60.30*/{_display_(Seq[Any](format.raw/*60.31*/("""
                            """),format.raw/*61.29*/("""<li>
                        """)))}),format.raw/*62.26*/("""
                            """),format.raw/*63.29*/("""<a href=""""),_display_(/*63.39*/routes/*63.45*/.GerenteController.motoristas),format.raw/*63.74*/(""""><span class="glyphicon glyphicon-oil" aria-hidden="true"></span> Motoristas</a>
                        </li>


                        """),_display_(/*67.26*/if(activo=="cabezales")/*67.49*/{_display_(Seq[Any](format.raw/*67.50*/("""
                            """),format.raw/*68.29*/("""<li class="active">
                        """)))}/*69.26*/else/*69.30*/{_display_(Seq[Any](format.raw/*69.31*/("""
                            """),format.raw/*70.29*/("""<li>
                        """)))}),format.raw/*71.26*/("""
                            """),format.raw/*72.29*/("""<a href=""""),_display_(/*72.39*/routes/*72.45*/.GerenteController.cabezales),format.raw/*72.73*/(""""><span class="glyphicon glyphicon-bed" aria-hidden="true"></span> Cabezales</a>
                        </li>



                        """),_display_(/*77.26*/if(activo=="planilla")/*77.48*/{_display_(Seq[Any](format.raw/*77.49*/("""
                            """),format.raw/*78.29*/("""<li class="active">
                        """)))}/*79.26*/else/*79.30*/{_display_(Seq[Any](format.raw/*79.31*/("""
                            """),format.raw/*80.29*/("""<li>
                        """)))}),format.raw/*81.26*/("""
                            """),format.raw/*82.29*/("""<a href=""""),_display_(/*82.39*/routes/*82.45*/.GerenteController.planilla),format.raw/*82.72*/(""""><span class="glyphicon glyphicon-list-alt" aria-hidden="true"></span> Planilla</a>
                        </li>


                        """),_display_(/*86.26*/if(activo=="facturacion")/*86.51*/{_display_(Seq[Any](format.raw/*86.52*/("""
                            """),format.raw/*87.29*/("""<li class="active">
                        """)))}/*88.26*/else/*88.30*/{_display_(Seq[Any](format.raw/*88.31*/("""
                            """),format.raw/*89.29*/("""<li>
                        """)))}),format.raw/*90.26*/("""
                            """),format.raw/*91.29*/("""<a href=""""),_display_(/*91.39*/routes/*91.45*/.GerenteController.facturacion),format.raw/*91.75*/(""""><span class="glyphicon glyphicon-list-alt" aria-hidden="true"></span> Facturacion</a>
                        </li>



                        """),_display_(/*96.26*/if(activo=="politica_cobro")/*96.54*/{_display_(Seq[Any](format.raw/*96.55*/("""
                            """),format.raw/*97.29*/("""<li class="active">
                        """)))}/*98.26*/else/*98.30*/{_display_(Seq[Any](format.raw/*98.31*/("""
                            """),format.raw/*99.29*/("""<li>
                        """)))}),format.raw/*100.26*/("""
                            """),format.raw/*101.29*/("""<a href=""""),_display_(/*101.39*/routes/*101.45*/.GerenteController.politica_cobro),format.raw/*101.78*/(""""><span class="glyphicon glyphicon-euro" aria-hidden="true"></span> Politica Cobro</a>
                        </li>


                        """),_display_(/*105.26*/if(activo=="politica_pago")/*105.53*/{_display_(Seq[Any](format.raw/*105.54*/("""
                            """),format.raw/*106.29*/("""<li class="active">
                        """)))}/*107.26*/else/*107.30*/{_display_(Seq[Any](format.raw/*107.31*/("""
                            """),format.raw/*108.29*/("""<li>
                        """)))}),format.raw/*109.26*/("""
                            """),format.raw/*110.29*/("""<a href=""""),_display_(/*110.39*/routes/*110.45*/.GerenteController.politica_pago),format.raw/*110.77*/(""""><span class="glyphicon glyphicon-euro" aria-hidden="true"></span> Politica pago</a>
                        </li>



                        """),_display_(/*115.26*/if(activo=="usuarios")/*115.48*/{_display_(Seq[Any](format.raw/*115.49*/("""
                            """),format.raw/*116.29*/("""<li class="active">
                        """)))}/*117.26*/else/*117.30*/{_display_(Seq[Any](format.raw/*117.31*/("""
                            """),format.raw/*118.29*/("""<li>
                        """)))}),format.raw/*119.26*/("""
                            """),format.raw/*120.29*/("""<a href=""""),_display_(/*120.39*/routes/*120.45*/.GerenteController.usuarios),format.raw/*120.72*/(""""><span class="glyphicon glyphicon-user" aria-hidden="true"></span> Usuarios</a>
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
                                """),_display_(/*139.34*/opcion),format.raw/*139.40*/("""
                                """),format.raw/*140.33*/("""<small>"""),_display_(/*140.41*/descripcion),format.raw/*140.52*/("""</small>
                            </h1>
                            """),_display_(/*142.30*/content),format.raw/*142.37*/("""

                            """),format.raw/*144.29*/("""<div class="well">
                                
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




        

        """),format.raw/*171.32*/("""
        

        """),format.raw/*174.9*/("""<script src=""""),_display_(/*174.23*/routes/*174.29*/.Assets.versioned("javascripts/jquery.js")),format.raw/*174.71*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*175.23*/routes/*175.29*/.Assets.versioned("javascripts/bootstrap.min.js")),format.raw/*175.78*/("""" type="text/javascript"></script>
        """),_display_(/*176.10*/js),format.raw/*176.12*/("""
    """),format.raw/*177.5*/("""</body>
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
                  SOURCE: /home/sarahi/siiaf-play/app/views/gerente/base.scala.html
                  HASH: 55eb69d185f21efa9f6b6a041539d0b45d82a5be
                  MATRIX: 787->2|1009->128|1037->130|1116->235|1151->244|1185->252|1210->257|1303->324|1317->330|1379->371|1467->432|1482->438|1543->477|1630->537|1645->543|1717->593|1800->649|1815->655|1882->700|1981->772|1996->778|2076->836|2115->848|2139->851|2181->866|2947->1605|2962->1611|3010->1638|3395->1995|3414->2004|3452->2020|3482->2021|3715->2227|3730->2233|3773->2255|4279->2734|4310->2756|4349->2757|4406->2786|4470->2831|4483->2835|4522->2836|4579->2865|4640->2895|4697->2924|4734->2934|4749->2940|4797->2967|4966->3109|4999->3133|5038->3134|5095->3163|5159->3208|5172->3212|5211->3213|5268->3242|5329->3272|5386->3301|5423->3311|5438->3317|5488->3346|5654->3485|5686->3508|5725->3509|5782->3538|5846->3583|5859->3587|5898->3588|5955->3617|6016->3647|6073->3676|6110->3686|6125->3692|6174->3720|6340->3859|6371->3881|6410->3882|6467->3911|6531->3956|6544->3960|6583->3961|6640->3990|6701->4020|6758->4049|6795->4059|6810->4065|6858->4092|7027->4234|7061->4259|7100->4260|7157->4289|7221->4334|7234->4338|7273->4339|7330->4368|7391->4398|7448->4427|7485->4437|7500->4443|7551->4473|7724->4619|7761->4647|7800->4648|7857->4677|7921->4722|7934->4726|7973->4727|8030->4756|8092->4786|8150->4815|8188->4825|8204->4831|8259->4864|8431->5008|8468->5035|8508->5036|8566->5065|8631->5110|8645->5114|8685->5115|8743->5144|8805->5174|8863->5203|8901->5213|8917->5219|8971->5251|9143->5395|9175->5417|9215->5418|9273->5447|9338->5492|9352->5496|9392->5497|9450->5526|9512->5556|9570->5585|9608->5595|9624->5601|9673->5628|10287->6214|10315->6220|10377->6253|10413->6261|10446->6272|10546->6344|10575->6351|10634->6381|11062->6870|11109->6889|11151->6903|11167->6909|11231->6951|11316->7008|11332->7014|11403->7063|11475->7107|11499->7109|11532->7114
                  LINES: 27->2|32->2|34->4|37->7|38->8|38->8|38->8|39->9|39->9|39->9|40->10|40->10|40->10|41->11|41->11|41->11|42->12|42->12|42->12|43->13|43->13|43->13|44->14|44->14|46->16|61->31|61->31|61->31|67->37|67->37|67->37|67->37|71->41|71->41|71->41|80->50|80->50|80->50|81->51|82->52|82->52|82->52|83->53|84->54|85->55|85->55|85->55|85->55|88->58|88->58|88->58|89->59|90->60|90->60|90->60|91->61|92->62|93->63|93->63|93->63|93->63|97->67|97->67|97->67|98->68|99->69|99->69|99->69|100->70|101->71|102->72|102->72|102->72|102->72|107->77|107->77|107->77|108->78|109->79|109->79|109->79|110->80|111->81|112->82|112->82|112->82|112->82|116->86|116->86|116->86|117->87|118->88|118->88|118->88|119->89|120->90|121->91|121->91|121->91|121->91|126->96|126->96|126->96|127->97|128->98|128->98|128->98|129->99|130->100|131->101|131->101|131->101|131->101|135->105|135->105|135->105|136->106|137->107|137->107|137->107|138->108|139->109|140->110|140->110|140->110|140->110|145->115|145->115|145->115|146->116|147->117|147->117|147->117|148->118|149->119|150->120|150->120|150->120|150->120|169->139|169->139|170->140|170->140|170->140|172->142|172->142|174->144|200->171|203->174|203->174|203->174|203->174|204->175|204->175|204->175|205->176|205->176|206->177
                  -- GENERATED --
              */
          