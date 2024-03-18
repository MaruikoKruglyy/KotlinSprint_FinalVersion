package lesson4

const val MIN_CREW = 55
const val RECOMMENDED_CREW = 70
const val MIN_PROVISION_BOXES = 50

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
                    shipBodyNotDamaged && crew in MIN_CREW..RECOMMENDED_CREW &&
                            provisionsInBoxes > MIN_PROVISION_BOXES ||
                            crew == RECOMMENDED_CREW && provisionsInBoxes > MIN_PROVISION_BOXES &&
                            goodWeatherConditions
                }"
    )
}