// Last updated: 8/11/2026, 9:38:11 AM
1class Solution {
2    int max = 0;
3    public int getMaximumGold(int[][] grid) {
4        int m = grid.length;
5        int n = grid[0].length;
6        for(int i=0;i<m;i++){
7            for(int j=0;j<n;j++){
8                if(grid[i][j]!=0){
9                    bt(grid,i,j,new boolean[m][n],0);
10                }
11            }
12        }
13        return max;
14    }
15    public void bt(int grid[][],int i,int j,boolean b[][],int sum){
16        if(i>=grid.length || j>=grid[0].length || i<0 || j<0 || b[i][j] || grid[i][j]==0){
17            return;
18        }
19        sum = sum+grid[i][j];
20        max = Math.max(sum,max);
21        b[i][j] = true;
22        bt(grid,i+1,j,b,sum);
23        bt(grid,i,j+1,b,sum);
24        bt(grid,i,j-1,b,sum);
25        bt(grid,i-1,j,b,sum);
26        b[i][j] = false;
27    }
28}