package lesson6


fun main() {

    var numberOfTries = 5
    val winningNumber = (1..9).random()

    do {
        println("Угадайте число от 1 до 9:")
        val guessedNumber = readln().toInt()
        if (guessedNumber != winningNumber) {
            println("Догадка не верна! Осталось попыток: ${--numberOfTries}")
        } else {
            println("Это была великолепная игра!")
            return
        }
    } while (numberOfTries > 0)
    println("Попытки истекли! Было загадано число $winningNumber.")
}


