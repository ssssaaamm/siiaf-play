
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/sarahi/siiaf-play/conf/routes
// @DATE:Sun Nov 06 00:23:12 CST 2016

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseAssets Assets = new controllers.ReverseAssets(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseGerenteController GerenteController = new controllers.ReverseGerenteController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseLogisticaController LogisticaController = new controllers.ReverseLogisticaController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseHomeController HomeController = new controllers.ReverseHomeController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseAdministradorController AdministradorController = new controllers.ReverseAdministradorController(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseAssets Assets = new controllers.javascript.ReverseAssets(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseGerenteController GerenteController = new controllers.javascript.ReverseGerenteController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseLogisticaController LogisticaController = new controllers.javascript.ReverseLogisticaController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseHomeController HomeController = new controllers.javascript.ReverseHomeController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseAdministradorController AdministradorController = new controllers.javascript.ReverseAdministradorController(RoutesPrefix.byNamePrefix());
  }

}
