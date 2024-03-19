package lesson5

const val REGISTERED_NAME = "Zaphod"
const val REGISTERED_PASSWORD = "PanGalactic"

fun main() {
    println("Ну что, какое имя пользователя?..")
    val userName = readln()

    if (userName == REGISTERED_NAME) {
        println("А теперь введите пароль:")
    }

    val userPassword = if (userName == REGISTERED_NAME) {
        readln()
    } else {
        println("Пожалуйста, зарегистрируйтесь и завершите процесс!")
    }

    if (userPassword == REGISTERED_PASSWORD) {
        println("Ваши данные проверены, и о, чудо, они верны... ")
    } else if (userName == REGISTERED_NAME) {
        println("Так и знал, пароль неверный...")
    } else {
    }
}

