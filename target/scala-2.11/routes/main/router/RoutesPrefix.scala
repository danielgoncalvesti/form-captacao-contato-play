
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/ufabc/devel/form-captacao-contato-play/conf/routes
// @DATE:Thu Oct 05 10:48:03 BRT 2017


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
