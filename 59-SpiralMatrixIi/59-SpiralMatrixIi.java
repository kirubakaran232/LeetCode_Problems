// Last updated: 5/25/2026, 7:22:53 PM
class Solution {
    public int[][] generateMatrix(int n) {
        int arr[][] = new int[n][n];
        int top = 0,bottom = n-1,left = 0,right = n-1;
        int val = 1;
        while(top<=bottom && left<=right){
            for(int i=left;i<=right;i++){
                arr[top][i]=val;
                val++;
            }
            top++;
            for(int i=top;i<=bottom;i++){
                arr[i][right]=val;
                val++;
            }
            right--;
            if(top<=bottom){
                for(int i=right;i>=left;i--){
                    arr[bottom][i]=val;
                    val++;
                }
                bottom--;
            }
            if(left<=right){
                for(int i=bottom;i>=top;i--){
                    arr[i][left]=val;
                    val++;
                }
                left++;
            }
        }
        return arr;
    }
}