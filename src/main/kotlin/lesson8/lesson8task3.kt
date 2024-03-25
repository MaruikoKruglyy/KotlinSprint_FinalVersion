package lesson8

fun main() {

    val arrayOfIngredients = arrayOf("картофель", "соль", "масло", "зелень")

    println("Какой ингредиент вы хотите найти?")
    val searchedIngredient = readln()

    when (searchedIngredient) {
        in arrayOfIngredients -> println("Ингредиент $searchedIngredient в рецепте есть")
        else -> println("Такого ингредиента в рецепте нет")
    }
}