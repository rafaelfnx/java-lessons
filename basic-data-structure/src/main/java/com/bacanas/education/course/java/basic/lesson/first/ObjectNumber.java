package com.bacanas.education.course.java.basic.lesson.first;

@SuppressWarnings({ "unused", "LombokSetterMayBeUsed" })
public class ObjectNumber {

    private int number;

    public ObjectNumber(int number) {
        this.number = number;
    }

    public void addOne() {
        number += 1;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
