// Last updated: 5/26/2026, 9:26:50 PM
1class Solution {
2    public int maxSubarraySumCircular(int[] nums) {
3        int cmax = nums[0],cmin = nums[0];
4        int mins = nums[0],maxs = nums[0],tot = nums[0];
5        for(int i=1;i<nums.length;i++){
6            tot = tot+nums[i];
7            cmax = Math.max(nums[i],cmax+nums[i]);
8            maxs = Math.max(cmax,maxs);
9            cmin = Math.min(nums[i],cmin+nums[i]);
10            mins = Math.min(cmin,mins);
11        }
12        if(maxs<0){
13            return maxs;
14        }
15        return Math.max(maxs, tot - mins);
16    }
17}