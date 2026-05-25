// Last updated: 5/25/2026, 7:10:20 PM
class Solution {
    public long[] findPrefixScore(int[] nums) {
        int cov[] = new int[nums.length];
        int max = 0;
        for(int i=0;i<nums.length;i++){
            max = Math.max(max,nums[i]);
            cov[i] = nums[i]+max;
        }
        long pre[] = new long[nums.length];
        pre[0] = cov[0];
        for(int i=1;i<nums.length;i++){
            pre[i] = pre[i-1]+cov[i];
        }
        return pre;
    }
}