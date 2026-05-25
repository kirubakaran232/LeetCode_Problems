// Last updated: 5/25/2026, 7:23:15 PM
class Solution {
    public int searchInsert(int[] nums, int target) {
        int l = 0,r = nums.length-1;
        while(l<=r){
            int mid = (l+r)/2;
            if(target==nums[mid]){
                return mid;
            }else if(target<nums[mid]){
                r = mid - 1;
            }else{
                l = mid + 1;
            }
        }
        return l;
    }
}