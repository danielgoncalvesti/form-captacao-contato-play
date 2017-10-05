
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/danielgoncalvesti/devel/form-captacao-contato-play/conf/routes
// @DATE:Wed Oct 04 23:58:03 BRT 2017

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseInteressadoCRUD InteressadoCRUD = new controllers.ReverseInteressadoCRUD(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseAssets Assets = new controllers.ReverseAssets(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseCountController CountController = new controllers.ReverseCountController(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseInteressadoCRUD InteressadoCRUD = new controllers.javascript.ReverseInteressadoCRUD(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseAssets Assets = new controllers.javascript.ReverseAssets(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseCountController CountController = new controllers.javascript.ReverseCountController(RoutesPrefix.byNamePrefix());
  }

}
