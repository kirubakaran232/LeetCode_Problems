// Last updated: 5/25/2026, 7:18:19 PM
class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if(k<=1) return 0;
        int l = 0,r = 0,p = 1,c = 0;
        while(l<nums.length && r<nums.length){
            p=p*nums[r];
            while(p>=k){
                p=p/nums[l];
                l++;
            }
            c+=r-l+1;
            r++;
        }
        return c;
    }
}