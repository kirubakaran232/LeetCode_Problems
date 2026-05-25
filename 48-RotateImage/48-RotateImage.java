// Last updated: 5/25/2026, 7:23:07 PM
class Solution {
    public void rotate(int[][] mat) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = i; j < mat[0].length; j++) {
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }
        for (int i = 0; i < mat.length; i++) {
            int l = 0, r = mat[0].length - 1;
            while (l <= r) {
                int temp = mat[i][l];
                mat[i][l] = mat[i][r];
                mat[i][r] = temp;
                l++;
                r--;
            }
        }
    }
}