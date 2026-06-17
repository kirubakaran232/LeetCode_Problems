// Last updated: 6/17/2026, 6:09:01 PM
1class Solution {
2    public List<Integer> luckyNumbers(int[][] mat) {
3        int m = mat.length,n = mat[0].length;
4        List<Integer> lmin = new ArrayList<>();
5        List<Integer> res = new ArrayList<>();
6        for(int i=0;i<m;i++){
7            int min = Integer.MAX_VALUE;
8            for(int j=0;j<n;j++){
9                min = Math.min(mat[i][j],min);
10            }
11            lmin.add(min);
12        }
13        for(int i=0;i<n;i++){
14            int max = Integer.MIN_VALUE;
15            for(int j=0;j<m;j++){
16                max = Math.max(mat[j][i],max);
17            }
18            if(lmin.contains(max)){
19                res.add(max);
20            }
21        }
22        return res;
23    }
24}