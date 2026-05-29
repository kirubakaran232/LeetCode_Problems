// Last updated: 5/30/2026, 3:45:26 AM
1class Solution {
2    public boolean searchMatrix(int[][] matrix, int target) {
3        int m = matrix.length;
4        int n = matrix[0].length;
5        int left = 0;
6        int right = m * n - 1;
7        while (left <= right) {
8            int mid = left + (right - left) / 2;
9            int row = mid / n;
10            int col = mid % n;
11            if (matrix[row][col] == target) {
12                return true;
13            } else if (matrix[row][col] > target) {
14                right = mid - 1;
15            } else {
16                left = mid + 1;
17            }
18        }
19        return false;
20    }
21}
22