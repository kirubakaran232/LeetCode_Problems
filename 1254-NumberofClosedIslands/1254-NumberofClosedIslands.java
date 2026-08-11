// Last updated: 8/11/2026, 11:04:41 AM
1class Solution {
2    public int closedIsland(int[][] grid) {
3        int c = 0;
4        for(int i=0;i<grid.length;i++){
5            for(int j=0;j<grid[0].length;j++){
6                if(grid[i][j]==0){
7                    if(bt(grid,i,j)) c++;
8                }
9            }
10        }
11        return c;
12    }
13    public boolean bt(int grid[][],int i,int j){
14        if(i>=grid.length || j>=grid[0].length || i<0 || j<0){
15            return false;
16        }
17        if(grid[i][j]==1) return true;
18        grid[i][j] = 1;
19        boolean down = bt(grid,i+1,j);
20        boolean right = bt(grid,i,j+1);
21        boolean up = bt(grid,i-1,j);
22        boolean left = bt(grid,i,j-1);
23        return up && down && left && right;
24    }
25}