// Last updated: 6/6/2026, 9:28:25 AM
1class Solution {
2    public int maxAreaOfIsland(int[][] grid) {
3        int r = grid.length;
4        int c = grid[0].length;
5        int max = 0;
6        for(int i=0;i<r;i++){
7            for(int j=0;j<c;j++){
8                if(grid[i][j]==1){
9                    int area = dfs(grid,i,j);
10                    max = Math.max(area,max);
11                }
12            }
13        }
14        return max;
15    }
16    public int dfs(int grid[][],int r,int c){
17        if(r<0 || c<0 || r>=grid.length || c>=grid[0].length || grid[r][c]==0){
18            return 0;
19        }
20        grid[r][c] = 0;
21        int area = 1;
22        area+=dfs(grid,r+1,c);
23        area+=dfs(grid,r-1,c);
24        area+=dfs(grid,r,c+1);
25        area+=dfs(grid,r,c-1);
26        return area;
27    }
28}