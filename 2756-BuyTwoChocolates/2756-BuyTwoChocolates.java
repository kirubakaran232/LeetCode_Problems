// Last updated: 5/25/2026, 7:10:01 PM
class Solution {
    public int buyChoco(int[] prices, int money) {
        Arrays.sort(prices);
        int sum =0;
        sum=prices[0]+prices[1];
        if(sum<=money){
            return money - sum;
        }
        else
        return money;
    }
}