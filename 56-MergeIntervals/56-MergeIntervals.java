// Last updated: 5/30/2026, 11:51:48 AM
1class Solution {
2    public int[][] merge(int[][] inter) {
3        Arrays.sort(inter,(a,b)->a[0]-b[0]);
4        List<int[]> res = new ArrayList<>();
5        int[] cur = inter[0];
6        for(int i=1;i<inter.length;i++){
7            if(cur[1]>=inter[i][0]){
8                cur[1] = Math.max(cur[1],inter[i][1]);
9            }else{
10                res.add(cur);
11                cur = inter[i];
12            }
13        }
14        res.add(cur);
15        return res.toArray(new int[res.size()][]);
16    }
17}