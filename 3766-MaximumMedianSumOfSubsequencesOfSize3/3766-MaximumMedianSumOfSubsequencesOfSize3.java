// Last updated: 5/25/2026, 7:07:28 PM
class Solution {
    public long maximumMedianSum(int[] nums) {
        long ans = 0;
        Arrays.sort(nums);
        int n = nums.length/3;
        for(int i =n;i<nums.length;i+=2){
            ans += nums[i];
        }
        return ans;
    }
}