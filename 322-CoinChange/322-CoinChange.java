// Last updated: 6/4/2026, 10:38:45 PM
1class Solution {
2    public int coinChange(int[] coins, int amount) {
3        int dp[][] = new int[coins.length+1][amount+1];
4        for (int j = 1; j <= amount; j++) {
5            dp[0][j] = amount+1; 
6        }
7        for (int i = 1; i <= coins.length; i++) {
8            dp[i][0] = 0; 
9        }
10        for(int i=1;i<=coins.length;i++){
11            for(int j=1;j<=amount;j++){
12                if(coins[i-1]>j){
13                    dp[i][j]=dp[i-1][j];
14                }else{
15                    dp[i][j]=Math.min(dp[i][j-coins[i-1]]+1,dp[i-1][j]);
16                }
17                
18            }
19        }
20        return dp[coins.length][amount] > amount ? -1 : dp[coins.length][amount];
21    }
22}