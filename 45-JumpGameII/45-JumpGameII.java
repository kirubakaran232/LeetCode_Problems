// Last updated: 6/17/2026, 7:37:14 PM
1class Solution {
2    public int jump(int[] nums) {
3        int j = 0,max = 0,end = 0;
4        for(int i=0;i<nums.length-1;i++){
5            max = Math.max(nums[i]+i,max);
6            if(i==end){
7                j++;
8                end = max;
9            }
10        }
11        return j;
12    }
13}