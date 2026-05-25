// Last updated: 5/25/2026, 7:08:12 PM
import java.util.*;

class Solution {
    public double minimumAverage(int[] nums) {
        Arrays.sort(nums);
        int left = 0;
        int right = nums.length - 1;
        double minAvg = Double.MAX_VALUE; 
        while (left < right) {
            double avg = (nums[left] + nums[right]) / 2.0;
            minAvg = Math.min(minAvg, avg);
            left++;
            right--;
        }
        return minAvg;
    }
}
