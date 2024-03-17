package lesson3

fun main() {
    var from = "E" + 2
    var to = "E" + 4
    var moveNumber = 0
    var sendToServer = "[$from-$to;$moveNumber]"
    println(sendToServer)

    from = "D" + 2
    to = "D${2 + 1}"

    moveNumber = moveNumber + 1
    sendToServer = "[$from-$to;$moveNumber]"
    println(sendToServer)
}