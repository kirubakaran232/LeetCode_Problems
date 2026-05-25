// Last updated: 5/25/2026, 7:13:10 PM
class Solution {
    public int subsetXORSum(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            sum |= num;
        }
        return sum << (nums.length - 1);
    }
}