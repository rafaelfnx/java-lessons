package com.bacanas.education.course.java.basic.lesson.second;

import com.bacanas.education.course.java.util.Utils;

@SuppressWarnings({ "PointlessBooleanExpression", "ConstantValue", "DataFlowIssue", "WrapperTypeMayBePrimitive" })
public class BasicCodeFlow {

    public static void main(String[] args) {
        Utils.print("""
                In the last lesson, you already saw very well the use of "System.out.printl()", the main method for
                printing things in Java, but now for interactivity purposes, I will use in this code the static methods
                of the Utils class of this project, in the future you will understand what static means, but for now,
                let's focus on in this lesson.
                
                Depending on some conditions, you may want to do one thing or another, for this we have our "if else"
                flow controller. The condition that if else receives to make its decision must be a boolean condition,
                that is, an operation that returns a boolean value, like these:
                
                5 < 7
                20 >= 10
                1 == 1
                true || false
                true && true
                25 >= 25 && 1 != 5
                (50 * 2 == 100 && 4 % 2 == 0) || true
                
                All of the conditions above return true as a boolean value, so any of these would make our if else
                activate the first block of code, and the else block would not be executed. As in the example:
                """);

        if (5 > 3 || true) {
            System.out.println("The if condition is true, so I won't explode.");
        } else {
            System.out.println("The if condition is false, so I'm going to explode now!");
        }

        Utils.waitForUserConfirmation();
        Utils.print("""
                It is important to remember that a boolean expression always returns a boolean value, so this value can
                be stored in a boolean variable, and this variable can be used in an if else later or within another
                boolean condition. Furthermore, an if else block does not necessarily need to have an else, it can just
                have the if to do something if the message is true, and if it is not, nothing happens.
                """);

        int numberLimit = 50;
        boolean firstCondition = 5 < 10;
        boolean secondCondition = !firstCondition;

        if (firstCondition) {
            System.out.println("The first condition is true!");
        }

        if (firstCondition && secondCondition) {
            System.out.println("Both the conditions are true!");
        }

        if (10 > numberLimit || secondCondition) {
            System.out.println("Or 10 is less than \"numberLimit\", or the second condition is true!");
        }

        Utils.waitForUserConfirmation();
        Utils.print("""
                If we want to check several conditions in a mutually exclusive way, that is, only one of the conditions
                can be executed, we can use "if else" with several "else ifs", so that when one is executed, the others
                are not. The number of "else ifs" used is your choice, it can be 1 or several. The use of "else" in a
                structure that already has "else ifs" is optional.
                """);

        if (secondCondition) {
            System.out.println("I would never be executed anyways...");
        } else if (firstCondition) {
            System.out.println("I'm the first and only one who will be executed!");
        } else if (9 < 3 * 3 * 3) {
            System.out.println("I could be executed, but since the top block was executed first, I never will be :(");
        } else {
            System.out.println("I'm optional here, but either way I'll never be executed either.");
        }

        Utils.waitForUserConfirmation();
        Utils.print("""
                Finally, to control our flow we have the "switch". The switch receives a value and contains a series
                of possible cases that will be executed according to the received value. Let's see an example:
                """);

        Integer userInput = 5;

        switch (userInput) {
            case 1 -> System.out.println("The user typed the number 1!");
            case 2 -> System.out.println("The user typed the number 2!");
            case 3, 4 -> System.out.println("The user typed the number 3 or 4!");
            case 5, 6, 7 -> System.out.println("The user typed the number 5, 6 or 7!");
            case null -> System.out.println("I guess the user didn't type any numbers after all.");
            default -> System.out.println("The user typed an invalid number!");
        }

        Utils.waitForUserConfirmation();
        Utils.print("""
               We can use the switch with numbers, characters, strings, or enum objects, which we will learn about in
               the future.
               """);

        String name = "Alex";

        switch (name) {
            case "Alex" -> System.out.println("You have a beautiful name!");
            case "James" -> System.out.println("You have a classical name!");
            case "Emma Watson" -> System.out.println("Your name reminds me of a famous actress...");
            default -> System.out.println("I don't think anything about your name.");
        }
    }
}
