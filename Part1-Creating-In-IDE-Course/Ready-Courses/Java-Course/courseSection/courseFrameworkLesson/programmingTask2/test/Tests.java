import org.jetbrains.academy.java.template.Main;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Tests {

  @Test
  public void shouldFindTargetIdInMiddleOfList() {
    List<Integer> bookIds = List.of(101, 205, 320, 450, 550, 700);
    int targetId = 450;

    int result = Main.binarySearchBook(bookIds, targetId);

    assertEquals(3, result); // 450 is at index 3
  }

  @Test
  public void shouldFindTargetIdAtBeginningOfList() {
    List<Integer> bookIds = List.of(101, 205, 320, 450, 550, 700);
    int targetId = 101;

    int result = Main.binarySearchBook(bookIds, targetId);

    assertEquals(0, result); // 101 is at index 0
  }

  @Test
  public void shouldFindTargetIdAtEndOfList() {
    List<Integer> bookIds = List.of(101, 205, 320, 450, 550, 700);
    int targetId = 700;

    int result = Main.binarySearchBook(bookIds, targetId);

    assertEquals(5, result); // 700 is at index 5
  }

  @Test
  public void shouldReturnMinusOneWhenTargetIdDoesNotExist() {
    List<Integer> bookIds = List.of(101, 205, 320, 450, 550, 700);
    int targetId = 999;

    int result = Main.binarySearchBook(bookIds, targetId);

    assertEquals(-1, result); // 999 is not in the list
  }

  @Test
  public void shouldHandleEmptyListAndReturnMinusOne() {
    List<Integer> bookIds = new ArrayList<>();
    int targetId = 123;

    int result = Main.binarySearchBook(bookIds, targetId);

    assertEquals(-1, result); // No elements in the list
  }

  @Test
  public void shouldHandleSingleElementListWhereTargetIsPresent() {
    List<Integer> bookIds = List.of(333);
    int targetId = 333;

    int result = Main.binarySearchBook(bookIds, targetId);

    assertEquals(0, result); // 333 is present at index 0
  }

  @Test
  public void shouldHandleSingleElementListWhereTargetIsAbsent() {
    List<Integer> bookIds = List.of(333);
    int targetId = 444;

    int result = Main.binarySearchBook(bookIds, targetId);

    assertEquals(-1, result); // 444 is not in the list
  }

  @Test
  public void shouldHandleDuplicateElementsAndFindFirstMatch() {
    List<Integer> bookIds = List.of(101, 205, 205, 320, 450, 550, 700);
    int targetId = 205;

    int result = Main.binarySearchBook(bookIds, targetId);

    assertEquals(1, result); // 205 is at index 1
  }

  @Test
  public void shouldHandleLargeListsAndFindCorrectIndex() {
    List<Integer> bookIds = IntStream.rangeClosed(1, 10_000).boxed().collect(Collectors.toList());
    int targetId = 5432;

    int result = Main.binarySearchBook(bookIds, targetId);

    assertEquals(5431, result); // 5432 is at index 5431
  }
}
