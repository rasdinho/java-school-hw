// Given an array of integers, find the contiguous subarray (containing at least one number)
//  which has the largest sum and return its sum.

// Example:

// Input: [-2,1,-3,4,-1,2,1,-5,4],
// Output: 6
// Explanation: The subarray [4,-1,2,1] has the largest sum = 6.

import java.util.Scanner;

class MaximumSubarray {

  private static int findMaxSubarraySum(int[] nums) {
    int n = nums.length;
    int maxSoFar = nums[0];
    int maxEndingHere = nums[0];

    for(int i = 1; i < n; i++) {
      if(maxEndingHere + nums[i] < nums[i]) {
        maxEndingHere = nums[i];
      } else {
        maxEndingHere = maxEndingHere + nums[i];
      }

      if(maxEndingHere > maxSoFar) {
        maxSoFar = maxEndingHere;
      }
    }
    return maxSoFar;
  }

  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    int n = keyboard.nextInt();
    int[] nums = new int[n];
    for(int i = 0; i < n; i++) {
      nums[i] = keyboard.nextInt();
    }

    System.out.println(findMaxSubarraySum(nums));
  }
}


// # Output
// $ javac MaximumSubarray.java
// $ java MaximumSubarray
// 9 -2 1 -3 4 -1 2 1 -5 4
// 6