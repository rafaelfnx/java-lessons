package com.bacanas.education.course.java.basic.exercise;

import java.util.Scanner;

@SuppressWarnings("unused")
public class MathOperations {

    public static void main(String[] args) {
        // We are going to create a basic calculator using the Scanner class to obtain user input, you must create
        // 4 methods, one to add, subtract, multiply and divide the values, always returning the Result object
        // containing the result, and correct the code so that Michael always receives his result added to 1, but
        // without changing the value we print for the user. It is important to remember that you can only change
        // the code in this class and in the specified areas, to carry out your exercise.

        Scanner scanner = new Scanner(System.in);
        Result result = new Result();
        int firstNumber = 0, secondNumber = 0;

        // Make the user select the desired mathematical operation and collect the value of the "firstNumber" and of
        // the "secondNumber" to use in the calculation of your created methods, use the result to change the value of
        // the Result object, and fix the error when sending the value to Michael in the "sendResultToMichael" method,
        // so that when sending the value to the "printResult" method, the printed result is correct.

        // implements your logic here.

        sendResultToMichael(result);
        printResult(result);
    }

    public static void add(int firstNumber, int secondNumber, Result result) {
        // implements your logic here.
    }

    public static void subtract(int firstNumber, int secondNumber, Result result) {
        // implements your logic here.
    }

    public static void multiply(int firstNumber, int secondNumber, Result result) {
        // implements your logic here.
    }

    public static void divide(int firstNumber, int secondNumber, Result result) {
        // implements your logic here.
    }

    public static void sendResultToMichael(Result result) {
        result.setResult(result.getResult() + 1);
        Michael.receiveValue(result.getResult());
    }

    public static void printResult(Result result) {
        System.out.println("The result is: " + result.getResult());
    }
}
