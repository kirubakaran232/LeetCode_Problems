// Last updated: 5/25/2026, 7:07:03 PM
class Solution {
    public boolean canPartitionGrid(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        long tot = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                tot += grid[i][j];
            }
        }
        long sum = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                sum += grid[i][j];
            }
            if (sum == tot - sum)
                return true;
        }
        sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                sum += grid[j][i];
            }
            if (sum == tot - sum)
                return true;
        }

        return false;
    }
}