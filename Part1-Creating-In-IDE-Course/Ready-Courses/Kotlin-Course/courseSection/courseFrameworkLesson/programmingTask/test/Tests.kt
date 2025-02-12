import org.jetbrains.academy.kotlin.template.generateBookIds
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertNotEquals
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class Test {
    @Test
    fun `should generate list size between 5 and 20`() {
        repeat(10) { // Run multiple times to ensure consistency
            val bookIds = generateBookIds()
            assertTrue(bookIds.size in 5..20, "List size ${bookIds.size} is out of the expected range (5 to 20)")
        }
    }

    @Test
    fun `should generate unique IDs in the list`() {
        repeat(10) { // Run multiple times to ensure IDs are unique
            val bookIds = generateBookIds()
            val uniqueIds = bookIds.toSet() // Converting to a set removes duplicates
            assertEquals(bookIds.size, uniqueIds.size, "The list contains duplicate IDs!")
        }
    }

    @Test
    fun `should generate IDs within the range 0 to 500`() {
        repeat(10) { // Run multiple times to ensure correctness
            val bookIds = generateBookIds()
            assertTrue(bookIds.all { it in 0..500 }, "List contains IDs outside the range 0 to 500")
        }
    }

    @Test
    fun `should generate different results on repeated calls`() {
        val result1 = generateBookIds()
        val result2 = generateBookIds()
        // Test if randomly generated lists are different
        assertNotEquals(result1, result2, "The function did not generate different results on repeated calls")
    }
}