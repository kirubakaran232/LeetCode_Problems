// Last updated: 5/25/2026, 7:21:24 PM
class Solution {
    public int[] twoSum(int[] nums, int tar) {
        int l = 0,r = nums.length-1;
        while(l<=r){
            if(nums[l]+nums[r]==tar) return new int[]{l+1,r+1};
            if(nums[l]+nums[r]>tar) r--;
            else l++;
        }
        return new int[]{-1,-1};
    }
}