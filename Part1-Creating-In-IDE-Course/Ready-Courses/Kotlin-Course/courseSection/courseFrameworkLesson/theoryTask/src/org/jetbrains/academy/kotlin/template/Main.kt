package org.jetbrains.academy.kotlin.template

fun binarySearchBook(bookIds: List<Int>, targetId: Int): Int {
    TODO("Your implementation here")
}

fun generateBookIds(): List<Int> = TODO("Your implementation here")

fun main() {
    val libraryBooks = generateBookIds()
    println("Books in the library: " + libraryBooks.toList())

    val bookToFind1 = 320
    val bookToFind2 = 999

    val result1 = binarySearchBook(libraryBooks, bookToFind1)
    val result2 = binarySearchBook(libraryBooks, bookToFind2)

    if (result1 != -1)
        println("Book with ID $bookToFind1 found at index $result1!")
    else
        println("Book with ID $bookToFind1 not found!")

    if (result2 != -1)
        println("Book with ID $bookToFind2 found at index $result2!")
    else
        println("Book with ID $bookToFind2 not found!")
}
