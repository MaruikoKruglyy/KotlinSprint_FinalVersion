package lesson6

fun main() {
    println("Введите новый логин:")
    val newLogin = readln()
    println("Введите новый пароль:")
    val newPassword = readln()

   do {
       println("Введите свой логин:")
       val enteredLogin = readln()
       println("Введите свой пароль:")
      val enteredPassword = readln()
   }
    while (enteredLogin != newLogin || enteredPassword != newPassword)

    println("Авторизация прошла успешно.")

}