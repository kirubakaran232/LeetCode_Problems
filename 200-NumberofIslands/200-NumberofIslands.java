// Last updated: 6/6/2026, 7:28:14 AM
1class Solution {
2    public int numIslands(char[][] grid) {
3        if (grid == null || grid.length == 0) {
4            return 0;
5        }
6        int r = grid.length;
7        int c = grid[0].length;
8        int count = 0;
9        for (int i = 0; i < r; i++) {
10            for (int j = 0; j < c; j++) {
11                if (grid[i][j] == '1') {
12                    count++;
13                    dfs(grid, i, j);
14                }
15            }
16        }
17        return count;
18    }
19
20    public void dfs(char grid[][], int r, int c) {
21        if (r < 0 || c < 0 || r >= grid.length || c >= grid[0].length || grid[r][c] == '0') {
22            return;
23        }
24        grid[r][c] = '0';
25        dfs(grid, r + 1, c);
26        dfs(grid, r - 1, c);
27        dfs(grid, r, c + 1);
28        dfs(grid, r, c - 1);
29    }
30}