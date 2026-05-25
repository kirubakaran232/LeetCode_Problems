// Last updated: 5/25/2026, 7:14:39 PM
class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        return numBottles+(numBottles-1)/(numExchange-1);
    }
}