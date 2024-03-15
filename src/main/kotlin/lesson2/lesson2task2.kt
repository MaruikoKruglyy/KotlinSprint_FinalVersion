package lesson2

fun main() {
    val numberOfPermEmployees = 50
    val permEmployeeSalary = 30000
    val numberOfInterns = 30
    val internSalary = 20000
    val numberOfPaidEmployees = numberOfPermEmployees + numberOfInterns

    val permEmployeesTotalSalary = numberOfPermEmployees * permEmployeeSalary
    println(permEmployeesTotalSalary)

    val internsTotalSalary = numberOfInterns * internSalary
    val totalSalaryExpenses = permEmployeesTotalSalary + internsTotalSalary
    println(totalSalaryExpenses)

    val averageSalary = totalSalaryExpenses / numberOfPaidEmployees
    println(averageSalary)
}