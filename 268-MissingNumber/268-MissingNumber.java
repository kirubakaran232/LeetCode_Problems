// Last updated: 5/25/2026, 7:20:09 PM
class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length,asum=0;
        for(int i=0;i<n;i++){
            asum+=nums[i];
        }
        n= n*(n+1)/2;
        return n-asum;
    }
}