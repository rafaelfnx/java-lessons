package com.bacanas.education.course.java.collections.lesson.second;

import java.util.HashMap;

import com.bacanas.education.course.java.util.Utils;

public class OtherDataStructuresLesson {

    public static void main(String[] args) {
        Utils.print("""
                Java has the other data structures interfaces, but they do not directly or indirectly implement the
                Collection interface, they are Map and SortedMap, but for now let's just study Map, which is the most
                popular and commonly used.
                
                The Map interface represents a group of key and value pairs, where each unique key has a value that can
                be accessed with it, similar to the unique indices of the List, but there is no order for the Map's
                keys nor does the type of the keys necessarily need to be numeric. This allows us to relate anything
                to anything. We can see a practical example of this with the most popular implementation of the Map
                interface, the HashMap:
                """
        );

        var map = new HashMap<String, Fruit>();
        map.put("Red", new Fruit("Apple", 5.35));
        map.put("Green", new Fruit("Pear", 7.20));
        map.put("Yellow", new Fruit("Banana", 3.50));

        System.out.println("The red fruit is " + map.get("Red") + ", and the yellow fruit is " + map.get("Yellow"));

        Utils.waitForUserConfirmation();
        Utils.print("""
                In this example, we relate a color to a fruit, so that each color represents a single fruit.
                A problem with this example is that a color can have several fruits, for example, the color green can
                represent a pear, a lemon, a watermelon, an avocado, and so on.
                
                A better use case could be to limit the number of HTTP requests that someone makes to our server, in
                order to prevent DDoS (Distributed Denial-of-Service) attacks, this way, each IP address could make a
                limited number of requests, to save the number of requests that each IP has already made so we can
                decide whether to accept the next one or not, we could use a Map, as in the following example:
                """);

        var requestsByIP = new HashMap<String, Integer>();
        requestsByIP.put("189.6.45.123", 14);
        requestsByIP.put("179.101.78.200", 5);
        requestsByIP.put("201.43.67.150", 10);

        if (requestsByIP.get("189.6.45.123") >= 15) {
            System.out.println("Connection from 189.6.45.123 denied");
        } else {
            System.out.println("Connection from 189.6.45.123 allowed, increasing the requests number now.");
            var newTotalRequests = requestsByIP.get("189.6.45.123") + 1;
            requestsByIP.put("189.6.45.123", newTotalRequests);
        }

        Utils.waitForUserConfirmation();
        Utils.print("""
                The main implementations of the Map interface are HashMap, LinkedHashMap and HashTable.
                The main implementation of the SortedMap is the TreeMap.
                """);
    }
}
