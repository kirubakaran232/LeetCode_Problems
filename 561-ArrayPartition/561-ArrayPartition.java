// Last updated: 5/25/2026, 7:18:43 PM
class Solution {
    public int arrayPairSum(int[] nums) {
        int res = 0;
        Arrays.sort(nums);
        for(int i = 0 ; i < nums.length; i=i+2){
            res = res + nums[i];
        }
        return res;
    }
}