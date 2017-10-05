
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/ufabc/devel/form-captacao-contato-play/conf/routes
// @DATE:Thu Oct 05 18:54:36 BRT 2017


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
