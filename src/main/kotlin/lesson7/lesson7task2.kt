package lesson7

fun main() {

    do {
        val authorizationCode = (1000..9999).random()
        println("Ваш код авторизации: $authorizationCode")
        println("Введите код авторизации:")
        val userCode = readln().toInt()
    } while (userCode != authorizationCode)
    println("Добро пожаловать!")
}
