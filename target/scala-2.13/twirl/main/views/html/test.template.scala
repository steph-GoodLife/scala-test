
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


Seq[Any](format.raw/*1.22*/("""
"""),_display_(/*2.2*/main("test")/*2.14*/ {_display_(Seq[Any](format.raw/*2.16*/("""
"""),_display_(/*3.2*/defining(play.core.PlayVersion.current)/*3.41*/ { version =>_display_(Seq[Any](format.raw/*3.54*/("""
    
"""),format.raw/*5.1*/("""<div class="container"></div>
    <h2>1ere vue de test avec Scala</h2>

    <p>...Et si je suis ici c'est que je suis bien connecté!</p>

    <div class="wrapper">
        <ul>
            """),_display_(/*12.14*/for(cour <- cours) yield /*12.32*/{_display_(Seq[Any](format.raw/*12.33*/("""
                    """),format.raw/*13.21*/("""<li>"""),_display_(/*13.26*/cour),format.raw/*13.30*/("""</li>
            """)))}),format.raw/*14.14*/("""
        """),format.raw/*15.9*/("""</ul>
    </div>
</div>



""")))}),format.raw/*21.2*/("""
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
                  HASH: 57e22ef3f1413a120d2e13478680bacc526b2099
                  MATRIX: 733->1|848->21|876->24|896->36|935->38|963->41|1010->80|1060->93|1094->101|1318->298|1352->316|1391->317|1441->339|1473->344|1498->348|1549->368|1586->378|1650->412
                  LINES: 21->1|26->1|27->2|27->2|27->2|28->3|28->3|28->3|30->5|37->12|37->12|37->12|38->13|38->13|38->13|39->14|40->15|46->21
                  -- GENERATED --
              */
          