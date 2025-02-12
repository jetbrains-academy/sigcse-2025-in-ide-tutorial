import org.jetbrains.academy.java.template.Main;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

public class Tests {

    @Test
    public void shouldGenerateListSizeBetween5And20() {
        for (int i = 0; i < 10; i++) { // Run multiple times to ensure consistency
            List<Integer> bookIds = Main.generateBookIds();
            assertTrue(
                    bookIds.size() >= 5 && bookIds.size() <= 20,
                    "List size " + bookIds.size() + " is out of the expected range (5 to 20)"
            );
        }
    }

    @Test
    public void shouldGenerateUniqueIDsInTheList() {
        for (int i = 0; i < 10; i++) { // Run multiple times to ensure IDs are unique
            List<Integer> bookIds = Main.generateBookIds();
            Set<Integer> uniqueIds = new HashSet<>(bookIds); // Converting to a set removes duplicates
            assertEquals(
                    bookIds.size(),
                    uniqueIds.size(),
                    "The list contains duplicate IDs!"
            );
        }
    }

    @Test
    public void shouldGenerateIDsWithinTheRange0To500() {
        for (int i = 0; i < 10; i++) { // Run multiple times to ensure correctness
            List<Integer> bookIds = Main.generateBookIds();
            assertTrue(
                    bookIds.stream().allMatch(id -> id >= 0 && id <= 500),
                    "List contains IDs outside the range 0 to 500"
            );
        }
    }

    @Test
    public void shouldGenerateDifferentResultsOnRepeatedCalls() {
        List<Integer> result1 = Main.generateBookIds();
        List<Integer> result2 = Main.generateBookIds();
        // Test if randomly generated lists are different
        assertNotEquals(
                result1,
                result2,
                "The function did not generate different results on repeated calls"
        );
    }
}
