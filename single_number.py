"""
Author : Advaith U
day1

Given a non-empty array of integers, every element appears twice except for one.
Find that single one."""
class Solution:
    def singleNumber(self, nums: List[int]) -> int:
        l=len(nums)
        for i in range(l):
            if nums.count(nums[i])<2:
                return nums[i]
