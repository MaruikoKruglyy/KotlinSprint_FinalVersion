package lesson5

import kotlin.random.Random

fun main() {

    println("Введите три числа от 0 до 42:")

    val enterNumberOne = readln().toInt()
    val enterNumberTwo = readln().toInt()
    val enterNumberThree = readln().toInt()
    val enteredNumbers = listOf(enterNumberOne, enterNumberTwo, enterNumberThree)

    val winningNumberOne = Random.nextInt(from = 0, until = 43)
    val winningNumberTwo = Random.nextInt(from = 0, until = 43)
    val winningNumberThree = Random.nextInt(from = 0, until = 43)
    val winningNumbers = listOf(winningNumberOne, winningNumberTwo, winningNumberThree)

    println("Победили числа $winningNumbers.")

    val matchedNumbers = enteredNumbers intersect winningNumbers.toSet()

    when (matchedNumbers.size) {
        0 -> println("Не угадано ни одного числа!")
        1 -> println("Вы угадали одно число и получаете утешительный приз!")
        2 -> println("Вы угадали два числа и получаете крупный приз!")
        3 -> println("Вы угадали все числа и выйграли джекпот!")
    }


}