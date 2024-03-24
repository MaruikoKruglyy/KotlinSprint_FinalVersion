package lesson8

fun main() {

    val arrayOfIngredients = arrayOf("картофель", "соль", "масло", "зелень")

    println("Какой ингредиент вы хотите найти?")
    val searchedIngredient = readln()

    for (i in arrayOfIngredients) {
        if (i == searchedIngredient) {
            println("Ингредиент $searchedIngredient в рецепте есть")
            return
        }
    }
    println("Такого ингредиента в рецепте нет")
}