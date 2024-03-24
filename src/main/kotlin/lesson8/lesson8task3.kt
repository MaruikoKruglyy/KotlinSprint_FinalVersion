package lesson8

fun main() {

    val arrayOfIngredients = arrayOf("картофель", "соль", "масло", "зелень")

    println("Какой ингредиент вы хотите найти?")
    val searchedIngredient = readln()

    when (searchedIngredient) {
        arrayOfIngredients[0] -> println("Ингредиент $searchedIngredient в рецепте есть")
        arrayOfIngredients[1] -> println("Ингредиент $searchedIngredient в рецепте есть")
        arrayOfIngredients[2] -> println("Ингредиент $searchedIngredient в рецепте есть")
        arrayOfIngredients[3] -> println("Ингредиент $searchedIngredient в рецепте есть")
        else -> println("Такого ингредиента в рецепте нет")
    }

}