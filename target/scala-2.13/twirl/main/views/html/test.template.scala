
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

object test extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[Seq[String],RequestHeader,Flash,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(cours: Seq[String])(implicit request: RequestHeader, flash: Flash):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.69*/("""
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
        <br>
        
    <div>
        <form method="post" action=""""),_display_(/*19.38*/routes/*19.44*/.TestController.addTask),format.raw/*19.67*/("""">
            """),_display_(/*20.14*/helper/*20.20*/.CSRF.formField),format.raw/*20.35*/("""
            """),format.raw/*21.13*/("""<input type="text" name="newTask"></input>
            <br>
            <input type="submit">Add</input>
        </form>
    </div>

    </div>

    <div>
        <a href=""""),_display_(/*30.19*/routes/*30.25*/.LoginController.logout),format.raw/*30.48*/("""">Logout</a>
    </div>
</div>



""")))}),format.raw/*36.2*/("""
""")))}))
      }
    }
  }

  def render(cours:Seq[String],request:RequestHeader,flash:Flash): play.twirl.api.HtmlFormat.Appendable = apply(cours)(request,flash)

  def f:((Seq[String]) => (RequestHeader,Flash) => play.twirl.api.HtmlFormat.Appendable) = (cours) => (request,flash) => apply(cours)(request,flash)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/test.scala.html
                  HASH: af69514ccbe7332dc21affb0860e2680b2dc8753
                  MATRIX: 753->1|915->68|943->71|963->83|1002->85|1030->88|1077->127|1127->140|1161->148|1385->345|1419->363|1458->364|1508->386|1540->391|1565->395|1616->415|1653->425|1759->504|1774->510|1818->533|1862->550|1877->556|1913->571|1955->585|2164->767|2179->773|2223->796|2294->837
                  LINES: 21->1|26->1|27->2|27->2|27->2|28->3|28->3|28->3|30->5|37->12|37->12|37->12|38->13|38->13|38->13|39->14|40->15|44->19|44->19|44->19|45->20|45->20|45->20|46->21|55->30|55->30|55->30|61->36
                  -- GENERATED --
              */
          