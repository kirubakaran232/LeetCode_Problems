// Last updated: 6/9/2026, 11:44:28 AM
1class Solution {
2    public void solve(char[][] b) {
3        int m = b.length;
4        int n = b[0].length;
5        for(int i=0;i<m;i++){
6            dfs(b,i,0);
7            dfs(b,i,n-1);
8        }
9        for(int i=0;i<n;i++){
10            dfs(b,0,i);
11            dfs(b,m-1,i);
12        }
13        for(int i=0;i<m;i++){
14            for(int j=0;j<n;j++){
15                if(b[i][j]=='O'){
16                    b[i][j]='X';
17                }else if(b[i][j]=='#'){
18                    b[i][j]='O';
19                }
20            }
21        }
22    }
23    public void dfs(char b[][],int r,int c){
24        if(r>=b.length || c>=b[0].length || r<0 || c<0 || b[r][c]=='X' || b[r][c]=='#'){
25            return;
26        }
27        b[r][c] = '#';
28
29        dfs(b,r+1,c);
30        dfs(b,r-1,c);
31        dfs(b,r,c+1);
32        dfs(b,r,c-1);
33    }
34}