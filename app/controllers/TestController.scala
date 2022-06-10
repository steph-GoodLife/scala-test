package controllers

import javax.inject._
import play.api._
import play.api.mvc._


@Singleton
class TestController @Inject()(cc: ControllerComponents) extends AbstractController(cc) {

    def test = Action {
        val cours = List("Cours", "Quiz", "Note", "Lulu")
        Ok(views.html.test(cours))
    }

}