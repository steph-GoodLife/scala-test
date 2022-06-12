package controllers

import javax.inject._
import play.api._
import play.api.mvc._
import models.LoginMemoryModel


@Singleton
class LoginController @Inject()(cc: ControllerComponents) extends AbstractController(cc) {

    def login = Action{
        Ok(views.html.login())
    }

    def validateLoginGet(username: String, password: String) = Action{
        Ok(s"$username login with $password")
    }

    def validateLoginPost = Action{ request =>
        val postVals = request.body.asFormUrlEncoded
        postVals.map {args =>
            val username = args("username").head
            val password = args("password").head
                if (LoginMemoryModel.validateUser(username, password)) {
                    Redirect(routes.LoginController.validation())
                } else {
                    Redirect(routes.LoginController.login()).flashing("error" -> "Invalid username or password")
                }
            }.getOrElse(Ok("Oups!"))
    }


    def validation = Action {
        val cours = List("Cours", "Quiz", "Note", "Lulu")
        Ok(views.html.test(cours))
    }

}