// Last updated: 5/25/2026, 7:10:08 PM
class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        Map<Integer, Integer> hm = new HashMap<>();
        for (int n : nums) {
            hm.put(n, hm.getOrDefault(n, 0) + 1);
        }
        List<List<Integer>> res = new ArrayList<>();
        for (int key : hm.keySet()) {
            int freq = hm.get(key);
            for (int i = 0; i < freq; i++) {
                if (res.size() <= i) {
                    res.add(new ArrayList<>());
                }
                res.get(i).add(key);
            }
        }
        return res;
    }
}
