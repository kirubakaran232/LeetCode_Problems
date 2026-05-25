// Last updated: 5/25/2026, 7:13:30 PM
class Solution {
    public int minOperations(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] >= nums[i + 1]) {
                int diff = nums[i] - nums[i + 1] + 1;
                nums[i + 1] += diff;
                count += diff;
            }
        }
        return count;
    }
}
