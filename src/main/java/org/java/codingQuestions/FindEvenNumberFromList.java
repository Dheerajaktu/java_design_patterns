package org.java.codingQuestions;

import java.util.List;
import java.util.stream.Collectors;

public class FindEvenNumberFromList {

    //You are given a list of integers. Filter out only even numbers using Java 8 Streams.
    //List<Integer> numbers = [10, 15, 20, 33, 42, 55, 60]
    // Expected O/P = [10, 20, 42, 60]

    public static void main(String[] args) {

        List<Integer> numbers = List.of(10, 15, 20, 33, 42, 55, 60);
        System.out.println("L1=="+ numbers);

        List<Integer> res =  numbers.stream().filter(n -> n%2 == 0).collect(Collectors.toList());

        System.out.println("L2=="+ res);

    }





}
