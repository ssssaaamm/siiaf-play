
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/samuel/Desarrollo/siiaf/conf/routes
// @DATE:Sun Nov 06 01:40:18 CST 2016


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
