// Last updated: 5/25/2026, 7:11:28 PM
class Solution {
    public int maximumXOR(int[] nums) {
        int res = 0;
        for (int a: nums)
            res |= a;
        return res;
    }
}