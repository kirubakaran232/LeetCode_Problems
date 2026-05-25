// Last updated: 5/25/2026, 7:22:26 PM
class Solution {
    public int removeDuplicates(int[] nums) {
        int k = 2;
        for(int j=2;j<nums.length;j++){
            if(nums[j]!=nums[k-2]){
                nums[k]=nums[j];
                k++;
            }
        }
        return k;
    }
}