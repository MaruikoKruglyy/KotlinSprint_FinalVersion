package lesson1

const val secondsInAMinute = 60
const val minutesInAnHour = 60

fun main() {
    val totalSecondsInSpace = 6480
    val totalMinutesInSpace = totalSecondsInSpace / secondsInAMinute // 108
    val fullHoursInSpace = totalMinutesInSpace / minutesInAnHour // 1

    val fullHoursInMinutes = fullHoursInSpace * minutesInAnHour // 60
    val minutesLeft = totalMinutesInSpace - fullHoursInMinutes // 48
    val secondsLeft = totalSecondsInSpace % secondsInAMinute // 00

    println("%02d:%02d:%02d".format(fullHoursInSpace, minutesLeft, secondsLeft))

}