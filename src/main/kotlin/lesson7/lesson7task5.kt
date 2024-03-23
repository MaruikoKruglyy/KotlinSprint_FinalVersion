package lesson7

fun main() {


    println("Введите длину пароля, минимальная длина 6 символов:")
    var passwordLength = readln().toInt()
    while (passwordLength < 5) {
        println("Ведите число выше 5!")
        passwordLength = readln().toInt()
    }
    for (i in 1..passwordLength) {
        val password = listOf((1..9).random(), ('a'..'z').random(), ('A'..'Z').random())
        print(password.random())
    }
}