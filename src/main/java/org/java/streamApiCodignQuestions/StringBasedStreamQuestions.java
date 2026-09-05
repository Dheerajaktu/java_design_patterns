package org.java.streamApiCodignQuestions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

public class StringBasedStreamQuestions {

    public static void main(String[] args) {

        countSpecificPrefix();
        findFirstNonRepeatedCharacter();
        convertStringIntoUpperCase();
        concatinateString();
        findLongestString();
        countFreqEachChar();
        removeNullValuesFromList();

    }

    // 1. Count Strings with Specific Prefix
    // Question: Count strings starting with a specific prefix, e.g., “A”.
    public static void countSpecificPrefix() {
        List<String> names = Arrays.asList("Alice", "Bob", "Annie", "Alex", "Charlie", "Adheeraj", "aalo", "Kachalu");
        long result = names.stream().filter(name -> name.startsWith("A")).count();
    }

    // 2. Find First Non-Repeated Character in a String
    // Question: Find the first non-repeated character in a string.
    public static void findFirstNonRepeatedCharacter() {
        String input = "swissbank";

        Optional<Character> firstNonRepeated = input.chars()
                .mapToObj(c -> (char) c)
                .filter(c -> input.indexOf(c) == input.lastIndexOf(c))
                .findFirst();
    }

    // 3. Convert List of Strings to Uppercase
    // Question: Convert all strings in a list to uppercase
    public static void convertStringIntoUpperCase() {
        List<String> names = Arrays.asList("Alice", "Bob", "Annie", "Alex", "Charlie", "Adheeraj", "aalo", "Kachalu");
        List<String> result = names.stream()
                .map(String::toLowerCase)
                .collect(Collectors.toList());
        System.out.println("===result>>" + result);

    }

    // 4. Concatenate Strings
    // Question: Concatenate all strings in a list into a single string.
    public static void concatinateString() {
        List<String> words = Arrays.asList("Stream", "API", "is", "powerful", "in", "Java8", "onwards");
        String result = words.stream()
                .reduce("", (s1, s2) -> s1 + " " + s2).trim();
        System.out.println("Concatinate Strings result: " + result);
    }

    // 5. Find the Longest String
    public static void findLongestString() {
        List<String> words = Arrays.asList("Java", "Stream", "API", "Development", "Chatgpt", "Astra", "launched");
        String result = words.stream()
                .reduce((s1, s2) -> s1.length() > s2.length() ? s1 : s2).orElse(null);
        System.out.println("Logest Strings result: " + result);
    }

    // 6. Count Frequency of Characters in a String (IMP)
    public static void countFreqEachChar() {
        String input = "aeganpatchaldarula";

        Map<Character, Long> freq = input.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));
        System.out.println("===Freq Map: " + freq);

    }

    // 7. Remove Null Values from list
    public static void removeNullValuesFromList() {
        List<String> words = Arrays.asList("Java", null, "Stream", null, "API");
        List<String> result = words.stream().filter(Objects::nonNull).collect(Collectors.toList());

        System.out.println("7:: ===Removed Null Values from List: " + result);

    }

}
