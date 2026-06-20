package org.java.codingQuestions;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class NonRepeatedCharInString {

    //Problem: Find the first character that does not repeat in a string.
    //Expected Output: 'w'
    // GOOD QUESTION

    public static void main(String[] args) {
        String input = "dheerajs";

        // Make frequency map first

        Map<Character, Long> freq =
                input.chars()
                        .mapToObj(c -> (char)c)
                        .collect(Collectors.groupingBy(
                                Function.identity(),// key will be same as char
                                LinkedHashMap::new, // LinkedHashMap maintain order left to right here
                                Collectors.counting() // value would be counting of each char
                        ));

        // Step 2: first non-repeating finding below

        char res = freq.entrySet()
                .stream()
                .filter(e -> e.getValue() == 1)
                .findFirst().get().getKey();



        System.out.println("result====>>"+ res); // w













    }
}
