package lesson7

fun main() {

    for (i in 1..3) {
        val numberOne = (1..9).random()
        val numberTwo = ('a'..'z').random()
        print("$numberOne$numberTwo")
    }
}
