// Last updated: 8/4/2026, 3:14:59 PM
1class Solution {
2    public boolean isSafe(char b[][],int r,int c,int n){
3        for(int i=0;i<n;i++){
4            if(b[i][c]=='Q'){
5                return false;
6            }
7        }
8        for(int i=r-1,j=c-1;i>=0 && j>=0;i--,j--){
9            if(b[i][j]=='Q'){
10                return false;
11            }
12        }
13        for(int i=r-1,j=c+1;i>=0 && j<n;i--,j++){
14            if(b[i][j]=='Q'){
15                return false;
16            }
17        }
18        return true;
19    }
20    public void bt(List<List<String>> res,int n,char b[][],int r){
21        if(r==n){
22            ArrayList<String> l = new ArrayList<>();
23            for(char[] row:b){
24                l.add(new String(row));
25            }
26            res.add(new ArrayList<>(l));
27            return;
28        }
29        for(int col=0;col<n;col++){
30            if(isSafe(b,r,col,n)){
31                b[r][col] = 'Q';
32                bt(res,n,b,r+1);
33                b[r][col] = '.';
34            }
35        }
36    }
37    public List<List<String>> solveNQueens(int n) {
38        List<List<String>> res = new ArrayList<>();
39        char b[][] = new char[n][n];
40        for(int i=0;i<n;i++){
41            Arrays.fill(b[i],'.');
42        }
43        bt(res,n,b,0);
44        return res;
45    }
46}