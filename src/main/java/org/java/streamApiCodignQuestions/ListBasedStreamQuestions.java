package org.java.streamApiCodignQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ListBasedStreamQuestions {

    public static void main(String[] args) {

        flattenAList();
        findAverageSumOfList();

    }

    // 1. Flatten a List of Lists
    // Question: Given a list of lists, flatten it into a single list
    public static void flattenAList() {
        List<List<Integer>> listOfLists = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5),
                Arrays.asList(6, 7, 8, 9));

        List<Integer> list = listOfLists.stream().flatMap(List::stream).collect(Collectors.toList());
        System.out.println("List of List: " + listOfLists);
        System.out.println("Flatten List: " + list);
    }

    // 2. Calculate Average of Numbers
    // Question: Calculate the average of a list of integers.
    public static void findAverageSumOfList() {
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);
        double result = numbers.stream().mapToInt(Integer::intValue).average().orElse(0);

        System.out.println("Flatten List: " + result);
    }

    // 3. Collect Map from List
    // Question: Convert a list of strings into a map with the string as the key and
    // its length as the value.

}
