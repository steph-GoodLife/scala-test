package controllers

import javax.inject._
import play.api._
import play.api.mvc._


@Singleton
class TestController @Inject()(cc: ControllerComponents) extends AbstractController(cc) {

    def test = Action { implicit request =>
        val cours = List("Cours", "Quiz", "Note", "Lulu")
        Ok(views.html.test(cours))
    }

    def addTask = Action { implicit request =>
        val usernameOption = request.session.get("username")
        usernameOption.map{ username =>
            val cours = request.body.asFormUrlEncoded
            cours.map{ args =>
                val task = args("newTask").head
                LoginMemoryModel.addTask(username, task);
                Redirect(routes.Testcontroller.test)
            }.getOrElse(Redirect(routes.TestController.test))
        }.getOrElse(Redirect(routes.LoginController.login))
        
    }

}