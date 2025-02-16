package com.bacanas.education.course.java.collections.lesson.first;

import java.util.*;

import com.bacanas.education.course.java.util.Utils;

@SuppressWarnings("WhileLoopReplaceableByForEach")
public class BasicCollectionsLesson {

    public static void main(String[] args) {
        Utils.print("""
                Java has the Collections Framework, which is part of the Java standard library.
                Its very powerful since it has the main data structures taught in higher education computing courses.
                Let's cover its structure, all starts with the Iterable interface, which serves to symbolize
                a group of traversable elements, as we will see in the following example:
                """
        );

        var iterableGroup = new IterableNumbersGroup();
        var numbersIterator = iterableGroup.iterator();

        while (numbersIterator.hasNext()) {
            System.out.println("Numbers iterator next number: " + numbersIterator.next());
        }

        Utils.waitForUserConfirmation();
        Utils.print("""
                As we can see, objects that implement the iterable interface need to be able to return
                an iterator that will traverse the elements in their group. The iterator object needs to implements
                the Iterator interface, that has two main methods, the hasNext() to check if the group has any
                item left, and the next() to get the next item of the group.
                
                Now, we see the Collection interface. This interface represents the basis of the Collections Framework,
                its has some basics methods, as the isEmpty() to check if the groupo is empty, or the size() to get
                the current size of the group we are exploring.
                
                From the collection interface we have 3 main interfaces that extend it, namely List, Queue and Set.
                The List interface represents objects that organizes its items into ordered indexes, with each item
                having its own unique index, thus allowing random access of items, as in the following example:
                """
        );

        var list = List.of(500, 1000, 1500, 2000, 2500, 3000);
        System.out.println("Accessing a random item by its index, for index 5 we have: " + list.get(5));

        Utils.waitForUserConfirmation();
        Utils.print("""
                The main implementations of the List interface are ArrayList and LinkedList.
                
                The Queue interface, represents mainly objects that store items in FIFO sequence (First In, First Out).
                Since to scroll through its elements, after inserting them we must remove them, due to its nature where
                it does not store items with an index as in the list, we can only take the first or last item from it,
                as we can see in the following example made with ArrayDeque implementation of the Queue interface:
                """
        );

        var queue = new ArrayDeque<Integer>();
        queue.add(2000);
        queue.add(500);
        queue.add(1500);
        queue.add(3000);
        queue.add(1000);
        queue.add(2500);

        while (!queue.isEmpty()) {
            System.out.println("Queue next number: " + queue.poll());
        }

        Utils.waitForUserConfirmation();
        Utils.print("""
                The Queue implementations are made to efficiently remove elements, while the List implementations may
                spend more processing time to do this.
                
                Let's see the PriorityQueue implementation of the Queue interface, in this implementation the FIFO
                ordering method is not used, instead, the items with most priority comes out first. In the Java
                implementation of the PriorityQueue, the priority is inversely proportional to the value of the item, so
                for a queue of integers, the smallest number comes out first, as we can see in the following example:
                """
        );

        var priorityQueue = new PriorityQueue<Integer>();
        priorityQueue.add(2000);
        priorityQueue.add(500);
        priorityQueue.add(1500);
        priorityQueue.add(3000);
        priorityQueue.add(1000);
        priorityQueue.add(2500);

        while (!priorityQueue.isEmpty()) {
            System.out.println("PriorityQueue next number: " + priorityQueue.poll());
        }

        Utils.waitForUserConfirmation();
        Utils.print("""
                We can see that this queue implementation has a built-in internal sorting algorithm, which can save
                us work when we need to organize items from a group.
                
                The main implementations of the Queue interface are ArrayDeque and PriorityQueue.
                
                Now let's see a little more about the Set interface, it represents a group of elements in which copies
                are not allowed, and each unique item can only be included once, as we can see in the following example:
                """
        );

        @SuppressWarnings("OverwrittenKey")
        var set = Set.of(500, 500, 500, 1000, 1000, 1500, 2000, 2000, 2500, 2500, 2500);

        for (var item : set) {
            System.out.println(item);
        }

        Utils.waitForUserConfirmation();
        Utils.print("""
                This can be useful when we want to filter repeated elements, such as unique users in a listing, for
                example, or with the random numbers generated in the following example with the HashSet implementation
                of the Set interface:
                """
        );

        var randomGenerator = new Random();
        var setOfRandomNumbers = new HashSet<Integer>();
        for (int i = 0; i < 1000; ++i) {
            setOfRandomNumbers.add(randomGenerator.nextInt(5));
        }

        for (var randomNumber : setOfRandomNumbers) {
            System.out.println(randomNumber);
        }

        Utils.waitForUserConfirmation();
        Utils.print("""
                In this example, we added a total of 1000 items to the HashSet object, but its size is a maximum of 5
                items. This happens because we configured the random number generator to generate numbers from 0 to 5,
                being a non-exclusive range, the numbers generated will always be one of these: 0, 1, 2, 3 and 4, as the
                objective of objects that implement the Set interface is not to have copies of items, there are always
                only 5 possible unique items to be included in this group.
                
                The main implementations of the Set interface are HashSet, LinkedHashSet and TreeSet.
                """
        );
    }
}
