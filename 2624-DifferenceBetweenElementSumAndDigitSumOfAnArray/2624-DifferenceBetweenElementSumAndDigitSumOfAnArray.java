// Last updated: 5/25/2026, 7:10:32 PM
class Solution {
    public int differenceOfSum(int[] nums) {
        int esum = 0;
        int dsum = 0;
        for (int i = 0; i < nums.length; i++) {
            esum += nums[i];
            int temp = nums[i];
            while (temp > 0) {
                dsum += temp % 10;
                temp /= 10;
            }
        }
        return Math.abs(esum - dsum);
    }
}
