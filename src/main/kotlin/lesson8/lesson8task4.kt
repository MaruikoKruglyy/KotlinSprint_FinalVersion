package lesson8

fun main() {

    val arrayOfIngredients = arrayOf("картофель", "соль", "масло", "зелень", "лук")
    println("Список ингредиентов:")
    for (i in arrayOfIngredients) {
        if (i == "лук") {
            print("$i. ")
        } else print("$i, ")
    }

    println("Какой ингредиент нужно заменить?")
    val ingredientToChange = readln()

    for (a in arrayOfIngredients) {
        if (a == ingredientToChange) {
            println("Какой ингредиент вы хотите добавить вместо?")
            val newIngredient = readln()
            val index = arrayOfIngredients.indexOf(a)
            arrayOfIngredients.set(index, newIngredient)
            println("Готово! Вы сохранили следующий список:")
            for (b in arrayOfIngredients) {
                if (b == arrayOfIngredients[4]) {
                    print("$b. ")
                } else print("$b, ")
            }
            return
        }

    }
    println("Данного ингредиента в списке нет!")
}






