package lesson7

fun main() {

    println("Пожалуйста, введите число, на котором окончится прогрессия:")
    val finalNumber = readln().toInt()
    val range = (0..finalNumber)
    for (i in range step 2) {
        println(i)
    }
}