package lesson4

const val TOTAL_TABLES = 13

fun main() {
    val tablesReservedForToday = 13
    val tablesReservedForTomorrow = TOTAL_TABLES - 4
    val tablesAvailableToday = tablesReservedForToday < TOTAL_TABLES
    val tablesAvailableTomorrow = tablesReservedForTomorrow < TOTAL_TABLES
    println("[Доступность столиков на сегодня: $tablesAvailableToday]")
    println("[Доступность столиков на завтра: $tablesAvailableTomorrow]")
}