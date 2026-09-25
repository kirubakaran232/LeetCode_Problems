// Last updated: 9/25/2026, 2:27:15 PM
1class Solution {
2    public int minInsertions(String s) {
3        int n = s.length();
4        int dp[][] = new int[n][n];
5        for(int i=0;i<n;i++){
6            dp[i][i] = 1;
7        }
8        for(int l=2;l<=n;l++){
9            for(int i=0;i<=n-l;i++){
10                int j = i+l-1;
11                if(s.charAt(i)==s.charAt(j)){
12                    if(l==2){
13                        dp[i][j] = 2;
14                    }else
15                        dp[i][j] = 2+dp[i+1][j-1];
16                }else{
17                    dp[i][j] = Math.max(dp[i+1][j],dp[i][j-1]);
18                }
19            }
20        }
21        return n-dp[0][n-1];
22    }
23}