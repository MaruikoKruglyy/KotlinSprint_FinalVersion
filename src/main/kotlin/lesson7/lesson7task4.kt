package lesson7

fun main() {

    println("Сколько секунд нужно засечь?")
    val numberOfSeconds = readln().toInt()

    for (seconds in numberOfSeconds downTo 1) {
        println("Осталось секунд: ${seconds}")
        Thread.sleep(1000)
    }
    println("Время вышло!")
}