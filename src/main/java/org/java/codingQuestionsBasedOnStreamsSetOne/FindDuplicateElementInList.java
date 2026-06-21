package org.java.codingQuestionsBasedOnStreamsSetOne;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class FindDuplicateElementInList {
    //Problem: Identify duplicate numbers from a list.
    //Expected Output: [1, 2, 3, 5, 6]
    // Good Question for Interview perspective

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 2, 4, 5, 1, 6, 32, 5, 2, 5, 2, 5, 2, 3, 6, 2 );

        System.out.println("List==>>"+list);


        List<Integer> duplicates = list.stream()
                .filter(n-> Collections.frequency(list, n) > 1)
                .distinct()
                .collect(Collectors.toList());

        System.out.println("Duplicates==>>"+duplicates);



    }
}
