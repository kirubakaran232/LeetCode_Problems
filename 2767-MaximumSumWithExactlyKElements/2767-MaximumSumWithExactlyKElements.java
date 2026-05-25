// Last updated: 5/25/2026, 7:09:58 PM
class Solution {
    public int maximizeSum(int[] nums, int k) {
        Arrays.sort(nums);
        int sum=0;
        for(int i=0;i<k;i++){
            sum+=nums[nums.length-1];
            nums[nums.length-1]+=1;
        }
        return sum;
    }
}