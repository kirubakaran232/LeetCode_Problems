// Last updated: 5/25/2026, 7:11:42 PM
class Solution {
    public int triangularSum(int[] nums) {
        int n=nums.length;
        for(int i=n;i>1;i--){
            for(int j=0;j<i-1;j++){
                nums[j]=(nums[j]+nums[j+1])%10;
            }
        }
        return nums[0];
    }
}