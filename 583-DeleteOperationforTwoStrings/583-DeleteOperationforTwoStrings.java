// Last updated: 10/31/2026, 4:55:31 AM
1class Solution {
2    public int minDistance(String word1, String word2) {
3        char[] str1 = word1.toCharArray();
4        char[] str2 = word2.toCharArray();
5        int n = str1.length;
6        int m = str2.length;
7        int[][] dp = new int[n + 1][m + 1];
8        for (int i = 1; i <= n; i++) {
9            for (int j = 1; j <= m; j++) {
10                if (str1[i - 1] == str2[j - 1]) {
11                    dp[i][j] = dp[i - 1][j - 1] + 1;
12                } else {
13                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
14                }
15            }
16        }
17        return n + m - 2 * dp[n][m];
18    }
19}