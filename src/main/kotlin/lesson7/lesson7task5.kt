package lesson7

fun main() {


    println("Введите длину пароля, минимальная длина 6 символов:")
    var passwordLength = readln().toInt()
    while (passwordLength < 6) {
        println("Ведите число не меньше шести!")
        passwordLength = readln().toInt()

    }
    var password = listOf((1..9).random(), ('a'..'z').random(), ('A'..'Z').random())
for (i in password) {
    print(i)
}
for (i in 4..passwordLength) {
    password = listOf((1..9).random(), ('a'..'z').random(), ('A'..'Z').random())
    print(password.random())
}
}