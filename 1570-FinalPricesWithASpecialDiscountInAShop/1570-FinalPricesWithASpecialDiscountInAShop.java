// Last updated: 5/25/2026, 7:15:06 PM
class Solution {
    public int[] finalPrices(int[] prices) {
        int[] ans =  new int[prices.length];
        for(int i=0;i<prices.length;i++){
            ans[i] = prices[i];
            for(int j=1;j<prices.length;j++){
                if(prices[j] <= prices[i]&&j > i){
                    ans[i] = prices[i]-prices[j];
                    break;
                }
            }
        }
        return ans;
    }
}