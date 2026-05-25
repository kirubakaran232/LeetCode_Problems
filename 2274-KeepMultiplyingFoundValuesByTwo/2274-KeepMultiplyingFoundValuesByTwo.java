// Last updated: 5/25/2026, 7:11:58 PM
class Solution {
    public int findFinalValue(int[] nums, int original) {
        for(int i=0;i<nums.length;i++){
            if(original==nums[i]){
                original = 2 * original;
                i=-1;
            }
        }
        return original;
    }
}