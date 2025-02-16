package com.bacanas.education.course.java.collections.lesson.first;

import java.util.Iterator;

/**
 * Class created to represent an iterable group of integers.
 */
public class IterableNumbersGroup implements Iterable<Integer> {

    /**
     * Here is the group of numbers this object is storing.
     */
    private int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

    /**
     * Implementing the main method of the Iterable interface, this method
     * returns the iterator that will traverse our group of numbers.
     */
    @Override
    public Iterator<Integer> iterator() {
        return new NumbersIterator(numbers);
    }
}
