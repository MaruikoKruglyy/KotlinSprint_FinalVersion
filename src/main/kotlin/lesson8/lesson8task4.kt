package lesson8

fun main() {

    val arrayOfIngredients = arrayOf("картофель", "соль", "масло", "зелень", "лук")
    println("Список ингредиентов:")
    println(arrayOfIngredients.joinToString(", ", "", "."))

    println("Какой ингредиент нужно заменить?")
    val ingredientToChange = readln()

    if (ingredientToChange in arrayOfIngredients) {
        println("Какой ингредиент вы хотите добавить вместо?")
        val newIngredient = readln()
        val index = arrayOfIngredients.indexOf(ingredientToChange)
        arrayOfIngredients[index] = newIngredient
        println("Готово! Вы сохранили следующий список:")
        println(arrayOfIngredients.joinToString(", ", "", "."))
        return
    }
    println("Данного ингредиента в списке нет!")
}






