package models

import collection.mutable

object LoginMemoryModel {
    private val users = mutable.Map[String, String]("admin" -> "admin")
    private val tasks = mutable.Map[String, List[String]]("admin" -> List("Cours","Quiz","Play1"))

    def validateUser(username: String, password: String): Boolean = {
        users.get(username).map{ _ == password }.getOrElse(false)
    }

    def createUser(username: String, password: String): Boolean = {
        if (users.contains(username)) false
            else {
                users(username) = password
                true
            }
    }

    def getLogin(username: String): Seq[String] = {
        tasks.get(username).getOrElse(Nil)
    }

    def addTask(username: String, task: String): Unit = {
        tasks(username) = task :: tasks.get(username).getOrElse(Nil)
    }

    def removeUser(username: String, index: Int): Boolean = ???
}