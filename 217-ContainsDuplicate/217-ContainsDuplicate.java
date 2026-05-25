// Last updated: 5/25/2026, 7:20:41 PM
class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num)) {
                return true; 
            }
            set.add(num);
        }
        return false; 
    }
}
