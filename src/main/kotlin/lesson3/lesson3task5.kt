package lesson3

fun main() {
    val sentToServer = "D2-D4;0"
    val split = sentToServer.split("-", ";")
    val from = split[0]
    val to = split[1]
    val moveNumber = split[2]
    println(from)
    println(to)
    println(moveNumber)
}