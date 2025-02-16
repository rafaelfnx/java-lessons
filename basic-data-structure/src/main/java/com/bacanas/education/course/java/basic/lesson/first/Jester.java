package com.bacanas.education.course.java.basic.lesson.first;

@SuppressWarnings({ "LombokGetterMayBeUsed", "FieldCanBeLocal", "unused", "FieldMayBeFinal" })
public class Jester {

    private String name;

    private int age;

    private double height;

    public Jester(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public void tellAJoke() {
        System.out.println("Why did the chicken cross the road?\n\n" +
                           "To get to the other side! \uD83D\uDE02");
    }

    public void driveAnUnicycle() {
        System.out.println("See me driving my unicycle!");
    }

    public void doAnImitation(String target) {
        System.out.println("Now the jester is imitating the " + target);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
