// Last updated: 8/24/2026, 6:16:13 PM
1class Solution {
2    public List<List<Integer>> queensAttacktheKing(int[][] q, int[] k) {
3        List<List<Integer>>  res = new ArrayList<>();
4        boolean[][] b = new boolean[8][8];
5        for(int i=0;i<q.length;i++){
6            int qr = q[i][0];
7            int qc = q[i][1];
8            b[qr][qc] = true;
9        }
10        int dir[][] ={
11            {-1,-1},
12            {-1,0},
13            {-1,1},
14            {0,1},
15            {1,1},
16            {1,0},
17            {1,-1},
18            {0,-1}
19        };
20        for(int i=0;i<8;i++){
21            int kr = k[0];
22            int kc = k[1];
23            while(kr>=0 && kr<8 && kr>=0 && kc<8){
24                kr+=dir[i][0];
25                kc+=dir[i][1];
26                if(kr<0 || kc<0 || kr>=8 || kc>=8) break;
27
28                if(b[kr][kc]){
29                    res.add(Arrays.asList(kr,kc));
30                    break;
31                }
32            }
33        }
34        return res;
35    }
36}