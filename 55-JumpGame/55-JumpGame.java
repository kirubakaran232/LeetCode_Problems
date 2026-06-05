// Last updated: 6/5/2026, 6:57:13 AM
1class Solution {
2    public boolean canJump(int[] nums) {
3        int max = 0;
4        int n = nums.length;
5        for(int i=0;i<nums.length;i++){
6            if(max<i)return false;
7            max = Math.max(nums[i]+i,max);
8        }
9        return true;
10    }
11}