// Last updated: 5/25/2026, 7:08:00 PM
class Solution {
    public int[] resultsArray(int[] nums, int k) {
        ArrayList<Integer> l = new ArrayList<>();
        for (int i = 0; i <= nums.length - k; i++) {
            l.add(isSorted(nums, i, i + k - 1));
        }
        int res[] = new int[l.size()];
        for (int i = 0; i < l.size(); i++)
            res[i] = l.get(i);
        return res;
    }
    public int isSorted(int nums[], int l, int r) {
        int max = nums[l];
        for (int i = l + 1; i <= r; i++) {
            max = Math.max(nums[i], max);
            if (nums[i] != nums[i - 1] + 1)
                return -1;
        }
        return max;
    }
}