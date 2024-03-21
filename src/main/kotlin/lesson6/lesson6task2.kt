package lesson6

fun main() {

    println("Введите, сколько секунд необходимо засечь:")
    var secondsToTime = readln().toInt()

    while (secondsToTime < 0) {println("Введите положительное число!")
        secondsToTime = readln().toInt()}

    val milliseconds: Long = secondsToTime * 1000L

    Thread.sleep(milliseconds)

    println("Прошло секунд: $secondsToTime")
      }