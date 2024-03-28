package lesson9

fun main() {
    val amountForOneOmelette = mutableListOf(2, 50, 15) //яиц, молока, масла
println("Сколько порций омлета нужно приготовить?")
    val numberOfPortions = readln().toInt()
val amountForPortions = amountForOneOmelette.map {
    it * numberOfPortions
}
println( "На $numberOfPortions порций вам понадобится: Яиц – ${amountForPortions[0]} шт., " +
        "молока – ${amountForPortions[1]} мл, сливочного масла – ${amountForPortions[2]} мг.]")


}