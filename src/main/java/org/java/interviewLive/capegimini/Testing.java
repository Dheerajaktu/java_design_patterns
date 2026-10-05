package org.java.interviewLive.capegimini;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

// String s = "Dheeraj"

//  remove duplicated vowels

// o/p: Dhraj

public class Testing {
    public static void main(String[] args) {
        String res = solution();
        System.out.println("==RES: " + res);
    }

    public static String solution() {
        String str = "Dheeraj";

        HashMap<Character, Integer> map = new HashMap<>();
        Set<Character> set = Set.of('a', 'e', 'i', 'o', 'u');// O(1)

        // create freq map
        for (char ch : str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1); // O(n)
        }

        StringBuilder res = new StringBuilder(); //// O(1)
        for (char ch1 : str.toCharArray()) { //// O(n)
            int val = map.get(ch1);
            if(set.contains(ch1)){
                if(val == 1){
                   res.append(ch1);
                }
            }else{
                res.append(ch1);
            }
        }
        return res.toString();
    }
}
