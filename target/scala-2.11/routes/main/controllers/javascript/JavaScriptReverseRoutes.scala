
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/sarahi/siiaf-play/conf/routes
// @DATE:Sun Nov 06 08:15:21 CST 2016

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:8
package controllers.javascript {
  import ReverseRouteContext.empty

  // @LINE:8
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:8
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }

  // @LINE:25
  class ReverseGerenteController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:32
    def motorista_edit: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.GerenteController.motorista_edit",
      """
        function(id0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "manager/motoristas/edit/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
    // @LINE:40
    def planilla: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.GerenteController.planilla",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "manager/planilla"})
        }
      """
    )
  
    // @LINE:26
    def cliente_new: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.GerenteController.cliente_new",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "manager/clientes/new"})
        }
      """
    )
  
    // @LINE:41
    def facturacion: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.GerenteController.facturacion",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "manager/facturacion"})
        }
      """
    )
  
    // @LINE:45
    def usuarios: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.GerenteController.usuarios",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "manager/usuarios"})
        }
      """
    )
  
    // @LINE:30
    def motoristas: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.GerenteController.motoristas",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "manager/motoristas"})
        }
      """
    )
  
    // @LINE:38
    def cabezal_remove: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.GerenteController.cabezal_remove",
      """
        function(id0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "manager/cabezales/remove/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
    // @LINE:28
    def cliente_remove: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.GerenteController.cliente_remove",
      """
        function(id0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "manager/clientes/remove/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
    // @LINE:48
    def usuario_remove: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.GerenteController.usuario_remove",
      """
        function(id0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "manager/usuarios/remove/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
    // @LINE:31
    def motorista_new: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.GerenteController.motorista_new",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "manager/motoristas/new"})
        }
      """
    )
  
    // @LINE:43
    def politica_pago: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.GerenteController.politica_pago",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "manager/politica/pago"})
        }
      """
    )
  
    // @LINE:35
    def cabezales: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.GerenteController.cabezales",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "manager/cabezales"})
        }
      """
    )
  
    // @LINE:37
    def cabezal_edit: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.GerenteController.cabezal_edit",
      """
        function(id0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "manager/cabezales/edit/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
    // @LINE:46
    def usuario_new: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.GerenteController.usuario_new",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "manager/usuarios/new"})
        }
      """
    )
  
    // @LINE:25
    def clientes: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.GerenteController.clientes",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "manager/clientes"})
        }
      """
    )
  
    // @LINE:36
    def cabezal_new: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.GerenteController.cabezal_new",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "manager/cabezales/new"})
        }
      """
    )
  
    // @LINE:47
    def usuario_edit: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.GerenteController.usuario_edit",
      """
        function(id0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "manager/usuarios/edit/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
    // @LINE:27
    def cliente_edit: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.GerenteController.cliente_edit",
      """
        function(id0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "manager/clientes/edit/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
    // @LINE:33
    def motorista_remove: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.GerenteController.motorista_remove",
      """
        function(id0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "manager/motoristas/remove/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
    // @LINE:42
    def politica_cobro: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.GerenteController.politica_cobro",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "manager/politica/cobro"})
        }
      """
    )
  
  }

  // @LINE:52
  class ReverseLogisticaController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:53
    def planilla: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.LogisticaController.planilla",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "logistic/planilla"})
        }
      """
    )
  
    // @LINE:54
    def facturacion: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.LogisticaController.facturacion",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "logistic/facturacion"})
        }
      """
    )
  
    // @LINE:56
    def politica_pago: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.LogisticaController.politica_pago",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "logistic/politica/pago"})
        }
      """
    )
  
    // @LINE:52
    def viajes: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.LogisticaController.viajes",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "logistic/viajes"})
        }
      """
    )
  
    // @LINE:55
    def politica_cobro: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.LogisticaController.politica_cobro",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "logistic/politica/cobro"})
        }
      """
    )
  
  }

  // @LINE:12
  class ReverseHomeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:14
    def login_post: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.login_post",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
        }
      """
    )
  
    // @LINE:16
    def about: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.about",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "about"})
        }
      """
    )
  
    // @LINE:15
    def logout: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.logout",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "logout"})
        }
      """
    )
  
    // @LINE:12
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
    // @LINE:13
    def login: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.login",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
        }
      """
    )
  
  }

  // @LINE:21
  class ReverseAdministradorController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:21
    def usuarios: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AdministradorController.usuarios",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/usuarios"})
        }
      """
    )
  
  }


}
