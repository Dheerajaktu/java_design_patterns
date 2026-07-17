package org.java.dsaLearning.stringBased;

import java.util.HashMap;

public class CheckValidAnagramDemo {
    public static void main(String[] args) {
        String str = "silent";
        String str2 = "listen";
        boolean result = isAnagram(str, str2);
        System.out.println("===>> "+result);
    }
    public static boolean isAnagram(String s1, String s2){
        HashMap<Character, Integer> map = new HashMap<>();
        for(char c: s1.toCharArray()){
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for(char c1: s2.toCharArray()){
            if (!map.containsKey(c1)) return false;
            map.put(c1, map.get(c1) - 1);
            if(map.get(c1) == 0) map.remove(c1);
        }
        return map.isEmpty();
    }
}
