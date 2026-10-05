package org.java.interviewLive.capegimini;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class StreamDemo {

    public static void main(String[] args) {

        findMaxLengthWord();
        removeDuplicateFromStringAndReturnSameOrder();

    }

    public static void findMaxLengthWord() {
        String str = "My name is dheeraj I play nothing";
        String res = Arrays.stream(str.split(" ")).max(Comparator.comparingInt(String::length)).orElse("");
        System.out.println("1: " + res);
    }

    public static void removeDuplicateFromStringAndReturnSameOrder() {
        String str = "dabcadefg"; //o/p = dabcefg;

        //str.chars().distinct().mapToObj(c -> (char) c).forEach(System.out::print);

        str.chars().distinct().mapToObj(c -> String.valueOf((char) c)).collect(Collectors.joining());
    }

}
