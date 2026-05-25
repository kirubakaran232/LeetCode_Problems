// Last updated: 5/25/2026, 7:06:23 PM
class Solution {
    public int minMoves(int[] nums) {
        int max = Integer.MIN_VALUE;
        int sum = 0;

        for (int num : nums) {
            sum += num;
            if (num > max) {
                max = num;
            }
        }

        return max * nums.length - sum;
    }
}