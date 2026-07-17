package org.java.dsaLearning.arrayBased;

import java.sql.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSumDemo {

    public static void main(String[] args) {
        int nums[]  = {2,9,11,15,3,7,0};
        int target = 10;
        //output --> [4,5]
        int result[] = twoSumSolution(nums, target);
        System.out.println("Result 1-->>"+ Arrays.toString(result));

        int[] nums2 = {2,5,6,8,9,10,11,12,14};
        int target2 = 23;

        int []result1 = twoSumSolution2(nums2, target2);
        System.out.println("Result 2-->>"+ Arrays.toString(result1));
    }


    /*
    * SOLUTION 1 - Using Optimised (incase Array is not sorted)
    * */
    public static int[] twoSumSolution(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<nums.length;i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) return new int[]{map.get(complement), i};
            map.put(nums[i], i);
        }
        return new int[]{};
    }

    /*
     * SOLUTION 2 - Using Two Pointer Approach (incase Array is sorted)
     * */
    public static int[] twoSumSolution2(int[] nums, int target){
        int len = nums.length;

        int left = 0;
        int right = len-1;

        while(left < right){
            int sum = nums[left] +  nums[right];
            if(sum == target){
                return new int[]{left,right};
            }
            if(sum > target){
                right--;
            }
            if(sum < target){
                left++;
            }
        }
        return new int[]{};
    }
}



