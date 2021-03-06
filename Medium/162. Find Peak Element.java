/*
162. Find Peak Element

A peak element is an element that is greater than its neighbors.
Given an input array nums, where nums[i] ≠ nums[i+1], find a peak element and return its index.
The array may contain multiple peaks, in that case return the index to any one of the peaks is fine.
You may imagine that nums[-1] = nums[n] = -∞.

Example 1:
Input: nums = [1,2,3,1]
Output: 2
Explanation: 3 is a peak element and your function should return the index number 2.

*/

class Solution {
    public int findPeakElement(int[] nums) {
      //In O(n)
        /* for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1])
                return i;
        }
        return nums.length - 1;
        */
        
        //Using Binary Search (O(log n))
        int left = 0, right = nums.length -1;
        while(left<right){
            int p = (left+right)/2;           
            if(nums[p] > nums[p+1]){
                right = p;
            }
            else {
                left = p+1;
            }
        }
        return left;
    }
}