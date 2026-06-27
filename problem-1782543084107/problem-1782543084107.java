// Last updated: 6/27/2026, 12:21:24 PM
1class Solution {
2    static int c = 0;
3    static boolean safe(char[][] b,int r,int c,int n){
4        for(int i=0;i<n;i++){
5            if(b[i][c]=='Q')
6                return false;
7        }
8        for(int i=r-1,j=c-1;i>=0 && j>=0;i--,j--){
9            if(b[i][j]=='Q')
10                return false;
11        }
12        for(int i=r-1,j=c+1;i>=0 && j<n;i--,j++){
13            if(b[i][j]=='Q')
14                return false;
15        }
16        return true;
17    }
18    static void bt(char[][] b,int r,int n){
19        if(r==n){
20            c++;
21            return;
22        }
23        for(int i=0;i<n;i++){
24            if(safe(b,r,i,n)){
25                b[r][i] = 'Q';
26                bt(b,r+1,n);
27                b[r][i] = '.';
28            }
29        }
30    }
31    public int totalNQueens(int n) {
32        c = 0;
33        char b[][] = new char[n][n]; 
34        for(int i=0;i<n;i++){
35            Arrays.fill(b[i],'.');
36        }
37        bt(b,0,n);
38        return c;
39    }
40}