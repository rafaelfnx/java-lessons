package com.bacanas.education.course.java.collections.lesson.second;

public class Fruit {

    private final String name;

    private final double price;

    public Fruit(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Fruit(" +
               "name='" + name + '\'' +
               ", price=" + price +
               ')';
    }
}
