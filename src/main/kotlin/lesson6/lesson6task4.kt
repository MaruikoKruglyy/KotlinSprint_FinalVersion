package lesson6

import kotlin.random.Random

fun main() {

    var numberOfTries = 5 - 1 // 5 tries - the first one
    val winningNumber = Random.nextInt(from = 0, until = 10)

    println("Угадайте число от 1 до 9:")
    var guessedNumber = readln().toInt()

    while (guessedNumber != winningNumber && numberOfTries > 0) {
        println("Догадка не верна! Осталось попыток: ${numberOfTries--}")
        guessedNumber = readln().toInt()
    }

    when {
        guessedNumber == winningNumber -> println("Это была великолепная игра!")
        numberOfTries == 0 -> println("Попытки истекли! Было загадано число $winningNumber.")
    }
}


