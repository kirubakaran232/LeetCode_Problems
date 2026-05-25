// Last updated: 5/25/2026, 7:19:53 PM
class Solution {
    public int coinChange(int[] coins, int amount) {
        int dp[][] = new int[coins.length+1][amount+1];
        for (int j = 1; j <= amount; j++) {
            dp[0][j] = amount+1; 
        }
        for (int i = 1; i <= coins.length; i++) {
            dp[i][0] = 0; 
        }
        for(int i=1;i<=coins.length;i++){
            for(int j=1;j<=amount;j++){
                if(coins[i-1]>j){
                    dp[i][j]=dp[i-1][j];
                }else{
                    dp[i][j]=Math.min(dp[i][j-coins[i-1]]+1,dp[i-1][j]);
                }
                
            }
        }
        return dp[coins.length][amount] > amount ? -1 : dp[coins.length][amount];
    }
}