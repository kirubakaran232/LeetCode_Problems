// Last updated: 5/25/2026, 7:10:53 PM
class Solution {
    public int countDistinctIntegers(int[] nums) {
        Set<Integer> s = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            s.add(nums[i]);
        }
        for(int i=0;i<nums.length;i++){
            int rev = 0;
            int temp = nums[i];
            while(temp>0){
                rev=rev*10+temp%10;
                temp/=10;
            }
            s.add(rev);
        }
        return s.size();
    }
}