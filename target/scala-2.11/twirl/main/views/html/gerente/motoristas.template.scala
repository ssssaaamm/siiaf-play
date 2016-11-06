
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

class motoristas extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[Form[Motorista],List[Motorista],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(motorista_form: Form[Motorista], motoristas_list: List[Motorista] ):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import helper._
def /*4.2*/css/*4.5*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*4.7*/("""
	"""),format.raw/*5.2*/("""<link rel="stylesheet" media="screen" href=""""),_display_(/*5.47*/routes/*5.53*/.Assets.versioned("stylesheets/bootstrap-table.css")),format.raw/*5.105*/("""">
""")))};def /*8.2*/js/*8.4*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*8.6*/("""
	"""),format.raw/*9.2*/("""<script src=""""),_display_(/*9.16*/routes/*9.22*/.Assets.versioned("javascripts/bootstrap-table.js")),format.raw/*9.73*/("""" type="text/javascript"></script>

	<!--fix modal open at edit-->
	"""),_display_(/*12.3*/if(flash.containsKey("modal"))/*12.33*/ {_display_(Seq[Any](format.raw/*12.35*/("""
		"""),format.raw/*13.3*/("""<script>
	    	$(window).load(function()"""),format.raw/*14.32*/("""{"""),format.raw/*14.33*/("""
	        	"""),format.raw/*15.11*/("""$('#"""),_display_(/*15.16*/flash/*15.21*/.get("modal")),format.raw/*15.34*/("""').modal('show');
	    	"""),format.raw/*16.7*/("""}"""),format.raw/*16.8*/(""");
	    </script>
	""")))}),format.raw/*18.3*/("""


	"""),format.raw/*21.2*/("""<!-- fix modal close at edit -->
	<script>
		$('.modal').on('hidden.bs.modal', function () """),format.raw/*23.49*/("""{"""),format.raw/*23.50*/("""
			"""),format.raw/*24.4*/("""if(window.location.pathname!='"""),_display_(/*24.35*/routes/*24.41*/.GerenteController.motoristas),format.raw/*24.70*/("""')"""),format.raw/*24.72*/("""{"""),format.raw/*24.73*/("""
				
				"""),format.raw/*26.5*/("""window.location='"""),_display_(/*26.23*/routes/*26.29*/.GerenteController.motoristas),format.raw/*26.58*/("""';
			"""),format.raw/*27.4*/("""}"""),format.raw/*27.5*/("""	
		"""),format.raw/*28.3*/("""}"""),format.raw/*28.4*/(""");
	</script>
""")))};def /*34.2*/errores_formulario/*34.20*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*34.22*/("""

	"""),_display_(/*36.3*/if(motorista_form.hasGlobalErrors)/*36.37*/ {_display_(Seq[Any](format.raw/*36.39*/("""

        """),_display_(/*38.10*/for(error <- motorista_form.globalErrors) yield /*38.51*/ {_display_(Seq[Any](format.raw/*38.53*/("""
	        """),format.raw/*39.10*/("""<div class="alert alert-danger">
				<a href="#" class="close" data-dismiss="alert" aria-label="close">&times;</a>
				<strong>"""),_display_(/*41.14*/Messages(error.messages, error.arguments.toArray: _*)),format.raw/*41.67*/("""</strong>
			</div>
        """)))}),format.raw/*43.10*/("""
	""")))}),format.raw/*44.3*/("""


	"""),_display_(/*47.3*/for(error <- motorista_form("codigo").errors) yield /*47.48*/ {_display_(Seq[Any](format.raw/*47.50*/("""
    	"""),format.raw/*48.6*/("""<div class="alert alert-danger">
			<a href="#" class="close" data-dismiss="alert" aria-label="close">&times;</a>
			<strong>"""),_display_(/*50.13*/Messages(error.messages, error.arguments.toArray: _*)),format.raw/*50.66*/("""</strong>
		</div>
	""")))}),format.raw/*52.3*/("""


	"""),_display_(/*55.3*/for(error <- motorista_form("nombre").errors) yield /*55.48*/ {_display_(Seq[Any](format.raw/*55.50*/("""
    	"""),format.raw/*56.6*/("""<div class="alert alert-danger">
			<a href="#" class="close" data-dismiss="alert" aria-label="close">&times;</a>
			<strong>"""),_display_(/*58.13*/Messages(error.messages, error.arguments.toArray: _*)),format.raw/*58.66*/("""</strong>
		</div>
	""")))}),format.raw/*60.3*/("""



	"""),_display_(/*64.3*/for(error <- motorista_form("dui").errors) yield /*64.45*/ {_display_(Seq[Any](format.raw/*64.47*/("""
    	"""),format.raw/*65.6*/("""<div class="alert alert-danger">
			<a href="#" class="close" data-dismiss="alert" aria-label="close">&times;</a>
			<strong>"""),_display_(/*67.13*/Messages(error.messages, error.arguments.toArray: _*)),format.raw/*67.66*/("""</strong>
		</div>
	""")))}),format.raw/*69.3*/("""



	"""),_display_(/*73.3*/for(error <- motorista_form("nit").errors) yield /*73.45*/ {_display_(Seq[Any](format.raw/*73.47*/("""
    	"""),format.raw/*74.6*/("""<div class="alert alert-danger">
			<a href="#" class="close" data-dismiss="alert" aria-label="close">&times;</a>
			<strong>"""),_display_(/*76.13*/Messages(error.messages, error.arguments.toArray: _*)),format.raw/*76.66*/("""</strong>
		</div>
	""")))}),format.raw/*78.3*/("""


	
	"""),_display_(/*82.3*/for(error <- motorista_form("licencia").errors) yield /*82.50*/ {_display_(Seq[Any](format.raw/*82.52*/("""
    	"""),format.raw/*83.6*/("""<div class="alert alert-danger">
			<a href="#" class="close" data-dismiss="alert" aria-label="close">&times;</a>
			<strong>"""),_display_(/*85.13*/Messages(error.messages, error.arguments.toArray: _*)),format.raw/*85.66*/("""</strong>
		</div>
	""")))}),format.raw/*87.3*/("""


""")))};
Seq[Any](format.raw/*1.70*/("""
"""),format.raw/*3.1*/("""
"""),format.raw/*6.2*/("""

"""),format.raw/*30.2*/("""



"""),format.raw/*90.2*/("""




"""),_display_(/*95.2*/gerente/*95.9*/.base("Manager SIIAF","Motoristas","Gestion de motoristas","motoristas",css,js)/*95.88*/{_display_(Seq[Any](format.raw/*95.89*/("""
	"""),format.raw/*96.2*/("""<button type="button" id="main-add-button" class="btn btn-primary" data-toggle="modal" data-target="#mod-new"><span class="glyphicon glyphicon-plus" aria-hidden="true"></span> Agregar Motorista</button>

	"""),_display_(/*98.3*/if(flash.containsKey("exito"))/*98.33*/{_display_(Seq[Any](format.raw/*98.34*/("""
		"""),format.raw/*99.3*/("""<div class="alert alert-success fade in">
			<a href="#" class="close" data-dismiss="alert" aria-label="close">&times;</a>
			<span class="glyphicon glyphicon-ok" aria-hidden="true"></span>
			<strong>"""),_display_(/*102.13*/flash/*102.18*/.get("exito")),format.raw/*102.31*/("""</strong>
		</div>
	""")))}),format.raw/*104.3*/("""


  	"""),format.raw/*107.4*/("""<!-- Modal -->
	<div class="modal fade" id="mod-new" role="dialog">

		<div class="modal-dialog">

		<!-- Modal content-->
		<div class="modal-content">
			"""),_display_(/*114.5*/form(action=routes.GerenteController.cabezal_new())/*114.56*/{_display_(Seq[Any](format.raw/*114.57*/("""
				"""),format.raw/*115.5*/("""<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal">&times;</button>
					<h4 class="modal-title">Agregar nuevo cabezal</h4>
				</div>
				"""),_display_(/*119.6*/errores_formulario),format.raw/*119.24*/("""
				"""),format.raw/*120.5*/("""<div class="modal-body">



					 <div class="form-group">
						"""),_display_(/*125.8*/inputText(motorista_form("codigo"), '_showConstraints -> false, '_showErrors -> false ,'class -> "form-control", 'placeholder -> "Codigo de Motorista",'_label -> "Codigo: ")),format.raw/*125.181*/("""
					 """),format.raw/*126.7*/("""</div>

	        		 <div class="form-group">
	        		 	"""),_display_(/*129.15*/inputText(motorista_form("nombre"), '_showConstraints -> false , '_showErrors -> false,'class -> "form-control", 'placeholder -> "Nombre del Motorista", '_label -> "Nombre: ")),format.raw/*129.190*/("""
	        		 """),format.raw/*130.13*/("""</div>

	        		 <div class="form-group">
	        		 	"""),_display_(/*133.15*/inputText(motorista_form("dui"), '_showConstraints -> false , '_showErrors -> false,'class -> "form-control", 'placeholder -> "Numero de DUI", '_label -> "DUI: ")),format.raw/*133.177*/("""
	        		 """),format.raw/*134.13*/("""</div>

	        		 <div class="form-group">
	        		 	"""),_display_(/*137.15*/inputText(motorista_form("nit"), '_showConstraints -> false , '_showErrors -> false,'class -> "form-control", 'placeholder -> "Numero de NIT", '_label -> "NIT: ")),format.raw/*137.177*/("""
	        		 """),format.raw/*138.13*/("""</div>

					 <div class="form-group">
						"""),_display_(/*141.8*/inputText(motorista_form("placa"), '_showConstraints -> false , '_showErrors -> false,'class -> "form-control", 'placeholder -> "Numero de licencia",'_label -> "Licencia: ")),format.raw/*141.181*/("""
					 """),format.raw/*142.7*/("""</div>



				</div>
				<div class="modal-footer">
						<button type="button" class="btn btn-default" data-dismiss="modal">Cerrar</button>
						<button type="submit" class="btn btn-primary"><span class="glyphicon glyphicon-plus" aria-hidden="true"></span> Agregar</button>
				</div>
			""")))}),format.raw/*151.5*/("""
		"""),format.raw/*152.3*/("""</div>

		</div>
	</div>

                	





	<div class="table-responsive">
		<div class="form-group pull-right">
		<input type="text" class="search form-control" placeholder="Busqueda">
	</div>
	<span class="counter pull-right"></span>
	<table class="table table-hover table-bordered results">
		<thead>
			<tr>
				<th>Codigo</th>
				<th class="col-md-5 col-xs-5">Nombre</th>
				<th class="col-md-4 col-xs-4">DUI</th>
				<th class="col-md-3 col-xs-3">NIT</th>
				<th class="col-md-3 col-xs-3">Licencia</th>
				<th class="col-md-3 col-xs-3 center-column">Editar</th>
				<th class="col-md-3 col-xs-3 center-column">Eliminar</th>
			</tr>
			<tr class="warning no-result">
				<td colspan="4"><i class="fa fa-warning"></i> No hay resultados</td>
			</tr>
		</thead>
		<tbody>
			"""),_display_(/*184.5*/for(motorista <- motoristas_list) yield /*184.38*/{_display_(Seq[Any](format.raw/*184.39*/("""
				"""),format.raw/*185.5*/("""<tr>
					<td>"""),_display_(/*186.11*/motorista/*186.20*/.codigo),format.raw/*186.27*/("""</td>
					<td>"""),_display_(/*187.11*/motorista/*187.20*/.nombre),format.raw/*187.27*/("""</td>
					<td>"""),_display_(/*188.11*/motorista/*188.20*/.dui),format.raw/*188.24*/("""</td>
					<td>"""),_display_(/*189.11*/motorista/*189.20*/.nit),format.raw/*189.24*/("""</td>
					<td>"""),_display_(/*190.11*/motorista/*190.20*/.licencia),format.raw/*190.29*/("""</td>
					<td><button class="btn btn-success btn-xs" data-toggle="modal" data-target="#mod-edit-"""),_display_(/*191.93*/motorista/*191.102*/.id),format.raw/*191.105*/(""""><span class="glyphicon glyphicon-edit"></span> Editar</button></td>
					<td><button class="btn btn-danger btn-xs" data-toggle="modal" data-target="#mod-remove-"""),_display_(/*192.94*/motorista/*192.103*/.id),format.raw/*192.106*/(""""><span class="glyphicon glyphicon-trash"></span> Eliminar</button></td>
				</tr>



				<!-- Modal -->
				<div class="modal fade" id="mod-edit-"""),_display_(/*198.43*/motorista/*198.52*/.id),format.raw/*198.55*/("""" role="dialog">
					
					<div class="modal-dialog">

					<!-- Modal content-->
					<div class="modal-content">
						"""),_display_(/*204.8*/form(action=routes.GerenteController.motorista_edit(motorista.id))/*204.74*/{_display_(Seq[Any](format.raw/*204.75*/("""
							"""),format.raw/*205.8*/("""<div class="modal-header">
								<button type="button" class="close" data-dismiss="modal">&times;</button>
								<h4 class="modal-title">Editar motorista: """),_display_(/*207.52*/motorista/*207.61*/.nombre),format.raw/*207.68*/("""</h4>
								</div>
								"""),_display_(/*209.10*/errores_formulario),format.raw/*209.28*/("""
								"""),format.raw/*210.9*/("""<div class="modal-body">


									 <div class="form-group">
					        		 	"""),_display_(/*214.19*/inputText(motorista.getForm()("id"), '_showConstraints -> false, 'readonly -> "readonly" , '_showErrors -> false,'class -> "form-control", 'placeholder -> "Id", '_label -> "Id: ")),format.raw/*214.198*/("""
					        		 """),format.raw/*215.17*/("""</div>

					        		 <div class="form-group">
					        		 	"""),_display_(/*218.19*/inputText(motorista.getForm()("codigo"), '_showConstraints -> false , '_showErrors -> false,'class -> "form-control", 'placeholder -> "Codigo del motorista", '_label -> "Codigo: ")),format.raw/*218.199*/("""
					        		 """),format.raw/*219.17*/("""</div>

					        		 <div class="form-group">
					        		 	"""),_display_(/*222.19*/inputText(motorista.getForm()("nombre"), '_showConstraints -> false , '_showErrors -> false,'class -> "form-control", 'placeholder -> "Nombre del motorista", '_label -> "Nombre: ")),format.raw/*222.199*/("""
					        		 """),format.raw/*223.17*/("""</div>

									 <div class="form-group">
										"""),_display_(/*226.12*/inputText(motorista.getForm()("dui"), '_showConstraints -> false, '_showErrors -> false ,'class -> "form-control", 'placeholder -> "NUmero de DUI",'_label -> "DUI: ")),format.raw/*226.178*/("""
									 """),format.raw/*227.11*/("""</div>

									 <div class="form-group">
										"""),_display_(/*230.12*/inputText(motorista.getForm()("nit"), '_showConstraints -> false, '_showErrors -> false ,'class -> "form-control", 'placeholder -> "Numero de NIT",'_label -> "NIT: ")),format.raw/*230.178*/("""
									 """),format.raw/*231.11*/("""</div>

									 <div class="form-group">
										"""),_display_(/*234.12*/inputText(motorista.getForm()("licencia"), '_showConstraints -> false, '_showErrors -> false ,'class -> "form-control", 'placeholder -> "Numero de Licencia",'_label -> "Licencia: ")),format.raw/*234.193*/("""
									 """),format.raw/*235.11*/("""</div>



								</div>
								<div class="modal-footer">
									<button type="button" class="btn btn-default" data-dismiss="modal">Cerrar</button>
									<button type="submit" class="btn btn-primary"><span class="glyphicon glyphicon-floppy-disk" aria-hidden="true"></span> Guardar</button>
								</div>
							</div>
						""")))}),format.raw/*245.8*/("""
					"""),format.raw/*246.6*/("""</div>
				</div>





				<!-- Modal -->
				<div class="modal fade" id="mod-remove-"""),_display_(/*254.45*/motorista/*254.54*/.id),format.raw/*254.57*/("""" role="dialog">
					<div class="modal-dialog">

					<!-- Modal content-->
					<div class="modal-content">
						<div class="modal-header">
							<button type="button" class="close" data-dismiss="modal">&times;</button>
							<h4 class="modal-title">Eliminar motorista: """),_display_(/*261.53*/motorista/*261.62*/.nombre),format.raw/*261.69*/("""</h4>
							</div>
							<div class="modal-body">

								¿Esta seguro que desea eliminar el usuario?.
								El usuario ya no tendra acceso al sistema.


							</div>
							<div class="modal-footer">
								<form>
								<button type="button" class="btn btn-default" data-dismiss="modal">Cerrar</button>							
								<button type="submit" class="btn btn-danger" formmethod="POST" formaction=""""),_display_(/*273.85*/routes/*273.91*/.GerenteController.motorista_remove(motorista.id)),format.raw/*273.140*/(""""><span class="glyphicon glyphicon-trash" aria-hidden="true"></span> Eliminar</button>
								</form>
							</div>
						</div>

					</div>
				</div>


			""")))}),format.raw/*282.5*/("""
		"""),format.raw/*283.3*/("""</tbody>
	</table>
	</div>

""")))}))
      }
    }
  }

  def render(motorista_form:Form[Motorista],motoristas_list:List[Motorista]): play.twirl.api.HtmlFormat.Appendable = apply(motorista_form,motoristas_list)

  def f:((Form[Motorista],List[Motorista]) => play.twirl.api.HtmlFormat.Appendable) = (motorista_form,motoristas_list) => apply(motorista_form,motoristas_list)

  def ref: this.type = this

}


}

/**/
object motoristas extends motoristas_Scope0.motoristas
              /*
                  -- GENERATED --
                  DATE: Sun Nov 06 09:16:26 CST 2016
                  SOURCE: /home/samuel/Desarrollo/siiaf/app/views/gerente/motoristas.scala.html
                  HASH: f2fe910d31087f978617756424c15c4850c29b5c
                  MATRIX: 788->1|949->89|959->92|1038->94|1066->96|1137->141|1151->147|1224->199|1250->206|1259->208|1338->210|1366->212|1406->226|1420->232|1491->283|1586->352|1625->382|1665->384|1695->387|1763->427|1792->428|1831->439|1863->444|1877->449|1911->462|1962->486|1990->487|2040->507|2071->511|2190->602|2219->603|2250->607|2308->638|2323->644|2373->673|2403->675|2432->676|2469->686|2514->704|2529->710|2579->739|2612->745|2640->746|2671->750|2699->751|2737->771|2764->789|2845->791|2875->795|2918->829|2958->831|2996->842|3053->883|3093->885|3131->895|3286->1023|3360->1076|3420->1105|3453->1108|3484->1113|3545->1158|3585->1160|3618->1166|3771->1292|3845->1345|3896->1366|3927->1371|3988->1416|4028->1418|4061->1424|4214->1550|4288->1603|4339->1624|4371->1630|4429->1672|4469->1674|4502->1680|4655->1806|4729->1859|4780->1880|4812->1886|4870->1928|4910->1930|4943->1936|5096->2062|5170->2115|5221->2136|5254->2143|5317->2190|5357->2192|5390->2198|5543->2324|5617->2377|5668->2398|5711->69|5738->87|5765->203|5794->766|5825->2402|5857->2408|5872->2415|5960->2494|5999->2495|6028->2497|6260->2703|6299->2733|6338->2734|6368->2737|6598->2939|6613->2944|6648->2957|6700->2978|6734->2984|6918->3141|6979->3192|7019->3193|7052->3198|7257->3376|7297->3394|7330->3399|7423->3465|7619->3638|7654->3645|7741->3704|7939->3879|7981->3892|8068->3951|8253->4113|8295->4126|8382->4185|8567->4347|8609->4360|8682->4406|8878->4579|8913->4586|9235->4877|9266->4880|10083->5670|10133->5703|10173->5704|10206->5709|10249->5724|10268->5733|10297->5740|10341->5756|10360->5765|10389->5772|10433->5788|10452->5797|10478->5801|10522->5817|10541->5826|10567->5830|10611->5846|10630->5855|10661->5864|10787->5962|10807->5971|10833->5974|11024->6137|11044->6146|11070->6149|11245->6296|11264->6305|11289->6308|11439->6431|11515->6497|11555->6498|11591->6506|11779->6666|11798->6675|11827->6682|11885->6712|11925->6730|11962->6739|12070->6819|12272->6998|12318->7015|12413->7082|12616->7262|12662->7279|12757->7346|12960->7526|13006->7543|13088->7597|13277->7763|13317->7774|13399->7828|13588->7994|13628->8005|13710->8059|13914->8240|13954->8251|14318->8584|14352->8590|14466->8676|14485->8685|14510->8688|14814->8964|14833->8973|14862->8980|15294->9384|15310->9390|15382->9439|15573->9599|15604->9602
                  LINES: 27->1|31->4|31->4|33->4|34->5|34->5|34->5|34->5|35->8|35->8|37->8|38->9|38->9|38->9|38->9|41->12|41->12|41->12|42->13|43->14|43->14|44->15|44->15|44->15|44->15|45->16|45->16|47->18|50->21|52->23|52->23|53->24|53->24|53->24|53->24|53->24|53->24|55->26|55->26|55->26|55->26|56->27|56->27|57->28|57->28|59->34|59->34|61->34|63->36|63->36|63->36|65->38|65->38|65->38|66->39|68->41|68->41|70->43|71->44|74->47|74->47|74->47|75->48|77->50|77->50|79->52|82->55|82->55|82->55|83->56|85->58|85->58|87->60|91->64|91->64|91->64|92->65|94->67|94->67|96->69|100->73|100->73|100->73|101->74|103->76|103->76|105->78|109->82|109->82|109->82|110->83|112->85|112->85|114->87|118->1|119->3|120->6|122->30|126->90|131->95|131->95|131->95|131->95|132->96|134->98|134->98|134->98|135->99|138->102|138->102|138->102|140->104|143->107|150->114|150->114|150->114|151->115|155->119|155->119|156->120|161->125|161->125|162->126|165->129|165->129|166->130|169->133|169->133|170->134|173->137|173->137|174->138|177->141|177->141|178->142|187->151|188->152|220->184|220->184|220->184|221->185|222->186|222->186|222->186|223->187|223->187|223->187|224->188|224->188|224->188|225->189|225->189|225->189|226->190|226->190|226->190|227->191|227->191|227->191|228->192|228->192|228->192|234->198|234->198|234->198|240->204|240->204|240->204|241->205|243->207|243->207|243->207|245->209|245->209|246->210|250->214|250->214|251->215|254->218|254->218|255->219|258->222|258->222|259->223|262->226|262->226|263->227|266->230|266->230|267->231|270->234|270->234|271->235|281->245|282->246|290->254|290->254|290->254|297->261|297->261|297->261|309->273|309->273|309->273|318->282|319->283
                  -- GENERATED --
              */
          