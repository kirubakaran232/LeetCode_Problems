// Last updated: 9/11/2026, 10:50:15 AM
1class Solution {
2    public int scoreDifference(int[] nums) {
3        int f = 0, s = 0;
4        boolean b = false;
5        for(int i=0;i<nums.length;i++){
6            if(nums[i]%2 != 0) b = !b;
7            if(i%6 == 5) b =!b;
8            if(!b) f += nums[i];
9            else s += nums[i];
10        }
11        return f-s;
12    }
13}