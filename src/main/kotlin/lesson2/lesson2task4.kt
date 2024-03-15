package lesson2

const val maximumPercentage = 100

fun main () {
    val cristalOre = 7
    val ironOre = 11
    val buffPercentage = 20

    val extraCristalOre = cristalOre * buffPercentage / maximumPercentage
    val extraIronOre = ironOre * buffPercentage / maximumPercentage

    print("Кристаллическая руда +"); println (extraCristalOre)
    print("Железная руда +"); println (extraIronOre)
}