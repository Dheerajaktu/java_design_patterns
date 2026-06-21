package org.java.codingQuestionsBasedOnStreamsSetOne;

import java.util.Arrays;
import java.util.List;

public class SumOfAllEvenNumbers {
    //Problem: Calculate sum of even numbers using Streams.
    // Expected Output: 20
    // Good Question for Interview Perspective

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2, 5, 8, 10, 15);

        int sum = list.stream()
                .filter(x -> x % 2 == 0)
                .mapToInt(x -> x)
                .sum();





        System.out.println("Sum==>>"+sum);


    }
}
