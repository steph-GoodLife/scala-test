
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

object login extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /* Login page */
  def apply/*2.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.4*/("""

"""),_display_(/*4.2*/main("login")/*4.15*/{_display_(Seq[Any](format.raw/*4.16*/("""
    """),_display_(/*5.6*/defining(play.core.PlayVersion.current)/*5.45*/ { version =>_display_(Seq[Any](format.raw/*5.58*/("""
        
    """),format.raw/*7.5*/("""<h2>Login</h2>

    <form method="get" action="/validate ">
        Username: <input type="text" name="username"/></input><br>
        Password: <input type="password" name="password"/></input><br>
        <input type="submit"/>
    </form>

    <form method="post" action="/validate">
        Username: <input type="text" name="username"/></input><br> 
        Password: <input type="password" name="password"/></input><br>
        <input type="submit"/>
    </form>
    
    
    
    """)))}),format.raw/*23.6*/("""
    """)))}))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/login.scala.html
                  HASH: 7d19e0a4b5679fed4cc1673e5caee74a5e150f82
                  MATRIX: 734->19|830->21|860->26|881->39|919->40|951->47|998->86|1048->99|1090->115|1624->619
                  LINES: 21->2|26->2|28->4|28->4|28->4|29->5|29->5|29->5|31->7|47->23
                  -- GENERATED --
              */
          