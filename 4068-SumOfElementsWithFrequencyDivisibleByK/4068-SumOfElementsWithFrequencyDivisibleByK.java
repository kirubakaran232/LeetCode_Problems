// Last updated: 5/25/2026, 7:06:34 PM
class Solution {
    public int sumDivisibleByK(int[] nums, int k) {
        Map<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        }
        int sum = 0;
        for(Map.Entry<Integer,Integer> n:hm.entrySet()){
            if(n.getValue()%k==0){
                for(int i=0;i<n.getValue();i++){
                    sum+=n.getKey();
                }
            }
        }
        return sum;
    }
}