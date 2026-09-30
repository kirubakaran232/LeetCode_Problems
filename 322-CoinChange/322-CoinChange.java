// Last updated: 9/30/2026, 10:59:17 AM
1class Solution {
2    public int coinChange(int[] c, int amt) {
3        int dp[][] = new int[c.length+1][amt+1];
4        for(int i=1;i<=amt;i++){
5            dp[0][i] = amt+1;
6        }
7        for(int i=1;i<=c.length;i++){
8            dp[i][0] = 0;
9        }
10        for(int i=1;i<=c.length;i++){
11            for(int j=1;j<=amt;j++){
12                if(c[i-1]>j){
13                    dp[i][j] = dp[i-1][j];
14                }else{
15                    dp[i][j]=Math.min(dp[i][j-c[i-1]]+1,dp[i-1][j]);
16                }
17            }
18        }
19        return dp[c.length][amt] > amt ? -1 : dp[c.length][amt];
20    }
21}