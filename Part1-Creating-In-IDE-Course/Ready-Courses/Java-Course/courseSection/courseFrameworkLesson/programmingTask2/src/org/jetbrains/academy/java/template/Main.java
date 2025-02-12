package org.jetbrains.academy.java.template;


import java.util.*;

public class Main {

    public static int binarySearchBook(List<Integer> bookIds, int targetId) {
        int left = 0;
        int right = bookIds.size() - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2; // Calculate the middle index to avoid overflow

            if (bookIds.get(mid) == targetId) {
                return mid; // Found the target, return the index
            } else if (bookIds.get(mid) < targetId) {
                left = mid + 1; // Move to the right half
            } else {
                right = mid - 1; // Move to the left half
            }
        }

        return -1; // Target not found
    }


    public static List<Integer> generateBookIds() {
        // Generate a random size for the list, between 5 and 20
        Random random = new Random();
        // Generate number between 5 (inclusive) and 20 (inclusive)
        int numberOfBooks = 5 + random.nextInt(16);

        // Generate a set of random unique book IDs between 0 and 500
        Set<Integer> bookIds = new HashSet<>();
        while (bookIds.size() < numberOfBooks) {
            bookIds.add(random.nextInt(501)); // Generate number between 0 and 500 (inclusive)
        }

        // Convert the set to a list and return
        return new ArrayList<>(bookIds);
    }

    public static void main(String[] args) {
        List<Integer> libraryBooks = generateBookIds();
        Collections.sort(libraryBooks);
        System.out.println("Books in the library: " + libraryBooks);

        int bookToFind1 = 320;
        int bookToFind2 = 999;

        int result1 = binarySearchBook(libraryBooks, bookToFind1);
        int result2 = binarySearchBook(libraryBooks, bookToFind2);

        if (result1 != -1) {
            System.out.println("Book with ID " + bookToFind1 + " found at index " + result1 + "!");
        } else {
            System.out.println("Book with ID " + bookToFind1 + " not found!");
        }

        if (result2 != -1) {
            System.out.println("Book with ID " + bookToFind2 + " found at index " + result2 + "!");
        } else {
            System.out.println("Book with ID " + bookToFind2 + " not found!");
        }
    }
}
