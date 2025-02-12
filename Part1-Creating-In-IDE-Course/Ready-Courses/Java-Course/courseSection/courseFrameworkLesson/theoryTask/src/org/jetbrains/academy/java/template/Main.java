package org.jetbrains.academy.java.template;

import java.util.*;

public class Main {

    public static int binarySearchBook(List<Integer> bookIds, int targetId) {
        // TODO: Your implementation here
        return -1; // Placeholder return value
    }

    public static List<Integer> generateBookIds() {
        // TODO: Your implementation here
        return null; // Placeholder return value
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
