package org.java.dsaLearning.arrayBased;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class TopKFreqElements {
    public static void main(String[] args) {
        int []nums = {1,2,1,2,1,2,3,1,3,2};
        int []res = topKFrequent(nums, 2);
        System.out.println(Arrays.toString(res));
    }
    public static int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        //Making frequency HashMap here
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
//        System.out.println("check map: " + map);
        //creating priority queue here, by default PriorityQueue has min heap so that's why we need to define explicitly in constructor
        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>((a, b)
                -> b.getValue() - a.getValue());

        // Adding map data into Priority Queue
        pq.addAll(map.entrySet());

        // Now picking up top kth element here
        int[] result = new int[k];

        // Assigning final data into result array
        for(int i = 0; i<k; i++) result[i] = pq.poll().getKey();

        return result;

    }
}
