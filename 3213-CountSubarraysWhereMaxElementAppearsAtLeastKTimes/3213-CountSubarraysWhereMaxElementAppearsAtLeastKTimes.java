// Last updated: 5/25/2026, 7:09:04 PM
class Solution {
    public long countSubarrays(int[] nums, int k) {
        int max = 0;
        for(int num : nums){
            max = Math.max(max, num);
        }
        int count = 0,l = 0;
        long res = 0;
        for(int r = 0; r < nums.length; r++){
            if(nums[r] == max) count++;
            while(count >= k){
                res += nums.length - r;
                if(nums[l] == max) count--;
                l++;
            }
        }
        return res;
    }
}