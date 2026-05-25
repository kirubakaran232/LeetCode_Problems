// Last updated: 5/25/2026, 7:10:12 PM
class Solution {
    public int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {
        return Math.min(k,numOnes)-Math.max(0,k-numOnes-numZeros);
    }
}