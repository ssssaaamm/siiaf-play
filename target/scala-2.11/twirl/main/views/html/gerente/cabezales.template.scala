
package views.html.gerente

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object cabezales_Scope0 {
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

class cabezales extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[Form[Cabezal],List[Cabezal],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(cabezal_form: Form[Cabezal], cabezales_list: List[Cabezal] ):play.twirl.api.HtmlFormat.Appendable = {
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
			"""),format.raw/*24.4*/("""if(window.location.pathname!='"""),_display_(/*24.35*/routes/*24.41*/.GerenteController.cabezales),format.raw/*24.69*/("""')"""),format.raw/*24.71*/("""{"""),format.raw/*24.72*/("""
				
				"""),format.raw/*26.5*/("""window.location='"""),_display_(/*26.23*/routes/*26.29*/.GerenteController.cabezales),format.raw/*26.57*/("""';
			"""),format.raw/*27.4*/("""}"""),format.raw/*27.5*/("""	
		"""),format.raw/*28.3*/("""}"""),format.raw/*28.4*/(""");
	</script>
""")))};def /*34.2*/errores_formulario/*34.20*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*34.22*/("""

	"""),_display_(/*36.3*/if(cabezal_form.hasGlobalErrors)/*36.35*/ {_display_(Seq[Any](format.raw/*36.37*/("""

        """),_display_(/*38.10*/for(error <- cabezal_form.globalErrors) yield /*38.49*/ {_display_(Seq[Any](format.raw/*38.51*/("""
	        """),format.raw/*39.10*/("""<div class="alert alert-danger">
				<a href="#" class="close" data-dismiss="alert" aria-label="close">&times;</a>
				<strong>"""),_display_(/*41.14*/Messages(error.messages, error.arguments.toArray: _*)),format.raw/*41.67*/("""</strong>
			</div>
        """)))}),format.raw/*43.10*/("""
	""")))}),format.raw/*44.3*/("""



	"""),_display_(/*48.3*/for(error <- cabezal_form("nombre").errors) yield /*48.46*/ {_display_(Seq[Any](format.raw/*48.48*/("""
    	"""),format.raw/*49.6*/("""<div class="alert alert-danger">
			<a href="#" class="close" data-dismiss="alert" aria-label="close">&times;</a>
			<strong>"""),_display_(/*51.13*/Messages(error.messages, error.arguments.toArray: _*)),format.raw/*51.66*/("""</strong>
		</div>
	""")))}),format.raw/*53.3*/("""


	"""),_display_(/*56.3*/for(error <- cabezal_form("username").errors) yield /*56.48*/ {_display_(Seq[Any](format.raw/*56.50*/("""
    	"""),format.raw/*57.6*/("""<div class="alert alert-danger">
			<a href="#" class="close" data-dismiss="alert" aria-label="close">&times;</a>
			<strong>"""),_display_(/*59.13*/Messages(error.messages, error.arguments.toArray: _*)),format.raw/*59.66*/("""</strong>
		</div>
	""")))}),format.raw/*61.3*/("""

	"""),_display_(/*63.3*/for(error <- cabezal_form("password").errors) yield /*63.48*/ {_display_(Seq[Any](format.raw/*63.50*/("""
    	"""),format.raw/*64.6*/("""<div class="alert alert-danger">
			<a href="#" class="close" data-dismiss="alert" aria-label="close">&times;</a>
			<strong>"""),_display_(/*66.13*/Messages(error.messages, error.arguments.toArray: _*)),format.raw/*66.66*/("""</strong>
		</div>
	""")))}),format.raw/*68.3*/("""

	"""),_display_(/*70.3*/for(error <- cabezal_form("password_confirmation").errors) yield /*70.61*/ {_display_(Seq[Any](format.raw/*70.63*/("""
    	"""),format.raw/*71.6*/("""<div class="alert alert-danger">
			<a href="#" class="close" data-dismiss="alert" aria-label="close">&times;</a>
			<strong>"""),_display_(/*73.13*/Messages(error.messages, error.arguments.toArray: _*)),format.raw/*73.66*/("""</strong>
		</div>
	""")))}),format.raw/*75.3*/("""

""")))};
Seq[Any](format.raw/*1.63*/("""
"""),format.raw/*3.1*/("""
"""),format.raw/*6.2*/("""

"""),format.raw/*30.2*/("""



"""),format.raw/*77.2*/("""




"""),_display_(/*82.2*/gerente/*82.9*/.base("Manager SIIAF","Cabezales","Gestion de cabezales","cabezales",css,js)/*82.85*/{_display_(Seq[Any](format.raw/*82.86*/("""
	"""),format.raw/*83.2*/("""<button type="button" id="main-add-button" class="btn btn-primary" data-toggle="modal" data-target="#mod-new"><span class="glyphicon glyphicon-plus" aria-hidden="true"></span> Agregar Cabezal</button>

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
			"""),_display_(/*101.5*/form(action=routes.GerenteController.cabezal_new())/*101.56*/{_display_(Seq[Any](format.raw/*101.57*/("""
				"""),format.raw/*102.5*/("""<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal">&times;</button>
					<h4 class="modal-title">Agregar nuevo cabezal</h4>
				</div>
				"""),_display_(/*106.6*/errores_formulario),format.raw/*106.24*/("""
				"""),format.raw/*107.5*/("""<div class="modal-body">




	        		 <div class="form-group">
	        		 	"""),_display_(/*113.15*/inputText(cabezal_form("placa"), '_showConstraints -> false , '_showErrors -> false,'class -> "form-control", 'placeholder -> "C212-093", '_label -> "Placa: ")),format.raw/*113.174*/("""
	        		 """),format.raw/*114.13*/("""</div>

	        		  <div class="form-group">
	        		 	"""),_display_(/*117.15*/textarea(cabezal_form("descripcion"),'rows -> 5, '_showConstraints -> false , '_showErrors -> false,'class -> "form-control", '_label -> "Descripción: ")),format.raw/*117.168*/("""
	        		 """),format.raw/*118.13*/("""</div>

	        		 </div>
				<div class="modal-footer">
						<button type="button" class="btn btn-default" data-dismiss="modal">Cerrar</button>
						<button type="submit" class="btn btn-primary"><span class="glyphicon glyphicon-plus" aria-hidden="true"></span> Agregar</button>
				</div>
			""")))}),format.raw/*125.5*/("""
		"""),format.raw/*126.3*/("""</div>

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
				<th class="col-md-2 col-xs-5">Id</th>
				<th class="col-md-4 col-xs-4">Placa</th>
				<th class="col-md-6 col-xs-3">Descripcion</th>
				<th class="col-md-3 col-xs-3 center-column">Editar</th>
				<th class="col-md-3 col-xs-3 center-column">Eliminar</th>
			</tr>
			<tr class="warning no-result">
				<td colspan="4"><i class="fa fa-warning"></i> No hay resultados</td>
			</tr>
		</thead>
		<tbody>
			"""),_display_(/*156.5*/for(cabezal <- cabezales_list) yield /*156.35*/{_display_(Seq[Any](format.raw/*156.36*/("""
				"""),format.raw/*157.5*/("""<tr>
					<td>"""),_display_(/*158.11*/cabezal/*158.18*/.id),format.raw/*158.21*/("""</td>
					<td>"""),_display_(/*159.11*/cabezal/*159.18*/.placa),format.raw/*159.24*/("""</td>
					<td>"""),_display_(/*160.11*/cabezal/*160.18*/.descripcion),format.raw/*160.30*/("""</td>
					<td><button class="btn btn-success btn-xs" data-toggle="modal" data-target="#mod-edit-"""),_display_(/*161.93*/cabezal/*161.100*/.id),format.raw/*161.103*/(""""><span class="glyphicon glyphicon-edit"></span> Editar</button></td>
					<td><button class="btn btn-danger btn-xs" data-toggle="modal" data-target="#mod-remove-"""),_display_(/*162.94*/cabezal/*162.101*/.id),format.raw/*162.104*/(""""><span class="glyphicon glyphicon-trash"></span> Eliminar</button></td>
				</tr>



				<!-- Modal -->
				<div class="modal fade" id="mod-edit-"""),_display_(/*168.43*/cabezal/*168.50*/.id),format.raw/*168.53*/("""" role="dialog">
					
					<div class="modal-dialog">

					<!-- Modal content-->
					<div class="modal-content">
						"""),_display_(/*174.8*/form(action=routes.GerenteController.cabezal_edit(cabezal.id))/*174.70*/{_display_(Seq[Any](format.raw/*174.71*/("""
							"""),format.raw/*175.8*/("""<div class="modal-header">
								<button type="button" class="close" data-dismiss="modal">&times;</button>
								<h4 class="modal-title">Editar cabezal: """),_display_(/*177.50*/cabezal/*177.57*/.placa),format.raw/*177.63*/("""</h4>
								</div>
								"""),_display_(/*179.10*/errores_formulario),format.raw/*179.28*/("""
								"""),format.raw/*180.9*/("""<div class="modal-body">


									 <div class="form-group">
					        		 	"""),_display_(/*184.19*/inputText(cabezal.getForm()("id"), '_showConstraints -> false, 'readonly -> "readonly" , '_showErrors -> false,'class -> "form-control", 'placeholder -> "Id", '_label -> "Id: ")),format.raw/*184.196*/("""
					        		 """),format.raw/*185.17*/("""</div>

					        		 <div class="form-group">
					        		 	"""),_display_(/*188.19*/inputText(cabezal.getForm()("placa"), '_showConstraints -> false , '_showErrors -> false,'class -> "form-control", 'placeholder -> "C212-093", '_label -> "Placa: ")),format.raw/*188.183*/("""
					        		 """),format.raw/*189.17*/("""</div>

					        		 <div class="form-group">
					        		 	"""),_display_(/*192.19*/textarea(cabezal_form("descripcion"),'rows -> 5, '_showConstraints -> false , '_showErrors -> false,'class -> "form-control", '_label -> "Descripción: ")),format.raw/*192.172*/("""
					        		 """),format.raw/*193.17*/("""</div>
					        		 

								</div>
								<div class="modal-footer">
									<button type="button" class="btn btn-default" data-dismiss="modal">Cerrar</button>
									<button type="submit" class="btn btn-primary"><span class="glyphicon glyphicon-floppy-disk" aria-hidden="true"></span> Guardar</button>
								</div>
							</div>
						""")))}),format.raw/*202.8*/("""
					"""),format.raw/*203.6*/("""</div>
				</div>





				<!-- Modal -->
				<div class="modal fade" id="mod-remove-"""),_display_(/*211.45*/cabezal/*211.52*/.id),format.raw/*211.55*/("""" role="dialog">
					<div class="modal-dialog">

					<!-- Modal content-->
					<div class="modal-content">
						<div class="modal-header">
							<button type="button" class="close" data-dismiss="modal">&times;</button>
							<h4 class="modal-title">Eliminar cabezal: """),_display_(/*218.51*/cabezal/*218.58*/.placa),format.raw/*218.64*/("""</h4>
							</div>
							<div class="modal-body">

								¿Esta seguro que desea eliminar el cabezal?.
								El cabezal ya no tendra acceso al sistema.


							</div>
							<div class="modal-footer">
								<form>
								<button type="button" class="btn btn-default" data-dismiss="modal">Cerrar</button>							
								<button type="submit" class="btn btn-danger" formmethod="POST" formaction=""""),_display_(/*230.85*/routes/*230.91*/.GerenteController.cabezal_remove(cabezal.id)),format.raw/*230.136*/(""""><span class="glyphicon glyphicon-trash" aria-hidden="true"></span> Eliminar</button>
								</form>
							</div>
						</div>

					</div>
				</div>


			""")))}),format.raw/*239.5*/("""
		"""),format.raw/*240.3*/("""</tbody>
	</table>
	</div>

""")))}))
      }
    }
  }

  def render(cabezal_form:Form[Cabezal],cabezales_list:List[Cabezal]): play.twirl.api.HtmlFormat.Appendable = apply(cabezal_form,cabezales_list)

  def f:((Form[Cabezal],List[Cabezal]) => play.twirl.api.HtmlFormat.Appendable) = (cabezal_form,cabezales_list) => apply(cabezal_form,cabezales_list)

  def ref: this.type = this

}


}

