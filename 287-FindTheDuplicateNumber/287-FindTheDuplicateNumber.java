// Last updated: 5/25/2026, 7:20:04 PM
class Solution {
    public int findDuplicate(int[] nums) {
        Set<Integer> a = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(!a.add(nums[i]))
            return nums[i];
        }
        return -1;
    }
}