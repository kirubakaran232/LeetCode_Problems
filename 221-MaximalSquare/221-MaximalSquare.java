// Last updated: 6/2/2026, 10:04:23 PM
1class Solution {
2    public int maximalSquare(char[][] matrix) {
3        int rows = matrix.length;
4        int cols = matrix[0].length;
5        int max = 0;
6        int [][] dp = new int [rows+1][cols+1];
7        for (int i = 1; i <= rows; i++) {
8            for (int j = 1; j <= cols; j++) {
9                if (matrix[i-1][j-1] == '1') {
10                    dp[i][j] = 1 + Math.min(Math.min(dp[i-1][j], dp[i][j-1]),dp[i-1][j-1]);
11                }
12                max = Math.max(dp[i][j], max);
13            }
14        }
15        return max * max;
16    }
17}