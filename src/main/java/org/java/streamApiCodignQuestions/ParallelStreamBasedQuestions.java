package org.java.streamApiCodignQuestions;

import java.util.Arrays;
import java.util.List;

public class ParallelStreamBasedQuestions {

    public static void main(String[] args) {
        computeSum();

    }

    // 1. Parallel Stream to Compute Sum (Use parallel streams to compute the sum of
    // numbers.)
    public static void computeSum() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        int result = numbers.parallelStream().mapToInt(Integer::intValue).sum();

        System.out.println("PARALLEL STREAM:: sum of list: " + result);

    }

}
