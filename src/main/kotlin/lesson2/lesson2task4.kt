package lesson2

const val MAXIMUM_PERCENTAGE = 100

fun main () {
    val cristalOre = 7
    val ironOre = 11
    val buffPercentage = 20

    val extraCristalOre = cristalOre * buffPercentage / MAXIMUM_PERCENTAGE
    val extraIronOre = ironOre * buffPercentage / MAXIMUM_PERCENTAGE

    println("Кристаллическая руда +$extraCristalOre")
    println("Железная руда +$extraIronOre")
}