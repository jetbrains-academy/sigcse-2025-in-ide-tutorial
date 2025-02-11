package org.jetbrains.academy.kotlin.template

import kotlin.random.Random

fun binarySearchBook(bookIds: List<Int>, targetId: Int): Int {
    var left = 0
    var right = bookIds.size - 1

    while (left <= right) {
        val mid = left + (right - left) / 2 // Calculate the middle index to avoid overflow

        when {
            bookIds[mid] == targetId -> {
                return mid // Found the target, return the index
            }
            bookIds[mid] < targetId -> {
                left = mid + 1 // Move to the right half
            }
            else -> {
                right = mid - 1 // Move to the left half
            }
        }
    }

    return -1 // Target not found
}

fun generateBookIds(): List<Int> {
    // Generate a random size for the list, between 5 and 20
    val numberOfBooks = Random.nextInt(5, 21)

    // Generate a set of random unique book IDs between 0 and 500
    val bookIds = mutableSetOf<Int>()
    while (bookIds.size < numberOfBooks) {
        bookIds.add(Random.nextInt(0, 501))
    }

    // Convert the set to a list and return
    return bookIds.toList()
}

fun main() {
    val libraryBooks = generateBookIds().sorted()
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
