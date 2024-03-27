package lesson9

fun main() {

    val listOfIngredients = listOf("картофель", "масло", "соль", "лук", "зелень")
println("В рецепте есть следующие ингредиенты:")
println(listOfIngredients.joinToString("\n"))
}