// Last updated: 5/25/2026, 7:12:39 PM
class Solution {
    public int numOfPairs(String[] nums, String target) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i != j && nums[i].concat(nums[j]).equals(target)) {
                    count++;
                }
            }
        }
        return count;
    }
}