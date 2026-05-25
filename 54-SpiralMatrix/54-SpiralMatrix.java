// Last updated: 5/25/2026, 7:22:58 PM
class Solution {
    public List<Integer> spiralOrder(int[][] mat) {
        List<Integer> list = new ArrayList<>();
        int l = 0, r = mat[0].length - 1, t = 0, d = mat.length - 1;
        while (l <= r && t <= d) {
            for (int i = l; i <= r; i++) {
                list.add(mat[l][i]);
            }
            t++;
            for (int i = t; i <= d; i++) {
                list.add(mat[i][r]);
            }
            r--;
            if (t <= d) {
                for (int i = r; i >= l; i--) {
                    list.add(mat[d][i]);
                }
                d--;
            }
            if (l <= r) {
                for (int i = d; i >= t; i--) {
                    list.add(mat[i][l]);
                }
                l++;
            }
        }
        return list;
    }
}