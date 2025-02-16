package com.bacanas.education.course.java.basic.lesson.first;

@SuppressWarnings({ "unused", "UnusedAssignment" })
public class BasicJavaLesson {

    public static void main(String[] args) {
        System.out.println(
                "Imagine that the objects (classes) are the citizens of the Java kingdom, the citizens have");
        System.out.println(
                "characteristics,such as name, hair color, weight, height, among others (properties), these citizens");
        System.out.println(
                "are always carrying out actions (methods) that impact the kingdom, always generating new results.");

        System.out.println(
                "For example, our jester is called Peter, he is 25 years old and 1.80 tall, his main actions in the");
        System.out.println(
                "kingdom are telling jokes, riding a unicycle, and doing an imitation, as we can see:");

        Jester peter = new Jester("Peter", 25, 1.80);
        peter.tellAJoke();
        peter.driveAnUnicycle();
        peter.doAnImitation("King");

        System.out.println(
                "As we can see, methods can receive parameters, such as the \"doAnImitation\" method received the ");
        System.out.println("name of the imitation target as a parameter.");
        System.out.println(
                "But, oh no, the king didn't like the imitation at all and ordered the jester to be killed!");

        King king = new King();
        king.killTheJester(peter);

        System.out.println("It's a shame the jester died.\n");
        System.out.println(
                "But as we can see, methods, in addition to performing actions and receiving methods, can also return");
        System.out.println(
                "values, as we saw the \"getName\" and \"getAge\" methods returning the Jester's name and age");
        System.out.println("respectively.\n And speaking of values, let's look at some types of values: ");

        boolean booleanVar = true;                     // This type of value occupies 1 bit in memory.

        short smallNumber = 5;                         // This type of value occupies 16 bits in memory;
        int number = 55656;                            // This type of value occupies 32 bits in memory;
        long bigNumber = 964564584584568L;             // This type of value occupies 64 bits in memory;
        float decimalNumber = 5.36f;                   // This type of value occupies 32 bits in memory;
        double bigDecimalNumber = 958241.54841;        // This type of value occupies 64 bits in memory;

        char character = 'a';                          // This type of value occupies 16 bits in memory;

        byte byteVar = 0xf;                            // This type of value occupies 8 bits in memory;

        System.out.println(
                "All these types of values shown are \"primitive\", that is, they are not citizens of the Java");
        System.out.println(
                "kingdom, so they cannot possess other properties and perform actions, they are just the most basic");
        System.out.println(
                "types of information and nothing more.\nAs we have seen so far, citizens can be created using the");
        System.out.println(
                "word \"new\" and while primitives have their values are provided directly. But there is a special");
        System.out.println(
                "type of citizen in the Java kingdom, it does not need the word \"new\" to be created, but only");
        System.out.println("double quotes. This citizen is String, see an example of him in action:");

        var string = "hello!";
        string = string.toUpperCase();
        string += "\n";
        string = string.repeat(5);

        System.out.println(string);

        System.out.println(
                "As we can see we don't use the word \"new\", but we can still make it perform actions by invoking");
        System.out.println(
                "its methods. Since anything enclosed in double quotes is already a citizen of the String type, we");
        System.out.println("can invoke the methods directly after the double quotes, as in the example:");

        System.out.println("Test!".repeat(10));

        System.out.println(
                "One of the main differences between primitive types and citizens of the Java kingdom (objects), is");
        System.out.println(
                "that when passed as parameters, primitive types are passed as simple values, while objects are");
        System.out.println("passed by memory references.");

        int primitiveNumber = 5;
        ObjectNumber citizenNumberOfJavaRealm = new ObjectNumber(5);

        System.out.println(
                "Starting with primitiveNumber = " + primitiveNumber
                + " and the citizenNumberOfJavaRealm = " + citizenNumberOfJavaRealm);

        testPrimitiveNumber(primitiveNumber);
        testObjectNumber(citizenNumberOfJavaRealm);

        System.out.println(
                "Final result after calling methods to change the value for the primitiveNumber = " + primitiveNumber
                + " and for the citizenNumberOfJavaRealm = " + citizenNumberOfJavaRealm);

        System.out.println(
                "As we can see, the value of \"primitiveNumber\" remained the same, because even though the method");
        System.out.println(
                "changed its value, all that reached it was a copy of the value of \"primitiveNumber\", as a local");
        System.out.println(
                "primitive variable it remains the same with its original value, and it can only really be changed");
        System.out.println(
                "within its current scope, since in this case we would be changing the original variable and its");
        System.out.println(
                "value, and not a copy. The \"citizenNumberOfJavaRealm\" on the other hand, had its value reflected");
        System.out.println(
                "here by the change that the method made, this is because what arrived at the method was the memory");
        System.out.println(
                "address of the object, and anyone with that address can change the original object and its original");
        System.out.println(
                "values, so when we pass objects \"by reference\", if one place changes that object, it will end up");
        System.out.println("being reflected in all places that use that same object.");
    }

    public static void testPrimitiveNumber(int number) {
        number += 10;
    }

    public static void testObjectNumber(ObjectNumber number) {
        number.setNumber(10);
        number.addOne();
    }
}
