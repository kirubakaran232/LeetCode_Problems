// Last updated: 5/30/2026, 3:47:04 AM
1class Solution {
2    public int[] searchRange(int[] nums, int target) {
3        int[] res = {-1, -1};
4        for (int i = 0; i < nums.length; i++) {
5            if (nums[i] == target) {
6                if (res[0] == -1) {
7                    res[0] = i;   
8                }
9                res[1] = i;       
10            }
11        }
12        return res;
13    }
14}
15