// Last updated: 5/30/2026, 3:46:24 AM
1class Solution {
2    public int findPeakElement(int[] nums) {
3        int n = nums.length;
4        if (n == 1) return 0;
5        if (nums[0] > nums[1]) return 0;
6        for(int i=1;i<n-1;i++){
7            if(nums[i-1]<nums[i] && nums[i]>nums[i+1]){
8                return i;
9            }
10        }
11        if (nums[n - 1] > nums[n - 2]) return n - 1;
12        return -1;
13    }
14}