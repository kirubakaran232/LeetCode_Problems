// Last updated: 5/25/2026, 7:07:50 PM
class Solution {
    public int minElement(int[] nums) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            int number = nums[i];
            while (number > 0) {
                sum += number % 10;
                number /= 10;
            }
            if (sum < min) {
                min = sum;
            }
        }
        return min;
    }
}
