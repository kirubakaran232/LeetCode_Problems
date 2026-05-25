// Last updated: 5/25/2026, 7:07:00 PM
class Solution {
    public int smallestIndex(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int temp = nums[i];
            int sumOfDigits = 0;
            while (temp > 0) {
                sumOfDigits += temp % 10;
                temp /= 10;
            }
            if (sumOfDigits == i) 
                return i;
        }
        return -1;
    }
}