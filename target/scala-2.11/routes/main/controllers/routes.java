
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/ufabc/devel/form-captacao-contato-play/conf/routes
// @DATE:Thu Oct 05 18:54:36 BRT 2017

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseInteressadoCRUD InteressadoCRUD = new controllers.ReverseInteressadoCRUD(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseAssets Assets = new controllers.ReverseAssets(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseInteressadoCRUD InteressadoCRUD = new controllers.javascript.ReverseInteressadoCRUD(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseAssets Assets = new controllers.javascript.ReverseAssets(RoutesPrefix.byNamePrefix());
  }

}
