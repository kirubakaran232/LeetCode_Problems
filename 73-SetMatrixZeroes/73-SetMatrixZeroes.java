// Last updated: 5/25/2026, 7:22:37 PM
class Solution {
    public void setZeroes(int[][] mat) {
        boolean fr = false, fc = false;
        for (int i = 0; i < mat[0].length; i++) {
            if (mat[0][i] == 0) {
                fr = true;
                break;
            }
        }
        for (int i = 0; i < mat.length; i++) {
            if (mat[i][0] == 0) {
                fc = true;
                break;
            }
        }
        for (int i = 1; i < mat.length; i++) {
            for (int j = 1; j < mat[0].length; j++) {
                if (mat[i][j] == 0) {
                    mat[i][0] = 0;
                    mat[0][j] = 0;
                }
            }
        }
        for (int i = 1; i < mat.length; i++) {
            for (int j = 1; j < mat[0].length; j++) {
                if (mat[i][0] == 0 || mat[0][j] == 0) {
                    mat[i][j] = 0;
                }
            }
        }
        if (fc) {
            for (int i = 0; i < mat.length; i++) {
                mat[i][0] = 0;
            }
        }
        if (fr) {
            for (int j = 0; j < mat[0].length; j++) {
                mat[0][j] = 0;
            }
        }

    }
}