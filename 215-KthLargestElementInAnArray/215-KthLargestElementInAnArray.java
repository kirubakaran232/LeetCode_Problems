// Last updated: 5/25/2026, 7:20:42 PM
class Solution {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);          
        return nums[nums.length - k];  
    }
}
