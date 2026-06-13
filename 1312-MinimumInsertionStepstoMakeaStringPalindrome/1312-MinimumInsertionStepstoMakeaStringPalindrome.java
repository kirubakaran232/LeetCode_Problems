// Last updated: 6/13/2026, 11:17:16 PM
1class Solution {
2    public int minInsertions(String s) {
3        int n = s.length();
4        String rev = new StringBuilder(s).reverse().toString();
5        int dp[][] = new int[n+1][n+1];
6        for(int i=1;i<=n;i++){
7            for(int j=1;j<=n;j++){
8                if(s.charAt(i-1)==rev.charAt(j-1)){
9                    dp[i][j] = 1+dp[i-1][j-1];
10                }else{
11                    dp[i][j] = Math.max(dp[i-1][j] , dp[i][j-1]);
12                }
13            }
14        }
15        return s.length() - dp[n][n];
16    }
17}