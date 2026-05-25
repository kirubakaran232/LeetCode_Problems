// Last updated: 5/25/2026, 7:17:27 PM
class Solution {
    public int minFallingPathSum(int[][] mat) {
        int n = mat.length;
        for(int i=1;i<n;i++){
            for(int j=0;j<n;j++){
                if(j==0){
                    mat[i][j] += Math.min(mat[i-1][j],mat[i-1][j+1]);
                }else if(j==n-1){
                     mat[i][j] += Math.min(mat[i-1][j-1],mat[i-1][j]);
                }else{
                    mat[i][j] += Math.min(mat[i-1][j-1],Math.min(mat[i-1][j],mat[i-1][j+1]));
                }
            }
        }
        int min = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            min = Math.min(mat[n-1][i],min);
        }
        return min;
    }
}