package org.java.streamApiCodignQuestions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class FindEvenNumbersFromList {

    static List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    static List<Integer> numbersUnsorted = Arrays.asList(
            47, 12, 89, 3, 56, 21, 78, 34, 91, 6,
            80, 1, 94, 42, 66, 83, 50, 99, 75, 100);

    public static void main(String[] args) {
        getEvenNumbers(numbers);
        getMaximumNumber(numbers);
        sortInAscOrder(numbersUnsorted);
        sortedListInAscOrder(numbersUnsorted);
        sumNumbersInAList(numbersUnsorted);
    }

    // 1. Filter Even Numbers from a List
    public static void getEvenNumbers(List<Integer> numbers) {
        List<Integer> result = numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
        System.out.println("Even numbers from the list: " + result);
    }

    // 2. Find Maximum in a List
    public static void getMaximumNumber(List<Integer> num) {
        Integer max = num.stream().max(Integer::compare).orElseThrow(() -> new RuntimeException("List is empty"));
        System.out.println("Maximum number from the list: " + max);
    }

    // 3. Sort a List in Desc Order
    public static void sortInAscOrder(List<Integer> list) {
        List<Integer> sortedList = list.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        System.out.println("List in Desc Order: " + sortedList);
    }

    // 4. Sort a List in Asc Order
    public static void sortedListInAscOrder(List<Integer> list) {
        List<Integer> result = list.stream().sorted().collect(Collectors.toList());
        System.out.println("List in Asc Order: " + result);
    }

    // 5. Sum of Numbers in a List --> Calculate the sum of all numbers in a list.
    public static void sumNumbersInAList(List<Integer> list) {
        int result = list.stream().mapToInt(n -> n.intValue()).sum();
        System.out.println("Sum of All: " + result);
    }

    // 6. Find Duplicate Elements in a List --> Identify duplicate elements in a
    // list.
    public static void findDuplicateElements() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 2, 5, 1);
        HashSet<Integer> set = new HashSet<>();

        List<Integer> duplicate = list.stream().filter(n -> !set.add(n)).collect(Collectors.toList());

        System.out.println("Duplicate Elements: " + duplicate);
    }

}
