// Last updated: 6/1/2026, 10:04:22 AM
1class Solution {
2    public int minimumCost(int[] cost) {
3        Arrays.sort(cost);
4        int ans = 0;
5        int count = 0;
6        for(int i = cost.length-1; i >= 0; i--){
7            count++;
8            if(count == 3){
9                count = 0;
10            }
11            else{
12                ans += cost[i];
13            }
14        }
15        return ans;
16    }
17}