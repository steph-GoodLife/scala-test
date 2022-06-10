package controllers

import javax.inject._
import play.api._
import play.api.mvc._


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
            Redirect(s"$username logged in with $password")
            }.getOrElse(Ok("Oups!"))
    }


    def validation = Action {
        val cours = List("Cours", "Quiz", "Note", "Lulu")
        Ok(views.html.test(cours))
    }

}