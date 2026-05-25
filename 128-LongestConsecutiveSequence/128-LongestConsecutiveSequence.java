// Last updated: 5/25/2026, 7:21:47 PM
class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> h = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            h.add(nums[i]);
        }
        int maxlen = 0;
        for (int num : h) {
            if (!h.contains(num - 1)) {
                int len = 1;
                int curr = num;
                while (h.contains(curr + 1)) {
                    len++;
                    curr++;
                }
                maxlen = Math.max(len, maxlen);
            }
        }
        return maxlen;
    }
}