package lesson5

fun main() {

    val winningNumberOne = 41
    val winningNumberTwo = 5
    println("Введите первое число:")
    val answerOne = readln().toInt()
    println("Введите второе число:")
    val answerTwo = readln().toInt()

    val lineToPrint = when {
        answerOne == winningNumberOne &&
                answerTwo == winningNumberTwo -> "Поздравляем! Вы выиграли главный приз!"

        answerTwo == winningNumberOne &&
                answerOne == winningNumberTwo -> "Поздравляем! Вы выиграли главный приз!"

        answerOne == winningNumberOne || answerOne == winningNumberTwo &&
                answerTwo != winningNumberOne && answerTwo != winningNumberTwo -> "Вы выиграли утешительный приз!"

        answerTwo == winningNumberOne || answerTwo == winningNumberTwo &&
                answerOne != winningNumberOne && answerOne != winningNumberTwo -> "Вы выиграли утешительный приз!"

        else -> "Неудача!"
    }
    println(lineToPrint)
    println("Загаданы были числа $winningNumberOne и $winningNumberTwo!")

}