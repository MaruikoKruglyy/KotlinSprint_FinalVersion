package lesson4

const val BENEFICIAL_WEATHER = "солнечно"
const val BENEFICIAL_TENT = "открыт"
const val BENEFICIAL_HUMIDITY_PERCENTAGE = 20
const val ADVERSE_SEASON = "зима"

fun main() {
    val weatherNow = "солнечно" == BENEFICIAL_WEATHER
    val tentNow = "открыт" == BENEFICIAL_TENT
    val humidityNow = 20
    val seasonNow = "зима"

    println(
        "Благоприятные ли условия сейчас для роста бобовых? ${
            weatherNow && tentNow &&
                    humidityNow == BENEFICIAL_HUMIDITY_PERCENTAGE && seasonNow != ADVERSE_SEASON
        }"
    )
}