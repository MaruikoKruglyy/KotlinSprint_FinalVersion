package lesson5

const val AGE_OF_MAJORITY = 18

fun main() {
    println("Введите год своего рождения:")
    val answer = readln().toInt()
    val currentYear = 2024
    val userAge = currentYear - answer
    val lineToPrint = when {
        userAge >= AGE_OF_MAJORITY -> "Показать экран со скрытым контентом"
        else -> "Вернуться на главный экран приложения"
    }
    println(lineToPrint)
}