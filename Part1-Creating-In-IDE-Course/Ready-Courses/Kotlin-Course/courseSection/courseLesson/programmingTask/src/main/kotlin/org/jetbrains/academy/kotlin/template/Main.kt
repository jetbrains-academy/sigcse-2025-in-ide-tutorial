package org.jetbrains.academy.kotlin.template

fun chooseYourOutfit(temperature: Int): String {
    return if (temperature > 25) {
        "It's hot! Wear shorts and a t-shirt."
    } else if (temperature in 15..25) {
        "It's mild! Wear jeans and a light sweater."
    } else {
        "It's cold! Wear a jacket and long pants."
    }
}

fun main() {
    println(chooseYourOutfit(safeUserInput()))
}
