// Last updated: 7/1/2026, 10:14:31 PM
1class Solution {
2    public boolean isValidSudoku(char[][] b) {
3        HashSet<Integer>[] r = new HashSet[9];
4        HashSet<Integer>[] c = new HashSet[9];
5        HashSet<Integer>[] s = new HashSet[9];
6        for(int i=0;i<9;i++){
7            r[i] = new HashSet<>();
8            c[i] = new HashSet<>();
9            s[i] = new HashSet<>();
10        }
11        for(int i=0;i<9;i++){
12            for(int j=0;j<9;j++){
13                if(b[i][j]!='.'){
14                    int val = b[i][j] -'0';
15                    int ind = (i/3)*3+(j/3);
16                    if(r[i].contains(val) || c[j].contains(val) || s[ind].contains(val)){
17                        return false;
18                    }
19                    r[i].add(val);
20                    c[j].add(val);
21                    s[ind].add(val);
22                }
23            }
24        }
25        return true;
26    }
27}