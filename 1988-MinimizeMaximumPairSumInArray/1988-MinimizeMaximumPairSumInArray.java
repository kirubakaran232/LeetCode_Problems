// Last updated: 5/25/2026, 7:13:12 PM
class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int l = 0,r = nums.length-1,sum=0,max=0;
        while(l<r){
            sum=nums[l]+nums[r];
            max=Math.max(max,sum);
            l++;
            r--;
        }
        return max;
    }
}