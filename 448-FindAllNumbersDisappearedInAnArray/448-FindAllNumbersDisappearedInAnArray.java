// Last updated: 5/25/2026, 7:19:16 PM
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList<Integer> l = new ArrayList<>();
        int i = 0;
        while(i<nums.length){
            int ind = nums[i]-1;
            if(nums[i]!=nums[ind]){
                int temp = nums[i];
                nums[i] = nums[ind];
                nums[ind] = temp;
            }else{
                i++;
            }
        }
        for(int j=0;j<nums.length;j++){
            if(nums[j]!=j+1){
                l.add(j+1);
            }
        }
        return l;
    }
}