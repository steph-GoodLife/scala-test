
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

object test extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Seq[String],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(cours: Seq[String]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*2.2*/main("test")/*2.14*/ {_display_(Seq[Any](format.raw/*2.16*/("""
"""),_display_(/*3.2*/defining(play.core.PlayVersion.current)/*3.41*/ { version =>_display_(Seq[Any](format.raw/*3.54*/("""
    
"""),format.raw/*5.1*/("""<div class="container"></div>
    <h2>1ere vue de test avec Scala</h2>

    <div class="wrapper">
        <ul>
            """),_display_(/*10.14*/for(cour <- cours) yield /*10.32*/{_display_(Seq[Any](format.raw/*10.33*/("""
                    """),format.raw/*11.21*/("""<li>"""),_display_(/*11.26*/cour),format.raw/*11.30*/("""</li>
            """)))}),format.raw/*12.14*/("""
        """),format.raw/*13.9*/("""</ul>
    </div>
</div>



""")))}),format.raw/*19.2*/("""
""")))}))
      }
    }
  }

  def render(cours:Seq[String]): play.twirl.api.HtmlFormat.Appendable = apply(cours)

  def f:((Seq[String]) => play.twirl.api.HtmlFormat.Appendable) = (cours) => apply(cours)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/test.scala.html
                  HASH: 2130e82ed81796e22cb3976512a9863c50a6b5a4
                  MATRIX: 733->1|847->23|867->35|906->37|933->39|980->78|1030->91|1062->97|1213->221|1247->239|1286->240|1335->261|1367->266|1392->270|1442->289|1478->298|1536->326
                  LINES: 21->1|26->2|26->2|26->2|27->3|27->3|27->3|29->5|34->10|34->10|34->10|35->11|35->11|35->11|36->12|37->13|43->19
                  -- GENERATED --
              */
          