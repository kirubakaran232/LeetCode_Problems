// Last updated: 5/25/2026, 7:10:38 PM
class Solution {
    public int[][] onesMinusZeros(int[][] grid){
        int n = grid.length;
        int m = grid[0].length; 
        int[] onerow = new int[n];
        int[] onecol = new int[m]; 
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 1) {
                    onerow[i]++;
                    onecol[j]++;
                }
            }
        }
        int[][] ans = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                ans[i][j] = onerow[i] + onecol[j] - (m - onerow[i]) - (n - onecol[j]);
            }
        }
        return ans;
    }
}