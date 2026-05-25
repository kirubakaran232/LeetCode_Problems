// Last updated: 5/25/2026, 7:15:22 PM
class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> l = new ArrayList<>();
        int tar[] = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            l.add(index[i],nums[i]);
        }
        for(int i=0;i<nums.length;i++){
            tar[i]=l.get(i);
        }
        return tar;
    }
}