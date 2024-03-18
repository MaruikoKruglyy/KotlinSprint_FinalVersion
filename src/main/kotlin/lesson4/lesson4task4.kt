package lesson4

import kotlin.math.abs


fun main() {

    val dayOfTraining = 5
    val oddOrEvenDayOfTraining = dayOfTraining % 2
    val armExercise = oddOrEvenDayOfTraining != 0
    val legExercise = oddOrEvenDayOfTraining == 0
    val backExercise = oddOrEvenDayOfTraining == 0
    val absExercise = oddOrEvenDayOfTraining != 0

    println(
        """
        |Упражнения для рук: ${armExercise}      
        |Упражнения для ног: ${legExercise}       
        |Упражнения для спины: ${backExercise}  
        |Упражнения для пресса: ${absExercise}  
        """.trimMargin()
    )
}