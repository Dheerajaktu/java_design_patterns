package org.java.dsaLearning.arrayBased;

public class FindMaxSubArraySumDemo {
    public static void main(String[] args) {
        int nums[] = {-2,1,-3,4,-1,2,1,-5,4};
        int result = solution(nums);
        System.out.println("result: "+result);
    }
    /*
     * Finds the maximum sum of a contiguous subarray
     * using Kadane's Algorithm.
     *
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     */
    public static int solution(int[] nums){
        int currentSum = 0;
        int maxSum = nums[0];
        for(int i=0;i<nums.length;i++){
            currentSum += nums[i];
            if(currentSum > maxSum) maxSum = currentSum;
            if(currentSum < 0) currentSum = 0;
        }
        return maxSum;
    }
}
