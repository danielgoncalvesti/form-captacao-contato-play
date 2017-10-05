
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/ufabc/devel/form-captacao-contato-play/conf/routes
// @DATE:Thu Oct 05 10:48:03 BRT 2017

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  InteressadoCRUD_1: controllers.InteressadoCRUD,
  // @LINE:13
  Assets_0: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    InteressadoCRUD_1: controllers.InteressadoCRUD,
    // @LINE:13
    Assets_0: controllers.Assets
  ) = this(errorHandler, InteressadoCRUD_1, Assets_0, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, InteressadoCRUD_1, Assets_0, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.InteressadoCRUD.index"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """add""", """controllers.InteressadoCRUD.add"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.at(path:String = "/public", file:String)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_InteressadoCRUD_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_InteressadoCRUD_index0_invoker = createInvoker(
    InteressadoCRUD_1.index,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.InteressadoCRUD",
      "index",
      Nil,
      "GET",
      """ An example controller showing a sample home page""",
      this.prefix + """"""
    )
  )

  // @LINE:10
  private[this] lazy val controllers_InteressadoCRUD_add1_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("add")))
  )
  private[this] lazy val controllers_InteressadoCRUD_add1_invoker = createInvoker(
    InteressadoCRUD_1.add,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.InteressadoCRUD",
      "add",
      Nil,
      "POST",
      """GET     /testaInteressado           controllers.InteressadoCRUD.testa""",
      this.prefix + """add"""
    )
  )

  // @LINE:13
  private[this] lazy val controllers_Assets_at2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_at2_invoker = createInvoker(
    Assets_0.at(fakeValue[String], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "at",
      Seq(classOf[String], classOf[String]),
      "GET",
      """ Map static resources from the /public folder to the /assets URL path""",
      this.prefix + """assets/""" + "$" + """file<.+>"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_InteressadoCRUD_index0_route(params) =>
      call { 
        controllers_InteressadoCRUD_index0_invoker.call(InteressadoCRUD_1.index)
      }
  
    // @LINE:10
    case controllers_InteressadoCRUD_add1_route(params) =>
      call { 
        controllers_InteressadoCRUD_add1_invoker.call(InteressadoCRUD_1.add)
      }
  
    // @LINE:13
    case controllers_Assets_at2_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at2_invoker.call(Assets_0.at(path, file))
      }
  }
}
