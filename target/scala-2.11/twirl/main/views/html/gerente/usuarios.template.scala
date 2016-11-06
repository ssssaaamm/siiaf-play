
package views.html.gerente

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object usuarios_Scope0 {
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

class usuarios extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[Form[Usuario],List[Usuario],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(usuario_form: Form[Usuario], usuarios_list: List[Usuario] ):play.twirl.api.HtmlFormat.Appendable = {
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
			"""),format.raw/*24.4*/("""if(window.location.pathname!='"""),_display_(/*24.35*/routes/*24.41*/.GerenteController.usuarios),format.raw/*24.68*/("""')"""),format.raw/*24.70*/("""{"""),format.raw/*24.71*/("""
				
				"""),format.raw/*26.5*/("""window.location='"""),_display_(/*26.23*/routes/*26.29*/.GerenteController.usuarios),format.raw/*26.56*/("""';
			"""),format.raw/*27.4*/("""}"""),format.raw/*27.5*/("""	
		"""),format.raw/*28.3*/("""}"""),format.raw/*28.4*/(""");
	</script>
""")))};def /*34.2*/errores_formulario/*34.20*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*34.22*/("""

	"""),_display_(/*36.3*/if(usuario_form.hasGlobalErrors)/*36.35*/ {_display_(Seq[Any](format.raw/*36.37*/("""

        """),_display_(/*38.10*/for(error <- usuario_form.globalErrors) yield /*38.49*/ {_display_(Seq[Any](format.raw/*38.51*/("""
	        """),format.raw/*39.10*/("""<div class="alert alert-danger">
				<a href="#" class="close" data-dismiss="alert" aria-label="close">&times;</a>
				<strong>"""),_display_(/*41.14*/Messages(error.messages, error.arguments.toArray: _*)),format.raw/*41.67*/("""</strong>
			</div>
        """)))}),format.raw/*43.10*/("""
	""")))}),format.raw/*44.3*/("""



	"""),_display_(/*48.3*/for(error <- usuario_form("nombre").errors) yield /*48.46*/ {_display_(Seq[Any](format.raw/*48.48*/("""
    	"""),format.raw/*49.6*/("""<div class="alert alert-danger">
			<a href="#" class="close" data-dismiss="alert" aria-label="close">&times;</a>
			<strong>"""),_display_(/*51.13*/Messages(error.messages, error.arguments.toArray: _*)),format.raw/*51.66*/("""</strong>
		</div>
	""")))}),format.raw/*53.3*/("""


	"""),_display_(/*56.3*/for(error <- usuario_form("username").errors) yield /*56.48*/ {_display_(Seq[Any](format.raw/*56.50*/("""
    	"""),format.raw/*57.6*/("""<div class="alert alert-danger">
			<a href="#" class="close" data-dismiss="alert" aria-label="close">&times;</a>
			<strong>"""),_display_(/*59.13*/Messages(error.messages, error.arguments.toArray: _*)),format.raw/*59.66*/("""</strong>
		</div>
	""")))}),format.raw/*61.3*/("""

	"""),_display_(/*63.3*/for(error <- usuario_form("password").errors) yield /*63.48*/ {_display_(Seq[Any](format.raw/*63.50*/("""
    	"""),format.raw/*64.6*/("""<div class="alert alert-danger">
			<a href="#" class="close" data-dismiss="alert" aria-label="close">&times;</a>
			<strong>"""),_display_(/*66.13*/Messages(error.messages, error.arguments.toArray: _*)),format.raw/*66.66*/("""</strong>
		</div>
	""")))}),format.raw/*68.3*/("""

	"""),_display_(/*70.3*/for(error <- usuario_form("password_confirmation").errors) yield /*70.61*/ {_display_(Seq[Any](format.raw/*70.63*/("""
    	"""),format.raw/*71.6*/("""<div class="alert alert-danger">
			<a href="#" class="close" data-dismiss="alert" aria-label="close">&times;</a>
			<strong>"""),_display_(/*73.13*/Messages(error.messages, error.arguments.toArray: _*)),format.raw/*73.66*/("""</strong>
		</div>
	""")))}),format.raw/*75.3*/("""

""")))};
Seq[Any](format.raw/*1.62*/("""
"""),format.raw/*3.1*/("""
"""),format.raw/*6.2*/("""

"""),format.raw/*30.2*/("""



"""),format.raw/*77.2*/("""




"""),_display_(/*82.2*/gerente/*82.9*/.base("Manager SIIAF","Usuarios","Gestion de usuarios","usuarios",css,js)/*82.82*/{_display_(Seq[Any](format.raw/*82.83*/("""
	"""),format.raw/*83.2*/("""<button type="button" id="main-add-button" class="btn btn-primary" data-toggle="modal" data-target="#mod-new"><span class="glyphicon glyphicon-plus" aria-hidden="true"></span> Agregar Usuario</button>

	"""),_display_(/*85.3*/if(flash.containsKey("exito"))/*85.33*/{_display_(Seq[Any](format.raw/*85.34*/("""
		"""),format.raw/*86.3*/("""<div class="alert alert-success fade in">
			<a href="#" class="close" data-dismiss="alert" aria-label="close">&times;</a>
			<span class="glyphicon glyphicon-ok" aria-hidden="true"></span>
			<strong>"""),_display_(/*89.13*/flash/*89.18*/.get("exito")),format.raw/*89.31*/("""</strong>
		</div>
	""")))}),format.raw/*91.3*/("""


  	"""),format.raw/*94.4*/("""<!-- Modal -->
	<div class="modal fade" id="mod-new" role="dialog">

		<div class="modal-dialog">

		<!-- Modal content-->
		<div class="modal-content">
			"""),_display_(/*101.5*/form(action=routes.GerenteController.usuario_new())/*101.56*/{_display_(Seq[Any](format.raw/*101.57*/("""
				"""),format.raw/*102.5*/("""<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal">&times;</button>
					<h4 class="modal-title">Agregar nuevo usuario</h4>
				</div>
				"""),_display_(/*106.6*/errores_formulario),format.raw/*106.24*/("""
				"""),format.raw/*107.5*/("""<div class="modal-body">




	        		 <div class="form-group">
	        		 	"""),_display_(/*113.15*/inputText(usuario_form("nombre"), '_showConstraints -> false , '_showErrors -> false,'class -> "form-control", 'placeholder -> "Nombre del usuario", '_label -> "Nombre: ")),format.raw/*113.186*/("""
	        		 """),format.raw/*114.13*/("""</div>


	        		 <div class="form-group">
						"""),_display_(/*118.8*/select(usuario_form("tipo.id"), options(TipoUsuario.options), '_showConstraints -> false , '_showErrors -> false,'class -> "form-control", 'placeholder -> "Tipo de Usuario",'_label -> "Tipo de Usuario: ")),format.raw/*118.212*/("""
					 """),format.raw/*119.7*/("""</div>

					 <div class="form-group">
						"""),_display_(/*122.8*/inputText(usuario_form("username"), '_showConstraints -> false, '_showErrors -> false ,'class -> "form-control", 'placeholder -> "sn036156",'_label -> "Usuario: ")),format.raw/*122.171*/("""
					 """),format.raw/*123.7*/("""</div>

					 <div class="form-group">
						"""),_display_(/*126.8*/inputText(usuario_form("password"),'type -> "password", '_showConstraints -> false , '_showErrors -> false,'class -> "form-control", 'placeholder -> "Use contraseñas seguras",'_label -> "Contraseña: ")),format.raw/*126.209*/("""
					 """),format.raw/*127.7*/("""</div>

					 <div class="form-group">
						"""),_display_(/*130.8*/inputText(usuario_form("password_confirmation"),'type -> "password", '_showConstraints -> false , '_showErrors -> false,'class -> "form-control", 'placeholder -> "Use contraseñas seguras",'_label -> "Confirme Contraseña: ")),format.raw/*130.231*/("""
					 """),format.raw/*131.7*/("""</div>




				</div>
				<div class="modal-footer">
						<button type="button" class="btn btn-default" data-dismiss="modal">Cerrar</button>
						<button type="submit" class="btn btn-primary"><span class="glyphicon glyphicon-plus" aria-hidden="true"></span> Agregar</button>
				</div>
			""")))}),format.raw/*141.5*/("""
		"""),format.raw/*142.3*/("""</div>

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
				<th class="col-md-4 col-xs-4">Tipo</th>
				<th class="col-md-3 col-xs-3">Usuario</th>
				<th class="col-md-3 col-xs-3 center-column">Editar</th>
				<th class="col-md-3 col-xs-3 center-column">Eliminar</th>
			</tr>
			<tr class="warning no-result">
				<td colspan="4"><i class="fa fa-warning"></i> No hay resultados</td>
			</tr>
		</thead>
		<tbody>
			"""),_display_(/*173.5*/for(usuario <- usuarios_list) yield /*173.34*/{_display_(Seq[Any](format.raw/*173.35*/("""
				"""),format.raw/*174.5*/("""<tr>
					<td>"""),_display_(/*175.11*/usuario/*175.18*/.id),format.raw/*175.21*/("""</td>
					<td>"""),_display_(/*176.11*/usuario/*176.18*/.nombre),format.raw/*176.25*/("""</td>
					<td>"""),_display_(/*177.11*/usuario/*177.18*/.tipo.nombre),format.raw/*177.30*/("""</td>
					<td>"""),_display_(/*178.11*/usuario/*178.18*/.username),format.raw/*178.27*/("""</td>
					<td><button class="btn btn-success btn-xs" data-toggle="modal" data-target="#mod-edit-"""),_display_(/*179.93*/usuario/*179.100*/.id),format.raw/*179.103*/(""""><span class="glyphicon glyphicon-edit"></span> Editar</button></td>
					<td><button class="btn btn-danger btn-xs" data-toggle="modal" data-target="#mod-remove-"""),_display_(/*180.94*/usuario/*180.101*/.id),format.raw/*180.104*/(""""><span class="glyphicon glyphicon-trash"></span> Eliminar</button></td>
				</tr>



				<!-- Modal -->
				<div class="modal fade" id="mod-edit-"""),_display_(/*186.43*/usuario/*186.50*/.id),format.raw/*186.53*/("""" role="dialog">
					
					<div class="modal-dialog">

					<!-- Modal content-->
					<div class="modal-content">
						"""),_display_(/*192.8*/form(action=routes.GerenteController.usuario_edit(usuario.id))/*192.70*/{_display_(Seq[Any](format.raw/*192.71*/("""
							"""),format.raw/*193.8*/("""<div class="modal-header">
								<button type="button" class="close" data-dismiss="modal">&times;</button>
								<h4 class="modal-title">Editar usuario: """),_display_(/*195.50*/usuario/*195.57*/.nombre),format.raw/*195.64*/("""</h4>
								</div>
								"""),_display_(/*197.10*/errores_formulario),format.raw/*197.28*/("""
								"""),format.raw/*198.9*/("""<div class="modal-body">


									 <div class="form-group">
					        		 	"""),_display_(/*202.19*/inputText(usuario.getForm()("id"), '_showConstraints -> false, 'readonly -> "readonly" , '_showErrors -> false,'class -> "form-control", 'placeholder -> "Id", '_label -> "Id: ")),format.raw/*202.196*/("""
					        		 """),format.raw/*203.17*/("""</div>

					        		 <div class="form-group">
					        		 	"""),_display_(/*206.19*/inputText(usuario.getForm()("nombre"), '_showConstraints -> false , '_showErrors -> false,'class -> "form-control", 'placeholder -> "Nombre del usuario", '_label -> "Nombre: ")),format.raw/*206.195*/("""
					        		 """),format.raw/*207.17*/("""</div>

					        		 <div class="form-group">
										"""),_display_(/*210.12*/select(usuario.getForm()("tipo.id"), options(TipoUsuario.options), '_showConstraints -> false , '_showErrors -> false,'class -> "form-control", 'placeholder -> "Tipo de Usuario",'_label -> "Tipo de Usuario: ")),format.raw/*210.221*/("""
									 """),format.raw/*211.11*/("""</div>

									 <div class="form-group">
										"""),_display_(/*214.12*/inputText(usuario.getForm()("username"), '_showConstraints -> false, '_showErrors -> false ,'class -> "form-control", 'placeholder -> "sn036156",'_label -> "Usuario: ")),format.raw/*214.180*/("""
									 """),format.raw/*215.11*/("""</div>

									 <div class="form-group">
										"""),_display_(/*218.12*/inputText(usuario.getForm()("password"),'type -> "password", '_showConstraints -> false , '_showErrors -> false,'class -> "form-control", 'placeholder -> "Use contraseñas seguras",'_label -> "Contraseña: ")),format.raw/*218.218*/("""
									 """),format.raw/*219.11*/("""</div>

									 <div class="form-group">
										"""),_display_(/*222.12*/inputText(usuario.getForm()("password_confirmation"),'type -> "password", '_showConstraints -> false , '_showErrors -> false,'class -> "form-control", 'placeholder -> "Use contraseñas seguras",'_label -> "Confirme Contraseña: ")),format.raw/*222.240*/("""
									 """),format.raw/*223.11*/("""</div>




								</div>
								<div class="modal-footer">
									<button type="button" class="btn btn-default" data-dismiss="modal">Cerrar</button>
									<button type="submit" class="btn btn-primary"><span class="glyphicon glyphicon-floppy-disk" aria-hidden="true"></span> Guardar</button>
								</div>
							</div>
						""")))}),format.raw/*234.8*/("""
					"""),format.raw/*235.6*/("""</div>
				</div>





				<!-- Modal -->
				<div class="modal fade" id="mod-remove-"""),_display_(/*243.45*/usuario/*243.52*/.id),format.raw/*243.55*/("""" role="dialog">
					<div class="modal-dialog">

					<!-- Modal content-->
					<div class="modal-content">
						<div class="modal-header">
							<button type="button" class="close" data-dismiss="modal">&times;</button>
							<h4 class="modal-title">Eliminar usuario: """),_display_(/*250.51*/usuario/*250.58*/.nombre),format.raw/*250.65*/("""</h4>
							</div>
							<div class="modal-body">

								¿Esta seguro que desea eliminar el usuario?.
								El usuario ya no tendra acceso al sistema.


							</div>
							<div class="modal-footer">
								<form>
								<button type="button" class="btn btn-default" data-dismiss="modal">Cerrar</button>							
								<button type="submit" class="btn btn-danger" formmethod="POST" formaction=""""),_display_(/*262.85*/routes/*262.91*/.GerenteController.usuario_remove(usuario.id)),format.raw/*262.136*/(""""><span class="glyphicon glyphicon-trash" aria-hidden="true"></span> Eliminar</button>
								</form>
							</div>
						</div>

					</div>
				</div>


			""")))}),format.raw/*271.5*/("""
		"""),format.raw/*272.3*/("""</tbody>
	</table>
	</div>

""")))}))
      }
    }
  }

  def render(usuario_form:Form[Usuario],usuarios_list:List[Usuario]): play.twirl.api.HtmlFormat.Appendable = apply(usuario_form,usuarios_list)

  def f:((Form[Usuario],List[Usuario]) => play.twirl.api.HtmlFormat.Appendable) = (usuario_form,usuarios_list) => apply(usuario_form,usuarios_list)

  def ref: this.type = this

}


}

