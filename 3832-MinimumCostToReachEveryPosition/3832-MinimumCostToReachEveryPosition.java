// Last updated: 5/25/2026, 7:07:13 PM
class Solution {
    public int[] minCosts(int[] cost) {
        int prev = cost[0];
        for(int i = 1; i < cost.length; i++) {
            if(cost[i] > prev) cost[i] = prev;
            else prev = cost[i]; 
        } 

        return cost;
    }
}