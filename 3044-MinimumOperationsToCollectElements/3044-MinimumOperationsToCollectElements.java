// Last updated: 5/25/2026, 7:09:22 PM
class Solution {
    public int minOperations(List<Integer> nums, int k) {
        int count=0;
        Set<Integer> l = new HashSet<>();
        for(int i=nums.size()-1;i>=0;i--){
            count++;
            if(nums.get(i)<=k){
                l.add(nums.get(i));
            }
            if(l.size()==k){
                break;
            }
        }
        return count;
    }
}