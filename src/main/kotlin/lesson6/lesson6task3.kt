package lesson6

fun main() {

    println("Введите, сколько секунд необходимо засечь:")
    var secondsToTime = readln().toInt()
    while (secondsToTime < 0) {println("Введите положительное число!")
        secondsToTime = readln().toInt()}

      while (secondsToTime > 0) {
        println("Осталось секунд: ${secondsToTime--}")
        Thread.sleep(1000)
    }
    println("Время вышло.")
  }