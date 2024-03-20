package lesson6

fun main() {
    println("Введите новый логин:")
    val newLogin = readln()
    println("Введите новый пароль:")
    val newPassword = readln()

    println("Введите свой логин:")
    var enteredLogin = readln()
    println("Введите свой пароль:")
    var enteredPassword = readln()

    while (enteredLogin != newLogin || enteredPassword != newPassword) {
        println("Логин или пароль введены неверно!\nВведите свой логин:")
        enteredLogin = readln()
        println("Введите свой пароль:")
        enteredPassword = readln()
    }

    println("Авторизация прошла успешно.")

}