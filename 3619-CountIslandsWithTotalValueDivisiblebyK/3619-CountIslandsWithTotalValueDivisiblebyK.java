// Last updated: 8/11/2026, 11:54:21 AM
1class Solution {
2    public int countIslands(int[][] grid, int k) {
3        long sum = 0;
4        int c = 0;
5        boolean b[][] = new boolean[grid.length][grid[0].length];
6        for(int i=0;i<grid.length;i++){
7            for(int j=0;j<grid[0].length;j++){
8                if(grid[i][j]!=0 && !(b[i][j])){
9                    sum = bt(grid,i,j,b);
10                    if(sum%k==0) c++;
11                }
12            }
13        }
14        return c;
15    }
16    public long bt(int grid[][],int i,int j,boolean b[][]){
17        if(i>=grid.length || j>=grid[0].length || i<0 || j<0 || b[i][j] || grid[i][j]==0){
18            return 0;
19        }
20        b[i][j] = true;
21        long sum = grid[i][j];
22        sum+=bt(grid,i+1,j,b);
23        sum+=bt(grid,i,j+1,b);
24        sum+=bt(grid,i-1,j,b);
25        sum+=bt(grid,i,j-1,b);
26        return sum;
27    }
28}