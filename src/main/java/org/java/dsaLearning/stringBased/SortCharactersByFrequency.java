package org.java.dsaLearning.stringBased;

import java.util.*;

public class SortCharactersByFrequency {
    public static void main(String[] args) {
        String s = "tree";
        String s1 = getSolution(s);
        System.out.println("Solution: " + s1);
    }

    public static String getSolution(String str) {
        Map<Character, Integer> map = new HashMap<>();

        //Making freq map here
        for(char c : str.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        //now converting map to list
        List<Map.Entry<Character, Integer>> list = new ArrayList<>(map.entrySet());

        //doing soring here on the basis of values
        list.sort((a, b) -> b.getValue().compareTo(a.getValue()));

        //Final String here
        StringBuilder sb = new StringBuilder();
        System.out.println("====>>MAP===>>"+ map);
        for(Map.Entry<Character, Integer> entry : list) {
            System.out.println("Loop entry==>>>"+entry +" ==>>>  "+entry.getKey()  +"   ==>"+ entry.getValue());
            for(int i=0; i<entry.getValue(); i++) {
                sb.append(entry.getKey());
            }
        }
        return sb.toString();
    }
}




