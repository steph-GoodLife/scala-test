package controllers

import javax.inject._
import play.api._
import play.api.mvc._
import models.LoginMemoryModel


@Singleton
class LoginController @Inject()(cc: ControllerComponents) extends AbstractController(cc) {

    def login = Action{ implicit request =>
        Ok(views.html.login())
    }

    def validateLoginGet(username: String, password: String) = Action{
        Ok(s"$username login with $password")
    }

    def validateLoginPost = Action{ implicit request =>
        val postVals = request.body.asFormUrlEncoded
        postVals.map {args =>
            val username = args("username").head
            val password = args("password").head
                if (LoginMemoryModel.validateUser(username, password)) {
                    Redirect(routes.LoginController.validation()).withSession("username" -> username)
                } else {
                    Redirect(routes.LoginController.login()).flashing("error" -> "Invalid username or password")
                }
            }.getOrElse(Ok("Oups!"))
    }

    def createUser = Action{ implicit request =>
        val postVals = request.body.asFormUrlEncoded
        postVals.map {args =>
            val username = args("username").head
            val password = args("password").head
                if (LoginMemoryModel.createUser(username, password)) {
                    Redirect(routes.LoginController.validation()).withSession("username" -> username)
                } else {
                    Redirect(routes.LoginController.login()).flashing("error" -> "Incorrect informations")
                }
            }.getOrElse(Ok("Oups!"))
    }


    def validation = Action { implicit request =>
        val usernameOption = request.session.get("username")
        usernameOption.map { username =>
            val cours = LoginMemoryModel.getLogin(username)
            Ok(views.html.test(cours))
        }.getOrElse(Redirect(routes.LoginController.login()))  
    }

    def logout = Action {
        Redirect(routes.LoginController.login()).withNewSession
    }

}