
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/sarahi/siiaf-play/conf/routes
// @DATE:Sun Nov 06 08:15:21 CST 2016

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:8
  Assets_4: controllers.Assets,
  // @LINE:12
  HomeController_1: controllers.HomeController,
  // @LINE:21
  AdministradorController_3: controllers.AdministradorController,
  // @LINE:25
  GerenteController_0: controllers.GerenteController,
  // @LINE:52
  LogisticaController_2: controllers.LogisticaController,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:8
    Assets_4: controllers.Assets,
    // @LINE:12
    HomeController_1: controllers.HomeController,
    // @LINE:21
    AdministradorController_3: controllers.AdministradorController,
    // @LINE:25
    GerenteController_0: controllers.GerenteController,
    // @LINE:52
    LogisticaController_2: controllers.LogisticaController
  ) = this(errorHandler, Assets_4, HomeController_1, AdministradorController_3, GerenteController_0, LogisticaController_2, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, Assets_4, HomeController_1, AdministradorController_3, GerenteController_0, LogisticaController_2, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    ("""GET""", this.prefix, """controllers.HomeController.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """controllers.HomeController.login"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """controllers.HomeController.login_post"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """logout""", """controllers.HomeController.logout"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """about""", """controllers.HomeController.about"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin/usuarios""", """controllers.AdministradorController.usuarios"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """manager/clientes""", """controllers.GerenteController.clientes"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """manager/clientes/new""", """controllers.GerenteController.cliente_new"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """manager/clientes/edit/""" + "$" + """id<[^/]+>""", """controllers.GerenteController.cliente_edit(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """manager/clientes/remove/""" + "$" + """id<[^/]+>""", """controllers.GerenteController.cliente_remove(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """manager/motoristas""", """controllers.GerenteController.motoristas"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """manager/motoristas/new""", """controllers.GerenteController.motorista_new"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """manager/motoristas/edit/""" + "$" + """id<[^/]+>""", """controllers.GerenteController.motorista_edit(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """manager/motoristas/remove/""" + "$" + """id<[^/]+>""", """controllers.GerenteController.motorista_remove(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """manager/cabezales""", """controllers.GerenteController.cabezales"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """manager/cabezales/new""", """controllers.GerenteController.cabezal_new"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """manager/cabezales/edit/""" + "$" + """id<[^/]+>""", """controllers.GerenteController.cabezal_edit(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """manager/cabezales/remove/""" + "$" + """id<[^/]+>""", """controllers.GerenteController.cabezal_remove(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """manager/planilla""", """controllers.GerenteController.planilla"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """manager/facturacion""", """controllers.GerenteController.facturacion"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """manager/politica/cobro""", """controllers.GerenteController.politica_cobro"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """manager/politica/pago""", """controllers.GerenteController.politica_pago"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """manager/usuarios""", """controllers.GerenteController.usuarios"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """manager/usuarios/new""", """controllers.GerenteController.usuario_new"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """manager/usuarios/edit/""" + "$" + """id<[^/]+>""", """controllers.GerenteController.usuario_edit(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """manager/usuarios/remove/""" + "$" + """id<[^/]+>""", """controllers.GerenteController.usuario_remove(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """logistic/viajes""", """controllers.LogisticaController.viajes"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """logistic/planilla""", """controllers.LogisticaController.planilla"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """logistic/facturacion""", """controllers.LogisticaController.facturacion"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """logistic/politica/cobro""", """controllers.LogisticaController.politica_cobro"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """logistic/politica/pago""", """controllers.LogisticaController.politica_pago"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:8
  private[this] lazy val controllers_Assets_versioned0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned0_invoker = createInvoker(
    Assets_4.versioned(fakeValue[String], fakeValue[Asset]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      """ Map static resources from the /public folder to the /assets URL path""",
      this.prefix + """assets/""" + "$" + """file<.+>"""
    )
  )

  // @LINE:12
  private[this] lazy val controllers_HomeController_index1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index1_invoker = createInvoker(
    HomeController_1.index,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Nil,
      "GET",
      """ RUTAS DEL HomeController""",
      this.prefix + """"""
    )
  )

  // @LINE:13
  private[this] lazy val controllers_HomeController_login2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_HomeController_login2_invoker = createInvoker(
    HomeController_1.login,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "login",
      Nil,
      "GET",
      """""",
      this.prefix + """login"""
    )
  )

  // @LINE:14
  private[this] lazy val controllers_HomeController_login_post3_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_HomeController_login_post3_invoker = createInvoker(
    HomeController_1.login_post,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "login_post",
      Nil,
      "POST",
      """""",
      this.prefix + """login"""
    )
  )

  // @LINE:15
  private[this] lazy val controllers_HomeController_logout4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("logout")))
  )
  private[this] lazy val controllers_HomeController_logout4_invoker = createInvoker(
    HomeController_1.logout,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "logout",
      Nil,
      "GET",
      """""",
      this.prefix + """logout"""
    )
  )

  // @LINE:16
  private[this] lazy val controllers_HomeController_about5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("about")))
  )
  private[this] lazy val controllers_HomeController_about5_invoker = createInvoker(
    HomeController_1.about,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "about",
      Nil,
      "GET",
      """""",
      this.prefix + """about"""
    )
  )

  // @LINE:21
  private[this] lazy val controllers_AdministradorController_usuarios6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/usuarios")))
  )
  private[this] lazy val controllers_AdministradorController_usuarios6_invoker = createInvoker(
    AdministradorController_3.usuarios,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AdministradorController",
      "usuarios",
      Nil,
      "GET",
      """ RUTAS DEL AdministradorController""",
      this.prefix + """admin/usuarios"""
    )
  )

  // @LINE:25
  private[this] lazy val controllers_GerenteController_clientes7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("manager/clientes")))
  )
  private[this] lazy val controllers_GerenteController_clientes7_invoker = createInvoker(
    GerenteController_0.clientes,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.GerenteController",
      "clientes",
      Nil,
      "GET",
      """ RUTAS DEL GerenteController""",
      this.prefix + """manager/clientes"""
    )
  )

  // @LINE:26
  private[this] lazy val controllers_GerenteController_cliente_new8_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("manager/clientes/new")))
  )
  private[this] lazy val controllers_GerenteController_cliente_new8_invoker = createInvoker(
    GerenteController_0.cliente_new,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.GerenteController",
      "cliente_new",
      Nil,
      "POST",
      """""",
      this.prefix + """manager/clientes/new"""
    )
  )

  // @LINE:27
  private[this] lazy val controllers_GerenteController_cliente_edit9_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("manager/clientes/edit/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_GerenteController_cliente_edit9_invoker = createInvoker(
    GerenteController_0.cliente_edit(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.GerenteController",
      "cliente_edit",
      Seq(classOf[Long]),
      "POST",
      """""",
      this.prefix + """manager/clientes/edit/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:28
  private[this] lazy val controllers_GerenteController_cliente_remove10_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("manager/clientes/remove/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_GerenteController_cliente_remove10_invoker = createInvoker(
    GerenteController_0.cliente_remove(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.GerenteController",
      "cliente_remove",
      Seq(classOf[Long]),
      "POST",
      """""",
      this.prefix + """manager/clientes/remove/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:30
  private[this] lazy val controllers_GerenteController_motoristas11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("manager/motoristas")))
  )
  private[this] lazy val controllers_GerenteController_motoristas11_invoker = createInvoker(
    GerenteController_0.motoristas,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.GerenteController",
      "motoristas",
      Nil,
      "GET",
      """""",
      this.prefix + """manager/motoristas"""
    )
  )

  // @LINE:31
  private[this] lazy val controllers_GerenteController_motorista_new12_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("manager/motoristas/new")))
  )
  private[this] lazy val controllers_GerenteController_motorista_new12_invoker = createInvoker(
    GerenteController_0.motorista_new,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.GerenteController",
      "motorista_new",
      Nil,
      "POST",
      """""",
      this.prefix + """manager/motoristas/new"""
    )
  )

  // @LINE:32
  private[this] lazy val controllers_GerenteController_motorista_edit13_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("manager/motoristas/edit/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_GerenteController_motorista_edit13_invoker = createInvoker(
    GerenteController_0.motorista_edit(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.GerenteController",
      "motorista_edit",
      Seq(classOf[Long]),
      "POST",
      """""",
      this.prefix + """manager/motoristas/edit/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:33
  private[this] lazy val controllers_GerenteController_motorista_remove14_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("manager/motoristas/remove/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_GerenteController_motorista_remove14_invoker = createInvoker(
    GerenteController_0.motorista_remove(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.GerenteController",
      "motorista_remove",
      Seq(classOf[Long]),
      "POST",
      """""",
      this.prefix + """manager/motoristas/remove/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:35
  private[this] lazy val controllers_GerenteController_cabezales15_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("manager/cabezales")))
  )
  private[this] lazy val controllers_GerenteController_cabezales15_invoker = createInvoker(
    GerenteController_0.cabezales,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.GerenteController",
      "cabezales",
      Nil,
      "GET",
      """""",
      this.prefix + """manager/cabezales"""
    )
  )

  // @LINE:36
  private[this] lazy val controllers_GerenteController_cabezal_new16_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("manager/cabezales/new")))
  )
  private[this] lazy val controllers_GerenteController_cabezal_new16_invoker = createInvoker(
    GerenteController_0.cabezal_new,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.GerenteController",
      "cabezal_new",
      Nil,
      "POST",
      """""",
      this.prefix + """manager/cabezales/new"""
    )
  )

  // @LINE:37
  private[this] lazy val controllers_GerenteController_cabezal_edit17_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("manager/cabezales/edit/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_GerenteController_cabezal_edit17_invoker = createInvoker(
    GerenteController_0.cabezal_edit(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.GerenteController",
      "cabezal_edit",
      Seq(classOf[Long]),
      "POST",
      """""",
      this.prefix + """manager/cabezales/edit/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:38
  private[this] lazy val controllers_GerenteController_cabezal_remove18_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("manager/cabezales/remove/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_GerenteController_cabezal_remove18_invoker = createInvoker(
    GerenteController_0.cabezal_remove(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.GerenteController",
      "cabezal_remove",
      Seq(classOf[Long]),
      "POST",
      """""",
      this.prefix + """manager/cabezales/remove/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:40
  private[this] lazy val controllers_GerenteController_planilla19_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("manager/planilla")))
  )
  private[this] lazy val controllers_GerenteController_planilla19_invoker = createInvoker(
    GerenteController_0.planilla,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.GerenteController",
      "planilla",
      Nil,
      "GET",
      """""",
      this.prefix + """manager/planilla"""
    )
  )

  // @LINE:41
  private[this] lazy val controllers_GerenteController_facturacion20_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("manager/facturacion")))
  )
  private[this] lazy val controllers_GerenteController_facturacion20_invoker = createInvoker(
    GerenteController_0.facturacion,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.GerenteController",
      "facturacion",
      Nil,
      "GET",
      """""",
      this.prefix + """manager/facturacion"""
    )
  )

  // @LINE:42
  private[this] lazy val controllers_GerenteController_politica_cobro21_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("manager/politica/cobro")))
  )
  private[this] lazy val controllers_GerenteController_politica_cobro21_invoker = createInvoker(
    GerenteController_0.politica_cobro,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.GerenteController",
      "politica_cobro",
      Nil,
      "GET",
      """""",
      this.prefix + """manager/politica/cobro"""
    )
  )

  // @LINE:43
  private[this] lazy val controllers_GerenteController_politica_pago22_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("manager/politica/pago")))
  )
  private[this] lazy val controllers_GerenteController_politica_pago22_invoker = createInvoker(
    GerenteController_0.politica_pago,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.GerenteController",
      "politica_pago",
      Nil,
      "GET",
      """""",
      this.prefix + """manager/politica/pago"""
    )
  )

  // @LINE:45
  private[this] lazy val controllers_GerenteController_usuarios23_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("manager/usuarios")))
  )
  private[this] lazy val controllers_GerenteController_usuarios23_invoker = createInvoker(
    GerenteController_0.usuarios,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.GerenteController",
      "usuarios",
      Nil,
      "GET",
      """""",
      this.prefix + """manager/usuarios"""
    )
  )

  // @LINE:46
  private[this] lazy val controllers_GerenteController_usuario_new24_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("manager/usuarios/new")))
  )
  private[this] lazy val controllers_GerenteController_usuario_new24_invoker = createInvoker(
    GerenteController_0.usuario_new,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.GerenteController",
      "usuario_new",
      Nil,
      "POST",
      """""",
      this.prefix + """manager/usuarios/new"""
    )
  )

  // @LINE:47
  private[this] lazy val controllers_GerenteController_usuario_edit25_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("manager/usuarios/edit/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_GerenteController_usuario_edit25_invoker = createInvoker(
    GerenteController_0.usuario_edit(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.GerenteController",
      "usuario_edit",
      Seq(classOf[Long]),
      "POST",
      """""",
      this.prefix + """manager/usuarios/edit/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:48
  private[this] lazy val controllers_GerenteController_usuario_remove26_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("manager/usuarios/remove/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_GerenteController_usuario_remove26_invoker = createInvoker(
    GerenteController_0.usuario_remove(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.GerenteController",
      "usuario_remove",
      Seq(classOf[Long]),
      "POST",
      """""",
      this.prefix + """manager/usuarios/remove/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:52
  private[this] lazy val controllers_LogisticaController_viajes27_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("logistic/viajes")))
  )
  private[this] lazy val controllers_LogisticaController_viajes27_invoker = createInvoker(
    LogisticaController_2.viajes,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LogisticaController",
      "viajes",
      Nil,
      "GET",
      """ RUTAS DEL LogisticaController""",
      this.prefix + """logistic/viajes"""
    )
  )

  // @LINE:53
  private[this] lazy val controllers_LogisticaController_planilla28_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("logistic/planilla")))
  )
  private[this] lazy val controllers_LogisticaController_planilla28_invoker = createInvoker(
    LogisticaController_2.planilla,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LogisticaController",
      "planilla",
      Nil,
      "GET",
      """""",
      this.prefix + """logistic/planilla"""
    )
  )

  // @LINE:54
  private[this] lazy val controllers_LogisticaController_facturacion29_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("logistic/facturacion")))
  )
  private[this] lazy val controllers_LogisticaController_facturacion29_invoker = createInvoker(
    LogisticaController_2.facturacion,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LogisticaController",
      "facturacion",
      Nil,
      "GET",
      """""",
      this.prefix + """logistic/facturacion"""
    )
  )

  // @LINE:55
  private[this] lazy val controllers_LogisticaController_politica_cobro30_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("logistic/politica/cobro")))
  )
  private[this] lazy val controllers_LogisticaController_politica_cobro30_invoker = createInvoker(
    LogisticaController_2.politica_cobro,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LogisticaController",
      "politica_cobro",
      Nil,
      "GET",
      """""",
      this.prefix + """logistic/politica/cobro"""
    )
  )

  // @LINE:56
  private[this] lazy val controllers_LogisticaController_politica_pago31_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("logistic/politica/pago")))
  )
  private[this] lazy val controllers_LogisticaController_politica_pago31_invoker = createInvoker(
    LogisticaController_2.politica_pago,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LogisticaController",
      "politica_pago",
      Nil,
      "GET",
      """""",
      this.prefix + """logistic/politica/pago"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:8
    case controllers_Assets_versioned0_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned0_invoker.call(Assets_4.versioned(path, file))
      }
  
    // @LINE:12
    case controllers_HomeController_index1_route(params) =>
      call { 
        controllers_HomeController_index1_invoker.call(HomeController_1.index)
      }
  
    // @LINE:13
    case controllers_HomeController_login2_route(params) =>
      call { 
        controllers_HomeController_login2_invoker.call(HomeController_1.login)
      }
  
    // @LINE:14
    case controllers_HomeController_login_post3_route(params) =>
      call { 
        controllers_HomeController_login_post3_invoker.call(HomeController_1.login_post)
      }
  
    // @LINE:15
    case controllers_HomeController_logout4_route(params) =>
      call { 
        controllers_HomeController_logout4_invoker.call(HomeController_1.logout)
      }
  
    // @LINE:16
    case controllers_HomeController_about5_route(params) =>
      call { 
        controllers_HomeController_about5_invoker.call(HomeController_1.about)
      }
  
    // @LINE:21
    case controllers_AdministradorController_usuarios6_route(params) =>
      call { 
        controllers_AdministradorController_usuarios6_invoker.call(AdministradorController_3.usuarios)
      }
  
    // @LINE:25
    case controllers_GerenteController_clientes7_route(params) =>
      call { 
        controllers_GerenteController_clientes7_invoker.call(GerenteController_0.clientes)
      }
  
    // @LINE:26
    case controllers_GerenteController_cliente_new8_route(params) =>
      call { 
        controllers_GerenteController_cliente_new8_invoker.call(GerenteController_0.cliente_new)
      }
  
    // @LINE:27
    case controllers_GerenteController_cliente_edit9_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_GerenteController_cliente_edit9_invoker.call(GerenteController_0.cliente_edit(id))
      }
  
    // @LINE:28
    case controllers_GerenteController_cliente_remove10_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_GerenteController_cliente_remove10_invoker.call(GerenteController_0.cliente_remove(id))
      }
  
    // @LINE:30
    case controllers_GerenteController_motoristas11_route(params) =>
      call { 
        controllers_GerenteController_motoristas11_invoker.call(GerenteController_0.motoristas)
      }
  
    // @LINE:31
    case controllers_GerenteController_motorista_new12_route(params) =>
      call { 
        controllers_GerenteController_motorista_new12_invoker.call(GerenteController_0.motorista_new)
      }
  
    // @LINE:32
    case controllers_GerenteController_motorista_edit13_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_GerenteController_motorista_edit13_invoker.call(GerenteController_0.motorista_edit(id))
      }
  
    // @LINE:33
    case controllers_GerenteController_motorista_remove14_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_GerenteController_motorista_remove14_invoker.call(GerenteController_0.motorista_remove(id))
      }
  
    // @LINE:35
    case controllers_GerenteController_cabezales15_route(params) =>
      call { 
        controllers_GerenteController_cabezales15_invoker.call(GerenteController_0.cabezales)
      }
  
    // @LINE:36
    case controllers_GerenteController_cabezal_new16_route(params) =>
      call { 
        controllers_GerenteController_cabezal_new16_invoker.call(GerenteController_0.cabezal_new)
      }
  
    // @LINE:37
    case controllers_GerenteController_cabezal_edit17_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_GerenteController_cabezal_edit17_invoker.call(GerenteController_0.cabezal_edit(id))
      }
  
    // @LINE:38
    case controllers_GerenteController_cabezal_remove18_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_GerenteController_cabezal_remove18_invoker.call(GerenteController_0.cabezal_remove(id))
      }
  
    // @LINE:40
    case controllers_GerenteController_planilla19_route(params) =>
      call { 
        controllers_GerenteController_planilla19_invoker.call(GerenteController_0.planilla)
      }
  
    // @LINE:41
    case controllers_GerenteController_facturacion20_route(params) =>
      call { 
        controllers_GerenteController_facturacion20_invoker.call(GerenteController_0.facturacion)
      }
  
    // @LINE:42
    case controllers_GerenteController_politica_cobro21_route(params) =>
      call { 
        controllers_GerenteController_politica_cobro21_invoker.call(GerenteController_0.politica_cobro)
      }
  
    // @LINE:43
    case controllers_GerenteController_politica_pago22_route(params) =>
      call { 
        controllers_GerenteController_politica_pago22_invoker.call(GerenteController_0.politica_pago)
      }
  
    // @LINE:45
    case controllers_GerenteController_usuarios23_route(params) =>
      call { 
        controllers_GerenteController_usuarios23_invoker.call(GerenteController_0.usuarios)
      }
  
    // @LINE:46
    case controllers_GerenteController_usuario_new24_route(params) =>
      call { 
        controllers_GerenteController_usuario_new24_invoker.call(GerenteController_0.usuario_new)
      }
  
    // @LINE:47
    case controllers_GerenteController_usuario_edit25_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_GerenteController_usuario_edit25_invoker.call(GerenteController_0.usuario_edit(id))
      }
  
    // @LINE:48
    case controllers_GerenteController_usuario_remove26_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_GerenteController_usuario_remove26_invoker.call(GerenteController_0.usuario_remove(id))
      }
  
    // @LINE:52
    case controllers_LogisticaController_viajes27_route(params) =>
      call { 
        controllers_LogisticaController_viajes27_invoker.call(LogisticaController_2.viajes)
      }
  
    // @LINE:53
    case controllers_LogisticaController_planilla28_route(params) =>
      call { 
        controllers_LogisticaController_planilla28_invoker.call(LogisticaController_2.planilla)
      }
  
    // @LINE:54
    case controllers_LogisticaController_facturacion29_route(params) =>
      call { 
        controllers_LogisticaController_facturacion29_invoker.call(LogisticaController_2.facturacion)
      }
  
    // @LINE:55
    case controllers_LogisticaController_politica_cobro30_route(params) =>
      call { 
        controllers_LogisticaController_politica_cobro30_invoker.call(LogisticaController_2.politica_cobro)
      }
  
    // @LINE:56
    case controllers_LogisticaController_politica_pago31_route(params) =>
      call { 
        controllers_LogisticaController_politica_pago31_invoker.call(LogisticaController_2.politica_pago)
      }
  }
}
