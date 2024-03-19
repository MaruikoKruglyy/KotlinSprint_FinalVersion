package lesson4

const val MIN_CREW = 55
const val RECOMMENDED_CREW = 70
const val MIN_PROVISION_BOXES = 50
const val IS_WEATHER_GOOD = true
const val IS_SHIP_NOT_DAMAGED = true

fun main() {

    println("Корпус кораля не поврежден? True / False")
    val shipBodyNotDamaged = readln().toBoolean()
    println("Текущий состав экипажа:")
    val crew = readln().toInt()
    println("Количество ящиков с провизией на борту:")
    val provisionsInBoxes = readln().toInt()
    println("Метеоусловия блаоприятны? True / False")
    val goodWeatherConditions = readln().toBoolean()

    println(
        "Научно-исследовательский корабль может приступить к долгосрочному плаванию: " +
                "${
                    shipBodyNotDamaged == IS_SHIP_NOT_DAMAGED && crew in MIN_CREW..RECOMMENDED_CREW &&
                            provisionsInBoxes > MIN_PROVISION_BOXES ||
                            crew == RECOMMENDED_CREW && provisionsInBoxes >= MIN_PROVISION_BOXES &&
                            goodWeatherConditions == IS_WEATHER_GOOD
                }"
    )
}