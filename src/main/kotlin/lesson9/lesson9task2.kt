package lesson9

fun main() {
    val listOfIngredients = mutableListOf("яйца", "сахар", "сливки")

    println("В рецепте есть базовые ингредиенты:")
    println(listOfIngredients.joinToString(", ", "", "."))
    println("Желаете добавить еще?")
    val yesOrNo = readln()

    if (yesOrNo != "да") {
        return
    }

    println("Какой ингредиент вы хотите добавить?")
    val newIngredient = readln()
    listOfIngredients.add(newIngredient)

    println("Теперь в рецепте есть следующие ингредиенты:")
    println(listOfIngredients.joinToString(", ", "", "."))
}