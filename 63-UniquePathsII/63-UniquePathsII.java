// Last updated: 6/2/2026, 9:47:58 PM
1class Solution {
2    public int uniquePathsWithObstacles(int[][] grid) {
3        int m = grid.length;
4        int n = grid[0].length;
5        int dp[][] = new int[m][n];
6        dp[0][0]=1;
7        if(grid[0][0]==1) return 0;
8        for(int i=1;i<m;i++){
9            if(grid[i][0]==0) dp[i][0]=dp[i-1][0];
10        }
11        for(int i=1;i<n;i++){
12            if(grid[0][i]==0) dp[0][i]=dp[0][i-1];
13        }
14        for(int i=1;i<m;i++){
15            for(int j=1;j<n;j++){
16                if(grid[i][j]==0)
17                    dp[i][j]=dp[i-1][j]+dp[i][j-1];
18            }
19        }
20        return dp[m-1][n-1];
21    }
22}