/**/
object cabezales extends cabezales_Scope0.cabezales
              /*
                  -- GENERATED --
                  DATE: Sun Nov 06 08:24:52 CST 2016
                  SOURCE: /home/sarahi/siiaf-play/app/views/gerente/cabezales.scala.html
                  HASH: 1b7d643aaaef927ebdec0c556ad43a12ef60523d
                  MATRIX: 782->1|936->82|946->85|1025->87|1053->89|1124->134|1138->140|1211->192|1237->199|1246->201|1325->203|1353->205|1393->219|1407->225|1478->276|1573->345|1612->375|1652->377|1682->380|1750->420|1779->421|1818->432|1850->437|1864->442|1898->455|1949->479|1977->480|2027->500|2058->504|2177->595|2206->596|2237->600|2295->631|2310->637|2359->665|2389->667|2418->668|2455->678|2500->696|2515->702|2564->730|2597->736|2625->737|2656->741|2684->742|2722->762|2749->780|2830->782|2860->786|2901->818|2941->820|2979->831|3034->870|3074->872|3112->882|3267->1010|3341->1063|3401->1092|3434->1095|3466->1101|3525->1144|3565->1146|3598->1152|3751->1278|3825->1331|3876->1352|3907->1357|3968->1402|4008->1404|4041->1410|4194->1536|4268->1589|4319->1610|4349->1614|4410->1659|4450->1661|4483->1667|4636->1793|4710->1846|4761->1867|4791->1871|4865->1929|4905->1931|4938->1937|5091->2063|5165->2116|5216->2137|5258->62|5285->80|5312->196|5341->757|5372->2140|5404->2146|5419->2153|5504->2229|5543->2230|5572->2232|5802->2436|5841->2466|5880->2467|5910->2470|6139->2672|6153->2677|6187->2690|6238->2711|6271->2717|6455->2874|6516->2925|6556->2926|6589->2931|6794->3109|6834->3127|6867->3132|6975->3212|7157->3371|7199->3384|7287->3444|7463->3597|7505->3610|7833->3907|7864->3910|8632->4651|8679->4681|8719->4682|8752->4687|8795->4702|8812->4709|8837->4712|8881->4728|8898->4735|8926->4741|8970->4757|8987->4764|9021->4776|9147->4874|9165->4881|9191->4884|9382->5047|9400->5054|9426->5057|9601->5204|9618->5211|9643->5214|9793->5337|9865->5399|9905->5400|9941->5408|10127->5566|10144->5573|10172->5579|10230->5609|10270->5627|10307->5636|10415->5716|10615->5893|10661->5910|10756->5977|10943->6141|10989->6158|11084->6225|11260->6378|11306->6395|11685->6743|11719->6749|11833->6835|11850->6842|11875->6845|12177->7119|12194->7126|12222->7132|12654->7536|12670->7542|12738->7587|12929->7747|12960->7750
                  LINES: 27->1|31->4|31->4|33->4|34->5|34->5|34->5|34->5|35->8|35->8|37->8|38->9|38->9|38->9|38->9|41->12|41->12|41->12|42->13|43->14|43->14|44->15|44->15|44->15|44->15|45->16|45->16|47->18|50->21|52->23|52->23|53->24|53->24|53->24|53->24|53->24|53->24|55->26|55->26|55->26|55->26|56->27|56->27|57->28|57->28|59->34|59->34|61->34|63->36|63->36|63->36|65->38|65->38|65->38|66->39|68->41|68->41|70->43|71->44|75->48|75->48|75->48|76->49|78->51|78->51|80->53|83->56|83->56|83->56|84->57|86->59|86->59|88->61|90->63|90->63|90->63|91->64|93->66|93->66|95->68|97->70|97->70|97->70|98->71|100->73|100->73|102->75|105->1|106->3|107->6|109->30|113->77|118->82|118->82|118->82|118->82|119->83|121->85|121->85|121->85|122->86|125->89|125->89|125->89|127->91|130->94|137->101|137->101|137->101|138->102|142->106|142->106|143->107|149->113|149->113|150->114|153->117|153->117|154->118|161->125|162->126|192->156|192->156|192->156|193->157|194->158|194->158|194->158|195->159|195->159|195->159|196->160|196->160|196->160|197->161|197->161|197->161|198->162|198->162|198->162|204->168|204->168|204->168|210->174|210->174|210->174|211->175|213->177|213->177|213->177|215->179|215->179|216->180|220->184|220->184|221->185|224->188|224->188|225->189|228->192|228->192|229->193|238->202|239->203|247->211|247->211|247->211|254->218|254->218|254->218|266->230|266->230|266->230|275->239|276->240
                  -- GENERATED --
              */
          