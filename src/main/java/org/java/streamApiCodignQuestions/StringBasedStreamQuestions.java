package org.java.streamApiCodignQuestions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collector;
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
        collectMapFromList();
        findAllPalindromesString();
        reverseEachStringInList();
        filterAndConvertIntoMap();
        findLongestWordFromSentence();
        groupAlistByItsFirstChar();

    }

    // 1. Count Strings with Specific Prefix
    // Question: Count strings starting with a specific prefix, e.g., “A”.
    public static void countSpecificPrefix() {
        List<String> names = Arrays.asList("Alice", "Bob", "Annie", "Alex", "Charlie", "Adheeraj", "aalo", "Kachalu");
        long result = names.stream().filter(name -> name.startsWith("A")).count();
    }

    // 2. Find First Non-Repeated Character in a String || Question: Find the first
    // non-repeated character in a string.
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

    // 8. Collect Map from List
    public static void collectMapFromList() {
        List<String> words = Arrays.asList("Java", "Stream", "API");
        Map<String, Integer> res = words.stream().collect(Collectors.toMap(word -> word, String::length));
        System.out.println("8:: ===Collect Map from List: " + res);
    }

    // 9. Find all strings that are palindromes in a list. (Good Questions)
    public static void findAllPalindromesString() {
        List<String> words = Arrays.asList("radar", "level", "world", "java");

        List<String> res = words.stream()
                .filter(word -> word.equals(new StringBuilder(word).reverse().toString()))
                .collect(Collectors.toList());
        System.out.println("9:: ===List of All Palindrome string: " + res);
    }

    // 10. Question: Reverse each string in a list. (Good Questions)
    public static void reverseEachStringInList() {
        List<String> words = Arrays.asList("Java", "Stream", "API");
        List<String> res = words.stream()
                .map(word -> new StringBuilder(word).reverse().toString())
                .collect(Collectors.toList());
        System.out.println("10:: ===Reverse Each Words in List: " + res);
    }

    // 11: Question: Given a map, filter entries with values greater than 10 and
    // collect keys into a list.(Good Questions)
    public static void filterAndConvertIntoMap() {
        Map<String, Integer> map = Map.of("A", 5, "B", 15, "C", 10, "D", 20);

        List<String> res = map.entrySet().stream()
                .filter(entry -> entry.getValue() > 10)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
        System.out.println("11:: ===Answer: " + res);

    }

    // 12. Find the Most Frequent Character in a String:: (Good Questions)
    public static void mostFreqCharacterInString() {

        /*
         * NOTE - this questions contains 3 levels of questions -
         * 1: String → characters
         * 2: characters → frequency map
         * 3: frequency map → max frequency wala character
         * 
         * Here is Sudocode Flow------------------
         * → String → IntStream
         * 
         * mapToObj()
         * → int → Character
         * 
         * groupingBy()
         * → Same characters ko group karo
         * 
         * counting()
         * → Har character ki frequency count karo
         * 
         * entrySet()
         * → Map ko key-value entries mein convert karo
         * 
         * comparingByValue()
         * → Frequency (value) compare karo
         * 
         * max()
         * → Highest frequency wali entry
         * 
         * map(getKey)
         * → Entry se character nikalo
         * 
         * orElseThrow()
         * → Optional se actual value nikalo
         */

        String input = "successismine";

        char mostFrequent = input.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()))

                .entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElseThrow();
        System.out.println("12:: mostFrequent in String: " + mostFrequent);
    }

    // 13. Find the Longest Word from a Sentence (Good Questions)
    public static void findLongestWordFromSentence() {
        String sentence = "Java Stream API is very powerful";

        /* SOLUTION ONE */
        String res = Arrays.stream(sentence.split(" "))
                .max(Comparator.comparingInt(String::length))
                .orElse(null);

        /* SOLUTION TWO */
        String longestWord = Arrays.stream(sentence.split(" "))
                .reduce((word1, word2) -> word1.length() > word2.length() ? word1 : word2)
                .orElse(null);

        System.out.println("13:: Logest word: " + res);
    }

    // 14. Question: Group a list of strings by their first character (Good Questions).
    public static void groupAlistByItsFirstChar() {
        List<String> words = Arrays.asList("apple", "banana", "avocado", "blueberry", "cherry");
        // Output: {a=[apple, avocado], b=[banana, blueberry], c=[cherry]}
        Map<Character, List<String>> groupedByFirstChar = words.stream()
                .collect(
                        Collectors.groupingBy(word -> word.charAt(0)));

        System.out.println("14:: GroupedByFirstChar word: " + groupedByFirstChar);

    }

}
