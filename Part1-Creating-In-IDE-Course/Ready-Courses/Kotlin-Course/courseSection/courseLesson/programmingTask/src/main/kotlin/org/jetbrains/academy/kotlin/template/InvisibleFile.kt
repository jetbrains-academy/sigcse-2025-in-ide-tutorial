package org.jetbrains.academy.kotlin.template

// This file will be hidden in the student mode
fun safeUserInput(): Int {
    var temperature: String
    var isCorrect: Boolean
    val errorMessage = "The temperature should be in range [-40; 40]"
    do {
        println("Please input temperature. $errorMessage:")
        temperature = safeReadLine()
    } while(!isCorrectInput(temperature))
    return temperature.toInt()
}

fun isCorrectInput(temperature: String): Boolean {
    val intTemp = temperature.toIntOrNull() ?: return false
    return intTemp in -40..40
}

fun safeReadLine() = readlnOrNull() ?: error("Your input is incorrect, sorry. Please, input a number.")
