// Last updated: 5/25/2026, 7:07:38 PM
class Solution {
    public int countPartitions(int[] nums) {
        int total = 0;
        for (int num : nums) {
            total += num; 
        }
        int leftSum = 0;
        int count = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            leftSum += nums[i];
            int rightSum = total - leftSum;
            int res = leftSum - rightSum;
            if (res % 2 == 0) {
                count++;
            }
        }
        return count;
    }
}
