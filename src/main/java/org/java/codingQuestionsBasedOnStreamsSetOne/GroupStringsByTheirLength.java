package org.java.codingQuestionsBasedOnStreamsSetOne;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupStringsByTheirLength {

    // Problem: Group strings based on their length.
    //Expected Output: { 2 = ["js", "go"], 4 = ["java"], 5 = ["react"], 6 = ["spring"] }
    // Good Question for Interview perspective

    public static void main(String[] args) {
        List<String> words = new ArrayList<>();

        words.add("java");
        words.add("spring");
        words.add("js");
        words.add("react");
        words.add("go");
        words.add("javascript");
        words.add("css");
        words.add("docker");
        words.add("python");


        System.out.println("Words==>>"+words);
        // WE need to store result in a Map maintain expected result in format of key and value
        Map<Integer, List<String>> result = words.stream().collect(Collectors.groupingBy(String::length));

        System.out.println("=Result=>>"+result);



    }
}
