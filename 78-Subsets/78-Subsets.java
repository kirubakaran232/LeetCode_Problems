// Last updated: 5/25/2026, 7:22:28 PM
class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        backtrack(nums, 0, new ArrayList<>(), res);
        return res;
    }
    private void backtrack(int[] nums, int ind, List<Integer> curr, List<List<Integer>> res) {
        if (ind == nums.length) {
            res.add(new ArrayList<>(curr));
            return;
        }
        curr.add(nums[ind]);
        backtrack(nums, ind + 1, curr, res);
        curr.remove(curr.size() - 1);
        backtrack(nums, ind + 1, curr, res);
    }
}
