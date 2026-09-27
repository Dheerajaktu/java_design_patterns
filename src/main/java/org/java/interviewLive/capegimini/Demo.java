package org.java.interviewLive.capegimini;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Demo {
    public static void main(String[] args) {
        findAllAnagramsInList();
        System.out.println("===checkIfTwoStringAnagram(1);==>>" + checkIfTwoStringAnagram());
        System.out.println("===checkIfTwoStringAnagram2);==>>" + checkIfTwoStringAnagramUsingStreams());
    }

    // Given an array of strings, group all anagrams together.
    public static void findAllAnagramsInList() {
        List<String> words = List.of("eat", "tea", "tan", "ate", "nat", "bat");

        Map<String, List<String>> map = new HashMap<>();

        for (String word : words) {
            char[] chars = word.toCharArray();
            Arrays.sort(chars);

            String key = new String(chars);
            if (map.containsKey(key)) {
                map.get(key).add(word);
            } else {
                List<String> group = new ArrayList<>();
                group.add(word);
                map.put(key, group);
            }
        }

        System.out.println("List of All Anagrams: " + map.values());
    }

    public static List<List<String>> findAllAnagramsInListUsingStreams() {
        List<String> words = List.of("eat", "tea", "tan", "ate", "nat", "bat");

        return new ArrayList<>(
                words.stream().collect(Collectors.groupingBy(word -> word.chars()
                        .mapToObj(c -> (char) c).sorted().map(String::valueOf).collect(Collectors.joining())))
                        .values());

        // return new ArrayList<>(
        // words.stream()
        // .collect(Collectors.groupingBy(
        // word -> word.chars()
        // .mapToObj(c -> (char) c)
        // .sorted()
        // .map(String::valueOf)
        // .collect(Collectors.joining())))
        // .values());

    }

    public static boolean checkIfTwoStringAnagram() {
        String str1 = "listen";
        String str2 = "silent";
        Map<Character, Integer> map = new HashMap<>();
        for (char ch1 : str1.toCharArray()) {
            map.put(ch1, map.getOrDefault(ch1, 0) + 1);
        }
        for (char ch2 : str2.toCharArray()) {
            if (!map.containsKey(ch2))
                return false;
            map.put(ch2, map.get(ch2) - 1);
            if (map.get(ch2) == 0)
                map.remove(ch2);
        }
        return map.isEmpty();
    }

    public static boolean checkIfTwoStringAnagramUsingStreams() {
        String str1 = "listen";
        String str2 = "silent";
        return str1.chars().sorted().boxed().collect(Collectors.toList())
                .equals(str2.chars().sorted().boxed().collect(Collectors.toList()));

    }
}
