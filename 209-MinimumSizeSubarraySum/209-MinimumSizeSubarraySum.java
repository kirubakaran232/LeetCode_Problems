// Last updated: 5/25/2026, 7:20:46 PM
class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int len = Integer.MAX_VALUE;
        int sum = 0,l = 0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            while(sum>=target){
                len = Math.min(len,i-l+1);
                sum-=nums[l];
                l++;
            }
        }
        return len==Integer.MAX_VALUE?0:len;
    }
}