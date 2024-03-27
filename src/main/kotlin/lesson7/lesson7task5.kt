package lesson7

fun main() {
    println("Введите длину пароля, минимальная длина 6 символов:")
    var passwordLength = readln().toInt()
    while (passwordLength < 6) {
        println("Ведите число не меньше шести!")
        passwordLength = readln().toInt()
    }

    val numbers = '1'..'9'
    val upperCase = 'A'..'Z'
    val lowerCase = 'a'..'z'

    val allChars = numbers + upperCase + lowerCase
    val password: MutableList<Char> = mutableListOf()
    password.add(numbers.random())
    password.add(upperCase.random())
    password.add(lowerCase.random())
    for (i in 4..passwordLength) {
        password.add(allChars.random())
    }
    password.shuffle()
    println(password.joinToString(""))
}