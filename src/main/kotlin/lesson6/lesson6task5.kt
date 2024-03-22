package lesson6

fun main() {

    var numberOne = (1..9).random()
    var numberTwo = (1..9).random()
    var rightAnswer = numberOne + numberTwo
    var numberOfTrials = 3

    do {
        println("Пожалуйста, решите следующий пример и введите ответ: $numberOne + $numberTwo =")
        val userAnswer = readln().toInt()
        if (userAnswer == rightAnswer) {
            println("Добро пожаловать!")
            return
        }
        println("Ответ неверен! Осталось попыток: ${--numberOfTrials}")
        numberOne = (1..9).random()
        numberTwo = (1..9).random()
        rightAnswer = numberOne + numberTwo
    } while (userAnswer != rightAnswer && numberOfTrials > 0)
    println("Доступ запрещен!")
}