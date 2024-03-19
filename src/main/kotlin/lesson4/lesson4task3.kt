package lesson4

const val IS_SUNNY = true
const val IS_AWNING_OPEN = true
const val BENEFICIAL_HUMIDITY_PERCENTAGE = 20
const val ADVERSE_SEASON = "зима"

fun main() {
    val weatherNow = IS_SUNNY
    val tentNow = IS_AWNING_OPEN
    val humidityNow = 20
    val seasonNow = "зима"

    println(
        "Благоприятные ли условия сейчас для роста бобовых? ${
            weatherNow && tentNow &&
                    humidityNow == BENEFICIAL_HUMIDITY_PERCENTAGE && seasonNow != ADVERSE_SEASON
        }"
    )
}