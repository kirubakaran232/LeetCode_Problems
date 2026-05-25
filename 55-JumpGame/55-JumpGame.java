// Last updated: 5/25/2026, 7:22:57 PM
class Solution {
    public boolean canJump(int[] nums) {
        int max = 0;
        int n = nums.length;
        for(int i=0;i<nums.length;i++){
            if(max<i)return false;
            max = Math.max(nums[i]+i,max);
        }
        return true;
    }
}