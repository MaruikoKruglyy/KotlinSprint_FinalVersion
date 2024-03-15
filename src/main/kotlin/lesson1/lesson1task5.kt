package lesson1

const val SECONDS_IN_A_MINUTE = 60
const val MINUTES_IN_AN_HOUR = 60

fun main() {
    val totalSecondsInSpace = 6480
    val totalMinutesInSpace = totalSecondsInSpace / SECONDS_IN_A_MINUTE // 108
    val fullHoursInSpace = totalMinutesInSpace / MINUTES_IN_AN_HOUR // 1

    val fullHoursInMinutes = fullHoursInSpace * MINUTES_IN_AN_HOUR // 60
    val minutesLeft = totalMinutesInSpace - fullHoursInMinutes // 48
    val secondsLeft = totalSecondsInSpace % SECONDS_IN_A_MINUTE // 00

    println("%02d:%02d:%02d".format(fullHoursInSpace, minutesLeft, secondsLeft))

}