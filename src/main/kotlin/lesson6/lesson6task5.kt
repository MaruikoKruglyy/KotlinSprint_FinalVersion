package lesson6

import kotlin.random.Random

fun main() {

    var numberOne = Random.nextInt(from = 1, until = 10)
    var numberTwo = Random.nextInt(from = 1, until = 10)
    var rightAnswer = numberOne + numberTwo
    var numberOfTrials = 3 - 1 // 3 - the first try

    println("Пожалуйста, решите следующий пример и введите ответ: $numberOne + $numberTwo =")

    var userAnswer = readln().toInt()

    while (userAnswer != rightAnswer && numberOfTrials > 0) {
        println("Ответ неверен! Осталось попыток: ${numberOfTrials--}")
       numberOne = Random.nextInt(from = 1, until = 10)
        numberTwo = Random.nextInt(from = 1, until = 10)
        rightAnswer = numberOne + numberTwo
        println("Пожалуйста, решите следующий пример и введите ответ: $numberOne + $numberTwo =")
        userAnswer = readln().toInt()
    }

    when {
        userAnswer == rightAnswer -> println("Добро пожаловать!")
        numberOfTrials == 0 -> println("Доступ запрещен!")
    }
}