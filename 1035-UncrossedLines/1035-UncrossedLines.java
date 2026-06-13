// Last updated: 6/13/2026, 5:54:49 PM
1class Solution {
2    public int maxUncrossedLines(int[] nums1, int[] nums2) {
3        int m = nums1.length;
4        int n = nums2.length;
5        int[][] dp = new int[m + 1][n + 1];
6        for (int i = 1; i <= m; i++) {
7            for (int j = 1; j <= n; j++) {
8                if(nums1[i-1]==nums2[j-1]){
9                    dp[i][j] = 1 + dp[i-1][j-1];
10                }else{
11                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
12                }
13            }
14        }
15        return dp[m][n];
16    }
17}