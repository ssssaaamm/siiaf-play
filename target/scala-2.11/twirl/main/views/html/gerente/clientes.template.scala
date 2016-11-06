
package views.html.gerente

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object clientes_Scope0 {
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

class clientes extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[Form[Cliente],List[Cliente],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(cliente_form: Form[Cliente], clientes_list: List[Cliente] ):play.twirl.api.HtmlFormat.Appendable = {
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
			"""),format.raw/*24.4*/("""if(window.location.pathname!='"""),_display_(/*24.35*/routes/*24.41*/.GerenteController.clientes),format.raw/*24.68*/("""')"""),format.raw/*24.70*/("""{"""),format.raw/*24.71*/("""
				
				"""),format.raw/*26.5*/("""window.location='"""),_display_(/*26.23*/routes/*26.29*/.GerenteController.clientes),format.raw/*26.56*/("""';
			"""),format.raw/*27.4*/("""}"""),format.raw/*27.5*/("""	
		"""),format.raw/*28.3*/("""}"""),format.raw/*28.4*/(""");
	</script>
""")))};def /*34.2*/errores_formulario/*34.20*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*34.22*/("""

	"""),_display_(/*36.3*/if(cliente_form.hasGlobalErrors)/*36.35*/ {_display_(Seq[Any](format.raw/*36.37*/("""

        """),_display_(/*38.10*/for(error <- cliente_form.globalErrors) yield /*38.49*/ {_display_(Seq[Any](format.raw/*38.51*/("""
	        """),format.raw/*39.10*/("""<div class="alert alert-danger">
				<a href="#" class="close" data-dismiss="alert" aria-label="close">&times;</a>
				<strong>"""),_display_(/*41.14*/Messages(error.messages, error.arguments.toArray: _*)),format.raw/*41.67*/("""</strong>
			</div>
        """)))}),format.raw/*43.10*/("""
	""")))}),format.raw/*44.3*/("""



	"""),_display_(/*48.3*/for(error <- cliente_form("nombre").errors) yield /*48.46*/ {_display_(Seq[Any](format.raw/*48.48*/("""
    	"""),format.raw/*49.6*/("""<div class="alert alert-danger">
			<a href="#" class="close" data-dismiss="alert" aria-label="close">&times;</a>
			<strong>"""),_display_(/*51.13*/Messages(error.messages, error.arguments.toArray: _*)),format.raw/*51.66*/("""</strong>
		</div>
	""")))}),format.raw/*53.3*/("""


	"""),_display_(/*56.3*/for(error <- cliente_form("nit").errors) yield /*56.43*/ {_display_(Seq[Any](format.raw/*56.45*/("""
    	"""),format.raw/*57.6*/("""<div class="alert alert-danger">
			<a href="#" class="close" data-dismiss="alert" aria-label="close">&times;</a>
			<strong>"""),_display_(/*59.13*/Messages(error.messages, error.arguments.toArray: _*)),format.raw/*59.66*/("""</strong>
		</div>
	""")))}),format.raw/*61.3*/("""



	"""),_display_(/*65.3*/for(error <- cliente_form("descripcion").errors) yield /*65.51*/ {_display_(Seq[Any](format.raw/*65.53*/("""
    	"""),format.raw/*66.6*/("""<div class="alert alert-danger">
			<a href="#" class="close" data-dismiss="alert" aria-label="close">&times;</a>
			<strong>"""),_display_(/*68.13*/Messages(error.messages, error.arguments.toArray: _*)),format.raw/*68.66*/("""</strong>
		</div>
	""")))}),format.raw/*70.3*/("""

	"""),_display_(/*72.3*/for(error <- cliente_form("password").errors) yield /*72.48*/ {_display_(Seq[Any](format.raw/*72.50*/("""
    	"""),format.raw/*73.6*/("""<div class="alert alert-danger">
			<a href="#" class="close" data-dismiss="alert" aria-label="close">&times;</a>
			<strong>"""),_display_(/*75.13*/Messages(error.messages, error.arguments.toArray: _*)),format.raw/*75.66*/("""</strong>
		</div>
	""")))}),format.raw/*77.3*/("""


""")))};
Seq[Any](format.raw/*1.62*/("""
"""),format.raw/*3.1*/("""
"""),format.raw/*6.2*/("""

"""),format.raw/*30.2*/("""



"""),format.raw/*80.2*/("""




"""),_display_(/*85.2*/gerente/*85.9*/.base("Manager SIIAF","Clientes","Gestion de clientes","clientes",css,js)/*85.82*/{_display_(Seq[Any](format.raw/*85.83*/("""
	"""),format.raw/*86.2*/("""<button type="button" id="main-add-button" class="btn btn-primary" data-toggle="modal" data-target="#mod-new"><span class="glyphicon glyphicon-plus" aria-hidden="true"></span> Agregar Cliente</button>

	"""),_display_(/*88.3*/if(flash.containsKey("exito"))/*88.33*/{_display_(Seq[Any](format.raw/*88.34*/("""
		"""),format.raw/*89.3*/("""<div class="alert alert-success fade in">
			<a href="#" class="close" data-dismiss="alert" aria-label="close">&times;</a>
			<span class="glyphicon glyphicon-ok" aria-hidden="true"></span>
			<strong>"""),_display_(/*92.13*/flash/*92.18*/.get("exito")),format.raw/*92.31*/("""</strong>
		</div>
	""")))}),format.raw/*94.3*/("""


  	"""),format.raw/*97.4*/("""<!-- Modal -->
	<div class="modal fade" id="mod-new" role="dialog">

		<div class="modal-dialog">

		<!-- Modal content-->
		<div class="modal-content">
			"""),_display_(/*104.5*/form(action=routes.GerenteController.cliente_new())/*104.56*/{_display_(Seq[Any](format.raw/*104.57*/("""
				"""),format.raw/*105.5*/("""<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal">&times;</button>
					<h4 class="modal-title">Agregar nuevo cliente</h4>
				</div>
				"""),_display_(/*109.6*/errores_formulario),format.raw/*109.24*/("""
				"""),format.raw/*110.5*/("""<div class="modal-body">


					 <div class="form-group">
						"""),_display_(/*114.8*/inputText(cliente_form("id"), '_showConstraints -> false ,'readonly -> "readonly", '_showErrors -> false,'class -> "form-control", 'placeholder -> "Id del cliente",'_label -> "Id: ")),format.raw/*114.190*/("""
					 """),format.raw/*115.7*/("""</div>

	        		 <div class="form-group">
	        		 	"""),_display_(/*118.15*/inputText(cliente_form("nombre"), '_showConstraints -> false , '_showErrors -> false,'class -> "form-control", 'placeholder -> "Nombre de la empresa Cliente", '_label -> "Nombre: ")),format.raw/*118.196*/("""
	        		 """),format.raw/*119.13*/("""</div>

	        		 <div class="form-group">
	        		 	"""),_display_(/*122.15*/inputText(cliente_form("nit"), '_showConstraints -> false , '_showErrors -> false,'class -> "form-control", 'placeholder -> "NIT de la empresa", '_label -> "NIT: ")),format.raw/*122.179*/("""
	        		 """),format.raw/*123.13*/("""</div>

					 <div class="form-group">
						"""),_display_(/*126.8*/textarea(cliente_form("descripcion"), 'rows -> 5, '_showConstraints -> false, '_showErrors -> false ,'class -> "form-control", 'placeholder -> "De una brebe descripcion de la empresa",'_label -> "Descripcion: ")),format.raw/*126.219*/("""
					 """),format.raw/*127.7*/("""</div>


				</div>
				<div class="modal-footer">
						<button type="button" class="btn btn-default" data-dismiss="modal">Cerrar</button>
						<button type="submit" class="btn btn-primary"><span class="glyphicon glyphicon-plus" aria-hidden="true"></span> Agregar</button>
				</div>
			""")))}),format.raw/*135.5*/("""
		"""),format.raw/*136.3*/("""</div>

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
				<th>Id</th>
				<th class="col-md-5 col-xs-5">Nombre</th>
				<th class="col-md-4 col-xs-4">Descripcion</th>
				<th class="col-md-3 col-xs-3 center-column">Editar</th>
				<th class="col-md-3 col-xs-3 center-column">Eliminar</th>
			</tr>
			<tr class="warning no-result">
				<td colspan="4"><i class="fa fa-warning"></i> No hay resultados</td>
			</tr>
		</thead>
		<tbody>
			"""),_display_(/*166.5*/for(cliente <- clientes_list) yield /*166.34*/{_display_(Seq[Any](format.raw/*166.35*/("""
				"""),format.raw/*167.5*/("""<tr>
					<td>"""),_display_(/*168.11*/cliente/*168.18*/.id),format.raw/*168.21*/("""</td>
					<td>"""),_display_(/*169.11*/cliente/*169.18*/.nombre),format.raw/*169.25*/("""</td>
					<td>"""),_display_(/*170.11*/cliente/*170.18*/.nit),format.raw/*170.22*/("""</td>
					<td>"""),_display_(/*171.11*/cliente/*171.18*/.descripcion),format.raw/*171.30*/("""</td>
					<td><button class="btn btn-success btn-xs" data-toggle="modal" data-target="#mod-edit-"""),_display_(/*172.93*/cliente/*172.100*/.id),format.raw/*172.103*/(""""><span class="glyphicon glyphicon-edit"></span> Editar</button></td>
					<td><button class="btn btn-danger btn-xs" data-toggle="modal" data-target="#mod-remove-"""),_display_(/*173.94*/cliente/*173.101*/.id),format.raw/*173.104*/(""""><span class="glyphicon glyphicon-trash"></span> Eliminar</button></td>
				</tr>



				<!-- Modal -->
				<div class="modal fade" id="mod-edit-"""),_display_(/*179.43*/cliente/*179.50*/.id),format.raw/*179.53*/("""" role="dialog">
					
					<div class="modal-dialog">

					<!-- Modal content-->
					<div class="modal-content">
						"""),_display_(/*185.8*/form(action=routes.GerenteController.cliente_edit(cliente.id))/*185.70*/{_display_(Seq[Any](format.raw/*185.71*/("""
							"""),format.raw/*186.8*/("""<div class="modal-header">
								<button type="button" class="close" data-dismiss="modal">&times;</button>
								<h4 class="modal-title">Editar cliente: """),_display_(/*188.50*/cliente/*188.57*/.nombre),format.raw/*188.64*/("""</h4>
								</div>
								"""),_display_(/*190.10*/errores_formulario),format.raw/*190.28*/("""
								"""),format.raw/*191.9*/("""<div class="modal-body">


									 <div class="form-group">
					        		 	"""),_display_(/*195.19*/inputText(cliente.getForm()("id"), '_showConstraints -> false, 'readonly -> "readonly" , '_showErrors -> false,'class -> "form-control", 'placeholder -> "Id", '_label -> "Id: ")),format.raw/*195.196*/("""
					        		 """),format.raw/*196.17*/("""</div>

					        		 <div class="form-group">
					        		 	"""),_display_(/*199.19*/inputText(cliente.getForm()("nombre"), '_showConstraints -> false , '_showErrors -> false,'class -> "form-control", 'placeholder -> "Nombre del empresa", '_label -> "Nombre: ")),format.raw/*199.195*/("""
					        		 """),format.raw/*200.17*/("""</div>

					        		 <div class="form-group">
					        		 	"""),_display_(/*203.19*/inputText(cliente.getForm()("nit"), '_showConstraints -> false , '_showErrors -> false,'class -> "form-control", 'placeholder -> "NIT de la empresa", '_label -> "NIT: ")),format.raw/*203.188*/("""
					        		 """),format.raw/*204.17*/("""</div>

					        		 <div class="form-group">
										"""),_display_(/*207.12*/textarea(cliente_form("descripcion"), 'rows -> 5, '_showConstraints -> false, '_showErrors -> false ,'class -> "form-control", 'placeholder -> "De una brebe descripcion de la empresa",'_label -> "Descripcion: ")),format.raw/*207.223*/("""
									 """),format.raw/*208.11*/("""</div>



								</div>
								<div class="modal-footer">
									<button type="button" class="btn btn-default" data-dismiss="modal">Cerrar</button>
									<button type="submit" class="btn btn-primary"><span class="glyphicon glyphicon-floppy-disk" aria-hidden="true"></span> Guardar</button>
								</div>
							</div>
						""")))}),format.raw/*218.8*/("""
					"""),format.raw/*219.6*/("""</div>
				</div>





				<!-- Modal -->
				<div class="modal fade" id="mod-remove-"""),_display_(/*227.45*/cliente/*227.52*/.id),format.raw/*227.55*/("""" role="dialog">
					<div class="modal-dialog">

					<!-- Modal content-->
					<div class="modal-content">
						<div class="modal-header">
							<button type="button" class="close" data-dismiss="modal">&times;</button>
							<h4 class="modal-title">Eliminar cliente: """),_display_(/*234.51*/cliente/*234.58*/.nombre),format.raw/*234.65*/("""</h4>
							</div>
							<div class="modal-body">

								¿Esta seguro que desea eliminar el cliente?.
								El cliente ya no tendra acceso al sistema.


							</div>
							<div class="modal-footer">
								<form>
								<button type="button" class="btn btn-default" data-dismiss="modal">Cerrar</button>							
								<button type="submit" class="btn btn-danger" formmethod="POST" formaction=""""),_display_(/*246.85*/routes/*246.91*/.GerenteController.cliente_remove(cliente.id)),format.raw/*246.136*/(""""><span class="glyphicon glyphicon-trash" aria-hidden="true"></span> Eliminar</button>
								</form>
							</div>
						</div>

					</div>
				</div>


			""")))}),format.raw/*255.5*/("""
		"""),format.raw/*256.3*/("""</tbody>
	</table>
	</div>

""")))}))
      }
    }
  }

  def render(cliente_form:Form[Cliente],clientes_list:List[Cliente]): play.twirl.api.HtmlFormat.Appendable = apply(cliente_form,clientes_list)

  def f:((Form[Cliente],List[Cliente]) => play.twirl.api.HtmlFormat.Appendable) = (cliente_form,clientes_list) => apply(cliente_form,clientes_list)

  def ref: this.type = this

}


}

