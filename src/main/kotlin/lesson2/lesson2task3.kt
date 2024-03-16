package lesson2

const val MINUTES_IN_AN_HOUR = 60

fun main() {
    val hourOfDeparture = 9
    val minuteOfDeparture = 39
    val travelMinutes = 457

    val hoursOfTravel = travelMinutes / MINUTES_IN_AN_HOUR // 7
    val minutesOfTravelLeft = travelMinutes % MINUTES_IN_AN_HOUR // 37

    val sumOfMinutes = minuteOfDeparture + minutesOfTravelLeft
    val minutesLeft = sumOfMinutes % MINUTES_IN_AN_HOUR
    val hoursFromMinutes = sumOfMinutes / MINUTES_IN_AN_HOUR
    val sumOfHours = hourOfDeparture + hoursOfTravel + hoursFromMinutes

    println("$sumOfHours:$minutesLeft")


}