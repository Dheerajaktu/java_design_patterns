package org.java.arrayBasedCodingQuestions;

import java.util.Arrays;

public class TwoSumProblemWithBruteForce {

    public static void main(String[] args) {
        int nums[] = {2,7,9,11,15,18};
        int target = 9;
        System.out.println(Arrays.toString(TwoSumProblemWithBruteForce1.getTwoSum(nums,target)));;
    }
}

class TwoSumProblemWithBruteForce1{
        public static int[] getTwoSum(int[] nums, int target) {
            int len = nums.length;

            for(int i=0;i<len;i++){
                for(int j=i+1;j<len;j++){
                    if(nums[i]+nums[j]==target){
                        return new int[]{nums[i],nums[j]};
                    }
                }
            }
            return new int[]{};
        }
}