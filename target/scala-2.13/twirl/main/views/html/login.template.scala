
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

object login extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[RequestHeader,Flash,play.twirl.api.HtmlFormat.Appendable] {

  /* Login page */
  def apply/*2.2*/()(implicit request: RequestHeader, flash: Flash):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.51*/("""

"""),_display_(/*4.2*/main("login")/*4.15*/{_display_(Seq[Any](format.raw/*4.16*/("""
    """),_display_(/*5.6*/defining(play.core.PlayVersion.current)/*5.45*/ { version =>_display_(Seq[Any](format.raw/*5.58*/("""
        

    """),format.raw/*8.5*/("""<form method="get" action="/validate">
        <h2>Login</h2>
        Username: <input type="text" name="username"/></input><br>
        Password: <input type="password" name="password"/></input><br>
        <input type="submit"/>
    </form>
    <br>

    <form method="post" action="/validatePost">
        """),_display_(/*17.10*/helper/*17.16*/.CSRF.formField),format.raw/*17.31*/("""
        """),format.raw/*18.9*/("""<h2>Login with post</h2>
        Username: <input type="text" name="username"/></input><br> 
        Password: <input type="password" name="password"/></input><br>
        <input type="submit"/>
    </form>
    <br>

    <form method="post" action=""""),_display_(/*25.34*/routes/*25.40*/.LoginController.createUser),format.raw/*25.67*/("""">
        """),_display_(/*26.10*/helper/*26.16*/.CSRF.formField),format.raw/*26.31*/("""
        """),format.raw/*27.9*/("""<h2>Create User</h2>
        Username: <input type="text" name="username"/></input><br> 
        Password: <input type="password" name="password"/></input><br>
        <input type="submit"/>
    </form>
    
    
    
    """)))}),format.raw/*35.6*/("""
    """)))}))
      }
    }
  }

  def render(request:RequestHeader,flash:Flash): play.twirl.api.HtmlFormat.Appendable = apply()(request,flash)

  def f:(() => (RequestHeader,Flash) => play.twirl.api.HtmlFormat.Appendable) = () => (request,flash) => apply()(request,flash)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/login.scala.html
                  HASH: fdcd4bd8447801b5e80d56f3a73ff8215081ca1f
                  MATRIX: 754->19|898->68|928->73|949->86|987->87|1019->94|1066->133|1116->146|1160->164|1506->483|1521->489|1557->504|1594->514|1878->771|1893->777|1941->804|1981->817|1996->823|2032->838|2069->848|2330->1079
                  LINES: 21->2|26->2|28->4|28->4|28->4|29->5|29->5|29->5|32->8|41->17|41->17|41->17|42->18|49->25|49->25|49->25|50->26|50->26|50->26|51->27|59->35
                  -- GENERATED --
              */
          