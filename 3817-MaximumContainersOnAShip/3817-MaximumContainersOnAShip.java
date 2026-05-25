// Last updated: 5/25/2026, 7:07:16 PM
class Solution {
    public int maxContainers(int n, int w, int maxWeight) {
        n=n*n;
        int a = maxWeight/w;
        return Math.min(n,a);
    }
}