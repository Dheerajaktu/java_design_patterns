package org.java.dsaLearning.arrayBased;

import java.util.Arrays;
import java.util.HashMap;

public class RemoveDuplicateDemo {
    public static void main(String[] args) {
        int[] nums = {7, 0, 3, 9, 4, 0, 5, 0, 7, 4, 3, 5, 2, 10, 14, 4, 0};
        int [] result = getSolution(nums);
        System.out.println("Result 2-->>"+ Arrays.toString(result));
    }
    /* SOLUTION 1 - Using HashMap */
    public static int[] getSolution(int[] nums){
        int len =  nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<len;i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i],i);// MAP --> (value, index)
            }
        }
        //create new array
        int nums1[]= new int[map.size()];
        int index = 0;
        for(int i=0;i<len;i++){
            if(map.containsKey(nums[i])){
                nums1[index++] = map.get(nums[i]);
                map.remove(nums[i]);
            }
        }
        return nums1;
    }
}
