package lesson2

const val minutesInHour = 60

fun main() {
    val hourOfDeparture = 9
    val minuteOfDeparture = 39
    val travelMinutes = 457

    val hoursOfTravel = travelMinutes / minutesInHour // 7
    val minutesOfTravelLeft = travelMinutes % minutesInHour // 37

    val sumOfMinutes = minuteOfDeparture + minutesOfTravelLeft
    val minutesLeft = sumOfMinutes % minutesInHour
    val hoursFromMinutes = sumOfMinutes / minutesInHour
    val sumOfHours = hourOfDeparture + hoursOfTravel + hoursFromMinutes

    println("$sumOfHours:$minutesLeft")


}