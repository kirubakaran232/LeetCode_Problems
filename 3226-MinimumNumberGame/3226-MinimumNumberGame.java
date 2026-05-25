// Last updated: 5/25/2026, 7:08:59 PM
import java.util.Arrays;

class Solution {
    public int[] numberGame(int[] nums) {
        Arrays.sort(nums);
        int[] arr = new int[nums.length];
        int index = 0;
        for (int i = 0; i < nums.length; i += 2) {
            arr[index++] = nums[i + 1]; 
            arr[index++] = nums[i];     
        }

        return arr;
    }
}
