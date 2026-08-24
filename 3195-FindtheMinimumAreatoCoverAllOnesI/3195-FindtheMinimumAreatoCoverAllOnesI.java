// Last updated: 8/24/2026, 11:55:45 AM
1class Solution {
2    public int minimumArea(int[][] grid) {
3        int mr = Integer.MAX_VALUE;
4        int r = Integer.MIN_VALUE;
5        int mc = Integer.MAX_VALUE;
6        int c = Integer.MIN_VALUE;
7        for(int i=0;i<grid.length;i++){
8            for(int j=0;j<grid[0].length;j++){
9                if(grid[i][j]==1){
10                    mr = Math.min(mr,i);
11                    mc = Math.min(mc,j);
12                    r = Math.max(r,i);
13                    c = Math.max(c,j);
14                }
15            }
16        }
17        return ((r-mr)+1)*((c-mc)+1);
18    }
19}
20
21