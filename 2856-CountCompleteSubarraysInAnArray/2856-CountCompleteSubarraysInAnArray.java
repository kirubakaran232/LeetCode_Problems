// Last updated: 5/25/2026, 7:09:41 PM
class Solution {
    public int countCompleteSubarrays(int[] nums) {
        Set<Integer> s = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            s.add(nums[i]);
        }
        int size = s.size();
        int c = 0,r = nums.length;
        for(int i=0;i<nums.length;i++){
            int l = i;
            Set<Integer> res = new HashSet<>();
            while(l<r){
                res.add(nums[l]);
                l++;
                if(res.size()==size) c++;
            }
        }
        return c;
    }
}