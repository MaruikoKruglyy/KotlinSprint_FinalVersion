package lesson4

const val MIN_AVERAGE_CARGO_WEIGHT = 35
const val MAX_AVERAGE_CARGO_WEIGH = 100
const val AVERAGE_CARGO_VOLUME_LESS_THAN = 100

fun main() {
    val cargoOneWeight = 20
    val cargoOneVolume = 80
    val cargoTwoWeight = 50
    val cargoTwoVolume = 100
    println(
        "Груз с весом $cargoOneWeight и объемом $cargoOneVolume соответствует категории 'Average': " +
                "${
                    cargoOneWeight <= MAX_AVERAGE_CARGO_WEIGH &&
                            cargoOneWeight >= MIN_AVERAGE_CARGO_WEIGHT &&
                            cargoOneVolume < AVERAGE_CARGO_VOLUME_LESS_THAN
                }"
    )
    println(
        "Груз с весом $cargoTwoWeight и объемом $cargoTwoVolume соответствует категории 'Average': " +
                "${
                    cargoTwoWeight <= MAX_AVERAGE_CARGO_WEIGH &&
                            cargoTwoWeight >= MIN_AVERAGE_CARGO_WEIGHT &&
                            cargoTwoVolume < AVERAGE_CARGO_VOLUME_LESS_THAN
                }"
    )
}