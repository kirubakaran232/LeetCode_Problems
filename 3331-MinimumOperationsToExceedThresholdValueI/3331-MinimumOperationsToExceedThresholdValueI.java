// Last updated: 5/25/2026, 7:08:48 PM
class Solution {
    public int minOperations(int[] nums, int k) {
        int count =0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<k){
                count++;
            }
        }
        return count;
    }
}