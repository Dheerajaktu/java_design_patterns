package org.java.dsaLearning.stringBased;

import java.util.*;

public class GroupOfAnagrams {
    public static void main(String[] args) {
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        List<List<String>>  result = groupAnagrams(strs);
        System.out.println(result);

    }

    public static List<List<String>>  groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (String str : strs) {
            char[] ch = str.toCharArray();
            Arrays.sort(ch);
            String key = new String(ch);
            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(str);

        }
        return new ArrayList<>(map.values());
    }
}
