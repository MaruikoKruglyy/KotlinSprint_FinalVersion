package lesson5

fun main() {

    println("Пожалуйста, запишите ответ к данному выражению: 5 + 6 = ?")
    val rightAnswer = 11
    val answer = readln().toInt()
    val lineToPrint = if (answer == rightAnswer) "Добро пожаловать!"
    else "Доступ запрещен"

    println(lineToPrint)

}