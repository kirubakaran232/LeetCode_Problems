// Last updated: 8/22/2026, 9:31:46 AM
1class Solution {
2    public int nearestDrone(int[][] d, int[] t) {
3        int ind = -1;
4        int min = Integer.MAX_VALUE;
5        for(int i=d.length-1;i>=0;i--){
6            int sum = Math.abs(d[i][0]-t[0]) + Math.abs(d[i][1]-t[1]);
7            if(sum<=d[i][2]){
8                if(min>=sum){
9                    ind = i;
10                    min = sum;
11                }
12            }
13        }
14        return ind;
15    }
16}