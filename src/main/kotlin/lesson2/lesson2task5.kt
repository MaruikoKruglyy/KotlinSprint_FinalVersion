package lesson2

const val daysPerYear = 365
const val maximumPercentage = 100

fun main() {
    val initialSum = 70000
    val percentageRate = 16.7
    val numberOfYears = 20.0

    val compoundInterest = (Math.pow((1 + (percentageRate * daysPerYear) / (daysPerYear * maximumPercentage)), numberOfYears)) * initialSum

    println("%.3f".format(compoundInterest))

}