/**/
object usuarios extends usuarios_Scope0.usuarios
              /*
                  -- GENERATED --
                  DATE: Sun Nov 06 08:15:22 CST 2016
                  SOURCE: /home/sarahi/siiaf-play/app/views/gerente/usuarios.scala.html
                  HASH: f57a8693350e5ff8f4f8e54dea285d192d8ddfb5
                  MATRIX: 780->1|933->81|943->84|1022->86|1050->88|1121->133|1135->139|1208->191|1234->198|1243->200|1322->202|1350->204|1390->218|1404->224|1475->275|1570->344|1609->374|1649->376|1679->379|1747->419|1776->420|1815->431|1847->436|1861->441|1895->454|1946->478|1974->479|2024->499|2055->503|2174->594|2203->595|2234->599|2292->630|2307->636|2355->663|2385->665|2414->666|2451->676|2496->694|2511->700|2559->727|2592->733|2620->734|2651->738|2679->739|2717->759|2744->777|2825->779|2855->783|2896->815|2936->817|2974->828|3029->867|3069->869|3107->879|3262->1007|3336->1060|3396->1089|3429->1092|3461->1098|3520->1141|3560->1143|3593->1149|3746->1275|3820->1328|3871->1349|3902->1354|3963->1399|4003->1401|4036->1407|4189->1533|4263->1586|4314->1607|4344->1611|4405->1656|4445->1658|4478->1664|4631->1790|4705->1843|4756->1864|4786->1868|4860->1926|4900->1928|4933->1934|5086->2060|5160->2113|5211->2134|5253->61|5280->79|5307->195|5336->754|5367->2137|5399->2143|5414->2150|5496->2223|5535->2224|5564->2226|5794->2430|5833->2460|5872->2461|5902->2464|6131->2666|6145->2671|6179->2684|6230->2705|6263->2711|6447->2868|6508->2919|6548->2920|6581->2925|6786->3103|6826->3121|6859->3126|6967->3206|7161->3377|7203->3390|7283->3443|7510->3647|7545->3654|7618->3700|7804->3863|7839->3870|7912->3916|8136->4117|8171->4124|8244->4170|8490->4393|8525->4400|8848->4692|8879->4695|9649->5438|9695->5467|9735->5468|9768->5473|9811->5488|9828->5495|9853->5498|9897->5514|9914->5521|9943->5528|9987->5544|10004->5551|10038->5563|10082->5579|10099->5586|10130->5595|10256->5693|10274->5700|10300->5703|10491->5866|10509->5873|10535->5876|10710->6023|10727->6030|10752->6033|10902->6156|10974->6218|11014->6219|11050->6227|11236->6385|11253->6392|11282->6399|11340->6429|11380->6447|11417->6456|11525->6536|11725->6713|11771->6730|11866->6797|12065->6973|12111->6990|12199->7050|12431->7259|12471->7270|12553->7324|12744->7492|12784->7503|12866->7557|13095->7763|13135->7774|13217->7828|13468->8056|13508->8067|13873->8401|13907->8407|14021->8493|14038->8500|14063->8503|14365->8777|14382->8784|14411->8791|14843->9195|14859->9201|14927->9246|15118->9406|15149->9409
                  LINES: 27->1|31->4|31->4|33->4|34->5|34->5|34->5|34->5|35->8|35->8|37->8|38->9|38->9|38->9|38->9|41->12|41->12|41->12|42->13|43->14|43->14|44->15|44->15|44->15|44->15|45->16|45->16|47->18|50->21|52->23|52->23|53->24|53->24|53->24|53->24|53->24|53->24|55->26|55->26|55->26|55->26|56->27|56->27|57->28|57->28|59->34|59->34|61->34|63->36|63->36|63->36|65->38|65->38|65->38|66->39|68->41|68->41|70->43|71->44|75->48|75->48|75->48|76->49|78->51|78->51|80->53|83->56|83->56|83->56|84->57|86->59|86->59|88->61|90->63|90->63|90->63|91->64|93->66|93->66|95->68|97->70|97->70|97->70|98->71|100->73|100->73|102->75|105->1|106->3|107->6|109->30|113->77|118->82|118->82|118->82|118->82|119->83|121->85|121->85|121->85|122->86|125->89|125->89|125->89|127->91|130->94|137->101|137->101|137->101|138->102|142->106|142->106|143->107|149->113|149->113|150->114|154->118|154->118|155->119|158->122|158->122|159->123|162->126|162->126|163->127|166->130|166->130|167->131|177->141|178->142|209->173|209->173|209->173|210->174|211->175|211->175|211->175|212->176|212->176|212->176|213->177|213->177|213->177|214->178|214->178|214->178|215->179|215->179|215->179|216->180|216->180|216->180|222->186|222->186|222->186|228->192|228->192|228->192|229->193|231->195|231->195|231->195|233->197|233->197|234->198|238->202|238->202|239->203|242->206|242->206|243->207|246->210|246->210|247->211|250->214|250->214|251->215|254->218|254->218|255->219|258->222|258->222|259->223|270->234|271->235|279->243|279->243|279->243|286->250|286->250|286->250|298->262|298->262|298->262|307->271|308->272
                  -- GENERATED --
              */
          