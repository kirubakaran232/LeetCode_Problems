// Last updated: 5/25/2026, 7:15:04 PM
class Solution {
    public int maxProduct(int[] nums) {
        Arrays.sort(nums);
        int max1 = nums[nums.length-1];
        int max2 = nums[nums.length-2];
        return (max1-1)*(max2-1);
    }
}