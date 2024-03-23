package lesson8

fun main() {

    val monday = 300
    val tuesday = 287
    val wednesday = 296
    val thursday = 302
    val friday = 299
    val saturday = 265
    val sunday = 304

    val arrayOfViewsPerWeek = arrayOf(monday, tuesday, wednesday, thursday, friday, saturday, sunday)
    val totalViews = arrayOfViewsPerWeek.sum()

println("Всего просмотров за неделю: $totalViews")
}