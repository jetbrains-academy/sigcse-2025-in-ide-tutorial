import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.jetbrains.academy.java.template.Main.chooseYourOutfit;

public class Tests {
    private static final String HOT_WEATHER = "It's hot! Wear shorts and a t-shirt.";
    private static final String MILD_WEATHER = "It's mild! Wear jeans and a light sweater.";
    private static final String COLD_WEATHER = "It's cold! Wear a jacket and long pants.";

    @Test
    public void temperatureAbove25ShouldRecommendHotOutfit() {
        Assertions.assertEquals(HOT_WEATHER, chooseYourOutfit(30));
        Assertions.assertEquals(HOT_WEATHER, chooseYourOutfit(26));
    }

    @Test
    public void temperatureBetween15And25InclusiveShouldRecommendMildOutfit() {
        Assertions.assertEquals(MILD_WEATHER, chooseYourOutfit(25));
        Assertions.assertEquals(MILD_WEATHER, chooseYourOutfit(20));
        Assertions.assertEquals(MILD_WEATHER, chooseYourOutfit(15));
    }

    @Test
    public void temperatureBelow15ShouldRecommendColdOutfit() {
        Assertions.assertEquals(COLD_WEATHER, chooseYourOutfit(10));
        Assertions.assertEquals(COLD_WEATHER, chooseYourOutfit(0));
        Assertions.assertEquals(COLD_WEATHER, chooseYourOutfit(-5));
    }

    @Test
    public void boundaryValuesShouldBeHandledCorrectly() {
        Assertions.assertEquals(MILD_WEATHER, chooseYourOutfit(25));
        Assertions.assertEquals(MILD_WEATHER, chooseYourOutfit(15));
        Assertions.assertEquals(HOT_WEATHER, chooseYourOutfit(26));
        Assertions.assertEquals(COLD_WEATHER, chooseYourOutfit(14));
    }
}