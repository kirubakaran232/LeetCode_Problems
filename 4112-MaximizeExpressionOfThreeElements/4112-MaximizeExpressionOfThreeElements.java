// Last updated: 5/25/2026, 7:06:30 PM
class Solution {
    public int maximizeExpressionOfThree(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        return nums[n-1]+nums[n-2]-nums[0];
    }
}