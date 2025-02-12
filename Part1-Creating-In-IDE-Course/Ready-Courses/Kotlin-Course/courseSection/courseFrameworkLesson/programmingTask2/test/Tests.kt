import org.jetbrains.academy.kotlin.template.binarySearchBook
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class Test {
    @Test
    fun `should find the target ID in the middle of the list`() {
        val bookIds = listOf(101, 205, 320, 450, 550, 700)
        val targetId = 450

        val result = binarySearchBook(bookIds, targetId)

        assertEquals(3, result) // 450 is at index 3
    }

    @Test
    fun `should find the target ID at the beginning of the list`() {
        val bookIds = listOf(101, 205, 320, 450, 550, 700)
        val targetId = 101

        val result = binarySearchBook(bookIds, targetId)

        assertEquals(0, result) // 101 is at index 0
    }

    @Test
    fun `should find the target ID at the end of the list`() {
        val bookIds = listOf(101, 205, 320, 450, 550, 700)
        val targetId = 700

        val result = binarySearchBook(bookIds, targetId)

        assertEquals(5, result) // 700 is at index 5
    }

    @Test
    fun `should return -1 when the target ID does not exist`() {
        val bookIds = listOf(101, 205, 320, 450, 550, 700)
        val targetId = 999

        val result = binarySearchBook(bookIds, targetId)

        assertEquals(-1, result) // 999 is not in the list
    }

    @Test
    fun `should handle an empty list and return -1`() {
        val bookIds = emptyList<Int>()
        val targetId = 123

        val result = binarySearchBook(bookIds, targetId)

        assertEquals(-1, result) // No elements in the list
    }

    @Test
    fun `should handle a single-element list where target is present`() {
        val bookIds = listOf(333)
        val targetId = 333

        val result = binarySearchBook(bookIds, targetId)

        assertEquals(0, result) // 333 is present at index 0
    }

    @Test
    fun `should handle a single-element list where target is absent`() {
        val bookIds = listOf(333)
        val targetId = 444

        val result = binarySearchBook(bookIds, targetId)

        assertEquals(-1, result) // 444 is not in the list
    }

    @Test
    fun `should handle duplicate elements and find the first match`() {
        val bookIds = listOf(101, 205, 205, 320, 450, 550, 700)
        val targetId = 205

        val result = binarySearchBook(bookIds, targetId)

        assertEquals(1, result) // 205 is at index 1 (binary search returns first match in order)
    }

    @Test
    fun `should handle large lists and find the correct index`() {
        val bookIds = (1..10_000).toList() // Sorted list from 1 to 10,000
        val targetId = 5_432

        val result = binarySearchBook(bookIds, targetId)

        assertEquals(5431, result) // Target ID 5,432 is at index 5431
    }
}