package models

import collection.mutable

object LoginMemoryModel {
    private val users = mutable.Map[String, String]("admin" -> "admin")

    def validateUser(username: String, password: String): Boolean = {
        users.get(username).map{ _ == password }.getOrElse(false)
    }

    def createUser(username: String, password: String): Boolean = ???

    def getLogin(username: String): Seq[String] = ???

    def addUser(username: String, password: String): Unit = ???

    def removeUser(username: String, index: Int): Boolean = ???
}