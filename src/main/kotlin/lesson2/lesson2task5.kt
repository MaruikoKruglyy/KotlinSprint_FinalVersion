package lesson2

const val DAYS_PER_YEAR = 365
const val MAXIMUM_PERCENTAGE = 100

fun main() {
    val initialSum = 70000
    val percentageRate = 16.7
    val numberOfYears = 20.0

    val compoundInterest = (Math.pow((1 + (percentageRate * DAYS_PER_YEAR) / (DAYS_PER_YEAR * MAXIMUM_PERCENTAGE)), numberOfYears)) * initialSum


    println("%.3f".format(compoundInterest))

}