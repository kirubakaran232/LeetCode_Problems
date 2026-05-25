// Last updated: 5/25/2026, 7:08:08 PM
class Solution {
    public int minimumOperations(int[] nums) {
        int operations = 0;
        for (int num : nums) {
            int remainder = num % 3;
            operations += Math.min(remainder, 3 - remainder);
        }
        return operations;
    }
}