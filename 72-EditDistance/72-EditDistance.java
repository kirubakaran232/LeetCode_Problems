// Last updated: 6/4/2026, 1:06:05 AM
1class Solution {
2  public int minDistance(String word1, String word2) {
3    int m = word1.length();
4    int n = word2.length();
5    int[][] dp = new int[m + 1][n + 1];
6    for (int i = 1; i <= m; ++i)
7      dp[i][0] = i;
8
9    for (int j = 1; j <= n; ++j)
10      dp[0][j] = j;
11
12    for (int i = 1; i <= m; ++i)
13      for (int j = 1; j <= n; ++j)
14        if (word1.charAt(i - 1) == word2.charAt(j - 1))
15          dp[i][j] = dp[i - 1][j - 1];
16        else
17          dp[i][j] = Math.min(dp[i - 1][j - 1], Math.min(dp[i - 1][j], dp[i][j - 1])) + 1;                     
18    return dp[m][n];
19  }
20}