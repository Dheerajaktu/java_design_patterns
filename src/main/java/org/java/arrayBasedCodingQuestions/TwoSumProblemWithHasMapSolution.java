package org.java.arrayBasedCodingQuestions;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSumProblemWithHasMapSolution {
    public static void main(String[] args) {
        int nums[] = {2,7,9,11,15,18};
        int target = 9;
        System.out.println(Arrays.toString(TwoSumProblemWithBruteForce2.getTwoSum(nums,target)));;
    }
}


class TwoSumProblemWithBruteForce2{

    public static int[] getTwoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0; i<nums.length;i++){
            int currentNum = target - nums[i];
            if(map.containsKey(currentNum)){
               // return new int[] {map.get(currentNum),i};// returning indexes
                // If need values then
                return new int[] {nums[map.get(currentNum)], nums[i]};
            }
            map.put(nums[i],i);// (val: key)
        }
        return new int[] {};
    }

}