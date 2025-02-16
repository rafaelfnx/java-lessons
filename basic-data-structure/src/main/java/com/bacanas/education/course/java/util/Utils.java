package com.bacanas.education.course.java.util;

import java.util.Scanner;

public class Utils {

    private static final Scanner terminalScanner = new Scanner(System.in);

    public static void sleep(int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new RuntimeException(e);
        }
    }

    public static void waitForUserConfirmation() {
        System.out.println("\nPress ENTER to continue");
        terminalScanner.nextLine();
    }

    public static void print(String text) {
        for (int i = 0; i < text.length(); ++i) {
            System.out.print(text.charAt(i));
            try {
                Thread.sleep(25);
            } catch (InterruptedException ignore) {
                Thread.currentThread().interrupt();
            }
        }

        System.out.println();
    }
}
