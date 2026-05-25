// Last updated: 5/25/2026, 7:11:43 PM
class Solution {
    public boolean divideArray(int[] nums) {
        Arrays.sort(nums);
        if(nums.length%2!=0) return false;
        for(int i=0;i<nums.length;i+=2){
            if(nums[i]!=nums[i+1]){
                return false;
            }
        }
        return true;
    }
}