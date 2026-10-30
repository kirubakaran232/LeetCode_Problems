// Last updated: 10/30/2026, 12:03:45 PM
1class Solution {
2    public int minFlips(int[][] grid) {
3        int row = grid.length, col = grid[0].length;
4        int rcnt = 0,ccnt = 0;
5        for(int i=0;i<row;i++){
6            int l = 0,r = col-1;
7            while(l<r){
8                if(grid[i][l]!=grid[i][r]) rcnt++;
9                l++;
10                r--;
11            }
12        }
13        for(int i=0;i<col;i++){
14            int t = 0,b = row-1;
15            while(t<b){
16                if(grid[t][i]!=grid[b][i]) ccnt++;
17                t++;
18                b--;
19            }
20        }
21        return Math.min(rcnt,ccnt);
22    }
23}