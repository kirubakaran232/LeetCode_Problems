// Last updated: 6/9/2026, 10:20:29 AM
1class Solution {
2    public long maxTotalValue(int[] nums, int k) {
3        int min = Integer.MAX_VALUE;
4        int max = Integer.MIN_VALUE;
5        for(int i=0;i<nums.length;i++){
6            min = Math.min(nums[i],min);
7            max = Math.max(nums[i],max);
8        }
9        return (long)(max - min)*k;
10    }
11}