// Last updated: 10/6/2026, 1:34:33 PM
1class Solution {
2    public int rob(int[] nums) {
3        int n = nums.length;
4        if(n==1) return nums[0];
5        if(n==2) return Math.max(nums[0],nums[1]);
6        int dp[] = new int[n-1];
7        dp[0] = nums[0];
8        dp[1] = Math.max(nums[0],nums[1]);
9        for(int i=2;i<n-1;i++){
10            dp[i] = Math.max(dp[i-1],nums[i] + dp[i-2]);
11        }
12        int dp1[] = new int[n-1];
13        dp1[0] = nums[1];
14        dp1[1] = Math.max(nums[1],nums[2]);
15        for(int i=2;i<n-1;i++){
16            dp1[i] = Math.max(dp1[i-1],nums[i+1] + dp1[i-2]);
17        }
18        return Math.max(dp[n-2],dp1[n-2]);
19    }
20}