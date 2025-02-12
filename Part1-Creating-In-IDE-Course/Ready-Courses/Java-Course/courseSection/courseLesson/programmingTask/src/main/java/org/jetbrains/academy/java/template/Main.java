package org.jetbrains.academy.java.template;

import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

import static org.jetbrains.academy.java.template.InvisibleFile.safeUserInput;

public class Main {
    public static String chooseYourOutfit(int temperature) {
        if (temperature > 25) {
            return "It's hot! Wear shorts and a t-shirt.";
        } else if (temperature >= 15) {
            return "It's mild! Wear jeans and a light sweater.";
        } else {
            return "It's cold! Wear a jacket and long pants.";
        }
    }

    public static void main(String[] args) {
        System.out.println(chooseYourOutfit(safeUserInput()));
    }
}

