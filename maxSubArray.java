/*
Author: Advaith U
Title:Maximum Subarray

The following problem is sold using dynamic programming.The algorithm used is Kadane's algorithm.

Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.

Example:

Input: [-2,1,-3,4,-1,2,1,-5,4],
Output: 6
Explanation: [4,-1,2,1] has the largest sum = 6.
*/



class Solution {
    public int maxSubArray(int[] nums) {
        int l=nums.length;
        int maxsofar=nums[0];  //stores maximum sum so far,intialised as first element to take into account when the array has only one non positive element
        int maxending=0;      //stores sum till  current index
        int start,end;
        for(int i=0;i<l;i++)
        {
            if(nums[i]>maxending+nums[i]){
                start=i;
                maxending=nums[i];
            }
            else
                maxending+=nums[i];
            if(maxsofar<maxending){
                maxsofar=maxending;
                end=i;
            }
            
        }
        return maxsofar;
    }
}
