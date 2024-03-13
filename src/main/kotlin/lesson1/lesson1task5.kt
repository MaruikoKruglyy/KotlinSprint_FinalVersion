package lesson1

fun main () {
    val secondsInSpace = 6480
    val minutesInSpace = 108
    val fullHoursInSpace = 1
    val minutesLeft = 48
    val secondsLeft = 0

    print (String.format("%02d",fullHoursInSpace)); print (":")
    print (minutesLeft); print (":")
    print (String.format("%02d",secondsLeft))
}