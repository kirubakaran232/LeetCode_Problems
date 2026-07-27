// Last updated: 7/27/2026, 8:47:00 AM
1class Solution {
2    public int maxProduct(int[] nums) {
3        Arrays.sort(nums);
4        int max1 = nums[nums.length-1];
5        int max2 = nums[nums.length-2];
6        return (max1-1)*(max2-1);
7    }
8}