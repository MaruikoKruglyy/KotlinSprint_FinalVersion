package lesson6

fun main() {

    println("Введите, сколько секунд необходимо засечь:")
    var secondsToTime = readln().toInt()
    while (secondsToTime < 0) {println("Введите положительное число!")
        secondsToTime = readln().toInt()}
    var counter = 0

    while (counter < secondsToTime) {
        counter++
        Thread.sleep(1000)
    }
    when (secondsToTime) {
        1 -> println("Прошла $secondsToTime секунда")
        in 2..4 -> println("Прошло $secondsToTime секунды")
        else -> println("Прошло $secondsToTime секунд")
    }
}