package org.java.dsaLearning.arrayBased;

import java.util.Arrays;

public class MoveZeroDemo {
    public static void main(String[] args) {
        int[] nums = {7,0,3,9,4,0,5,0};
        int []result = solutionOne(nums);
        System.out.println("Result==>>"+Arrays.toString(result));
    }

    public static int[] solutionOne(int []nums){
        int slow = 0;

        for(int fast=0; fast<nums.length; fast++){
            if(nums[fast] != 0){
                if(slow != fast){
                    swap(nums, slow, fast);
                }
                slow++;
            }
        }
        return nums;
    }

    public static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
