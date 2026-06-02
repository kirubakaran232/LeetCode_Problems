// Last updated: 6/2/2026, 10:28:20 PM
1class Solution {
2    public int search(int[] nums, int target) {
3        int left = 0, right = nums.length - 1;
4        while(left <= right) {
5            int mid = (left + right) / 2;
6            if(nums[mid] == target)
7                return mid;
8            if(nums[left] <= nums[mid]) {
9                if(target >= nums[left] && target < nums[mid])
10                    right = mid - 1;
11                else
12                    left = mid + 1;
13            } else {
14                if(target > nums[mid] && target <= nums[right])
15                    left = mid + 1;
16                else
17                    right = mid - 1;
18            }
19        }
20        return -1;
21    }
22}
23