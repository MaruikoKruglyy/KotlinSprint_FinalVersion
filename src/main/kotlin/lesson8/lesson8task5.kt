package lesson8

fun main() {

    println("Сколько ингредиентов в рецепте?")
    val numberOfIngredients = readln().toInt()

    val arrayOfIngredients = arrayOfNulls<String>(numberOfIngredients)
for (i in 0..<numberOfIngredients) {
println("Введите ингредиент:")
    val userIngredient = readln()
    arrayOfIngredients[i] = userIngredient
    }
println("Набор ингредиентов: ${arrayOfIngredients.joinToString(", " )}.")
}
