// Last updated: 5/25/2026, 7:09:25 PM
class Solution {
    public int accountBalanceAfterPurchase(int purchaseAmount) {
        int r=((purchaseAmount + 5) / 10) * 10;
        return 100-r;
    }
}