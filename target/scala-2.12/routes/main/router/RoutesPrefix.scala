// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/dusti/OneDrive/play_project_1/conf/routes
// @DATE:Thu Mar 14 00:02:13 CET 2019


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
