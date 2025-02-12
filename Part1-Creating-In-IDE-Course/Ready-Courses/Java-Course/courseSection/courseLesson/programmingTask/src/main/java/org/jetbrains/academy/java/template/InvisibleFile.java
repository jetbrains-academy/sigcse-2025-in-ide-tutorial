package org.jetbrains.academy.java.template;

// This file will be hidden in the student mode
public class InvisibleFile {
    // This file will be hidden in the student mode
    public static int safeUserInput() {
        String temperature;
        String errorMessage = "The temperature should be in range [-40; 40]";
        do {
            System.out.println("Please input temperature. " + errorMessage);
            temperature = safeReadLine();
        } while (!isCorrectInput(temperature));
        return Integer.parseInt(temperature);
    }

    public static boolean isCorrectInput(String temperature) {
        int intTemp;
        try {
            intTemp = Integer.parseInt(temperature);
        } catch (NumberFormatException e) {
            return false;
        }
        return intTemp > -40 && intTemp < 40;
    }

    public static String safeReadLine() {
        String input;
        try {
            input = System.console().readLine();
        } catch (Exception e) {
            input = null;
        }
        if (input == null) {
            throw new IllegalStateException("Your input is incorrect, sorry. Please, input a number.");
        }
        return input;
    }

}