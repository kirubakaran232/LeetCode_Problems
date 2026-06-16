// Last updated: 6/16/2026, 11:24:28 AM
1class Solution {
2    public char[][] rotateTheBox(char[][] box) {
3        int m = box.length,n = box[0].length;
4        for(int i=0;i<m;i++){
5            int p = n-1;
6            for(int j=n-1;j>=0;j--){
7                if(box[i][j]=='*'){
8                    p = j-1;
9                }else if(box[i][j] == '#'){
10                    box[i][j] = '.';
11                    box[i][p] = '#';
12                    p--;
13                }
14            }
15        }
16        char res[][] = new char[n][m];
17        for(int i=0;i<m;i++){
18            for(int j=0;j<n;j++){
19                res[j][m-1-i] = box[i][j];
20            }
21        }
22        return res;
23    }
24}