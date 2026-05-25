// Last updated: 5/25/2026, 7:13:47 PM
class Solution {
    public int largestSubmatrix(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        for(int i=1;i<m;i++){
            for(int j=0;j<n;j++){
                if(mat[i][j]==1){
                    mat[i][j]+=mat[i-1][j];
                }
            }
        }
        int res = 0;
        for(int i=0;i<m;i++){
            Arrays.sort(mat[i]);
            for(int j=0;j<n;j++){
                int h = mat[i][j];
                int w = n - j;
                res = Math.max(res,h*w);
            }
        }
        return res;
    }
}