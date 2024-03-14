package lesson1

fun main() {
    val totalSecondsInSpace = 6480
    val totalMinutesInSpace = totalSecondsInSpace / 60 // 108
    val fullHoursInSpace = totalMinutesInSpace / 60 // 1

    val fullHoursInMinutes = fullHoursInSpace * 60 // 60
    val minutesLeft = totalMinutesInSpace - fullHoursInMinutes // 48
    val secondsLeft = totalSecondsInSpace % 60 // 00

    println("%02d:%02d:%02d".format(fullHoursInSpace, minutesLeft, secondsLeft))

}