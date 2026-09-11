// Last updated: 9/11/2026, 12:02:20 PM
1class Solution {
2    public int minimumPrefixLength(int[] nums) {
3        int i = nums.length-1;
4        while(i>0 && nums[i-1]<nums[i]) i--;
5        return i;
6    }
7}