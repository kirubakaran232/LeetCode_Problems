// Last updated: 8/24/2026, 4:14:20 PM
1class Solution {
2    public int[][] rangeAddQueries(int n, int[][] q) {
3        int mat[][] = new int[n][n];
4        for(int i=0;i<q.length;i++){
5            int sr = q[i][0];
6            int sc = q[i][1];
7            int er = q[i][2];
8            int ec = q[i][3];
9            for(int j=sr;j<=er;j++){
10                for(int k=sc;k<=ec;k++){
11                    mat[j][k]+=1;
12                }
13            }
14        }
15        return mat;
16    }
17}