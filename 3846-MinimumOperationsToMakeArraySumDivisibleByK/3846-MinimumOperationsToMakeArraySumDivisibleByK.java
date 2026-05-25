// Last updated: 5/25/2026, 7:07:07 PM
class Solution {
    public int minOperations(int[] nums, int k) {
        int sum=0;
        for(int num:nums){
            sum+=num;
        }
        return sum%k;
    }
}