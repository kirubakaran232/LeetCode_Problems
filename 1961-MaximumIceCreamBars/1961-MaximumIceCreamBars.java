// Last updated: 5/25/2026, 7:13:17 PM
class Solution {
    public int maxIceCream(int[] costs, int coins) {
        int sum = 0,c = 0;
        Arrays.sort(costs);
        for(int i=0;i<costs.length;i++){
            if(sum+costs[i]<=coins){
                sum+=costs[i];
                c++;
            }
        }
        return c;
    }
}