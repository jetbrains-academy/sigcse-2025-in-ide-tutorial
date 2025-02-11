import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.jetbrains.academy.kotlin.template.chooseYourOutfit

class Test {
    companion object {
        private const val HOT_WEATHER = "It's hot! Wear shorts and a t-shirt."
        private const val MILD_WEATHER = "It's mild! Wear jeans and a light sweater."
        private const val COLD_WEATHER = "It's cold! Wear a jacket and long pants."
    }
    @Test
    fun `temperature above 25 should recommend hot outfit`() {
        Assertions.assertEquals(HOT_WEATHER, chooseYourOutfit(30))
        Assertions.assertEquals(HOT_WEATHER, chooseYourOutfit(26))
    }

    @Test
    fun `temperature between 15 and 25 inclusive should recommend mild outfit`() {
        Assertions.assertEquals(MILD_WEATHER, chooseYourOutfit(25))
        Assertions.assertEquals(MILD_WEATHER, chooseYourOutfit(20))
        Assertions.assertEquals(MILD_WEATHER, chooseYourOutfit(15))
    }

    @Test
    fun `temperature below 15 should recommend cold outfit`() {
        Assertions.assertEquals(COLD_WEATHER, chooseYourOutfit(10))
        Assertions.assertEquals(COLD_WEATHER, chooseYourOutfit(0))
        Assertions.assertEquals(COLD_WEATHER, chooseYourOutfit(-5))  // Test negative temp
    }

    @Test
    fun `boundary values should be handled correctly`() {
        // Test the exact boundary conditions
        Assertions.assertEquals(MILD_WEATHER, chooseYourOutfit(25))
        Assertions.assertEquals(MILD_WEATHER, chooseYourOutfit(15))
        Assertions.assertEquals(HOT_WEATHER, chooseYourOutfit(26))
        Assertions.assertEquals(COLD_WEATHER, chooseYourOutfit(14))
    }
}