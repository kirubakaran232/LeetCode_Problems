// Last updated: 5/25/2026, 7:14:28 PM
class Solution {
    public int maxCoins(int[] piles) {
        Arrays.sort(piles);
        int res = 0;
        for (int i = piles.length / 3; i < piles.length; i += 2) {
            res += piles[i];
        }
        return res;        
    }
}