/**/
object clientes extends clientes_Scope0.clientes
              /*
                  -- GENERATED --
                  DATE: Sun Nov 06 09:16:25 CST 2016
                  SOURCE: /home/samuel/Desarrollo/siiaf/app/views/gerente/clientes.scala.html
                  HASH: 756850da0763707677c953a61c36afc22717d77f
                  MATRIX: 780->1|933->81|943->84|1022->86|1050->88|1121->133|1135->139|1208->191|1234->198|1243->200|1322->202|1350->204|1390->218|1404->224|1475->275|1570->344|1609->374|1649->376|1679->379|1747->419|1776->420|1815->431|1847->436|1861->441|1895->454|1946->478|1974->479|2024->499|2055->503|2174->594|2203->595|2234->599|2292->630|2307->636|2355->663|2385->665|2414->666|2451->676|2496->694|2511->700|2559->727|2592->733|2620->734|2651->738|2679->739|2717->759|2744->777|2825->779|2855->783|2896->815|2936->817|2974->828|3029->867|3069->869|3107->879|3262->1007|3336->1060|3396->1089|3429->1092|3461->1098|3520->1141|3560->1143|3593->1149|3746->1275|3820->1328|3871->1349|3902->1354|3958->1394|3998->1396|4031->1402|4184->1528|4258->1581|4309->1602|4341->1608|4405->1656|4445->1658|4478->1664|4631->1790|4705->1843|4756->1864|4786->1868|4847->1913|4887->1915|4920->1921|5073->2047|5147->2100|5198->2121|5241->61|5268->79|5295->195|5324->754|5355->2125|5387->2131|5402->2138|5484->2211|5523->2212|5552->2214|5782->2418|5821->2448|5860->2449|5890->2452|6119->2654|6133->2659|6167->2672|6218->2693|6251->2699|6435->2856|6496->2907|6536->2908|6569->2913|6774->3091|6814->3109|6847->3114|6939->3179|7144->3361|7179->3368|7266->3427|7470->3608|7512->3621|7599->3680|7786->3844|7828->3857|7901->3903|8135->4114|8170->4121|8491->4411|8522->4414|9252->5117|9298->5146|9338->5147|9371->5152|9414->5167|9431->5174|9456->5177|9500->5193|9517->5200|9546->5207|9590->5223|9607->5230|9633->5234|9677->5250|9694->5257|9728->5269|9854->5367|9872->5374|9898->5377|10089->5540|10107->5547|10133->5550|10308->5697|10325->5704|10350->5707|10500->5830|10572->5892|10612->5893|10648->5901|10834->6059|10851->6066|10880->6073|10938->6103|10978->6121|11015->6130|11123->6210|11323->6387|11369->6404|11464->6471|11663->6647|11709->6664|11804->6731|11996->6900|12042->6917|12130->6977|12364->7188|12404->7199|12768->7532|12802->7538|12916->7624|12933->7631|12958->7634|13260->7908|13277->7915|13306->7922|13738->8326|13754->8332|13822->8377|14013->8537|14044->8540
                  LINES: 27->1|31->4|31->4|33->4|34->5|34->5|34->5|34->5|35->8|35->8|37->8|38->9|38->9|38->9|38->9|41->12|41->12|41->12|42->13|43->14|43->14|44->15|44->15|44->15|44->15|45->16|45->16|47->18|50->21|52->23|52->23|53->24|53->24|53->24|53->24|53->24|53->24|55->26|55->26|55->26|55->26|56->27|56->27|57->28|57->28|59->34|59->34|61->34|63->36|63->36|63->36|65->38|65->38|65->38|66->39|68->41|68->41|70->43|71->44|75->48|75->48|75->48|76->49|78->51|78->51|80->53|83->56|83->56|83->56|84->57|86->59|86->59|88->61|92->65|92->65|92->65|93->66|95->68|95->68|97->70|99->72|99->72|99->72|100->73|102->75|102->75|104->77|108->1|109->3|110->6|112->30|116->80|121->85|121->85|121->85|121->85|122->86|124->88|124->88|124->88|125->89|128->92|128->92|128->92|130->94|133->97|140->104|140->104|140->104|141->105|145->109|145->109|146->110|150->114|150->114|151->115|154->118|154->118|155->119|158->122|158->122|159->123|162->126|162->126|163->127|171->135|172->136|202->166|202->166|202->166|203->167|204->168|204->168|204->168|205->169|205->169|205->169|206->170|206->170|206->170|207->171|207->171|207->171|208->172|208->172|208->172|209->173|209->173|209->173|215->179|215->179|215->179|221->185|221->185|221->185|222->186|224->188|224->188|224->188|226->190|226->190|227->191|231->195|231->195|232->196|235->199|235->199|236->200|239->203|239->203|240->204|243->207|243->207|244->208|254->218|255->219|263->227|263->227|263->227|270->234|270->234|270->234|282->246|282->246|282->246|291->255|292->256
                  -- GENERATED --
              */
          