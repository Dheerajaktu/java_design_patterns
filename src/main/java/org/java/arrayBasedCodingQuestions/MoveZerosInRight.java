package org.java.arrayBasedCodingQuestions;

import java.util.Arrays;

public class MoveZerosInRight {


    public static void main(String[] args) {
      int nums[] = {0, 1, 0, 3, 12};

        solution(nums);

        for(int num: nums){
            System.out.println(num+" ");
        }

    }



    public static void solution(int[] nums) {

        int len = nums.length;

        int j = 0;

        for(int i=0; i<len; i++){

            if(nums[i] !=0){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }


        }

    }
}
