package com.bacanas.education.course.java.collections.lesson.first;

import java.util.Iterator;

/**
 * Class created to represent an iterator that's iterate over any group of integers.
 */
class NumbersIterator implements Iterator<Integer> {

    private final int[] numbers;

    private int counter;

    NumbersIterator(int[] numbers) {
        this.numbers = numbers;
    }

    @Override
    public boolean hasNext() {
        return counter < numbers.length;
    }

    @Override
    public Integer next() {
        return numbers[counter++];
    }
}
