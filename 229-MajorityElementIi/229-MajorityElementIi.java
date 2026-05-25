// Last updated: 5/25/2026, 7:20:32 PM
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        List<Integer> l = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        }
        int lim = nums.length/3;
        for(Map.Entry<Integer,Integer> i:hm.entrySet()){
            if(i.getValue()>lim){
                l.add(i.getKey());
            }
        }
        return l;
    }
}