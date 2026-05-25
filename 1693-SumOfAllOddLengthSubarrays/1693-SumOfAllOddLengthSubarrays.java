// Last updated: 5/25/2026, 7:14:26 PM
class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int n = arr.length;
        int total = 0;
        for (int i = 0; i < n; i++) {
            int totalSubarrays = (i + 1) * (n - i);
            int oddSubarrays = (totalSubarrays + 1) / 2; 
            total += arr[i] * oddSubarrays;
        }

        return total;
    }
}
