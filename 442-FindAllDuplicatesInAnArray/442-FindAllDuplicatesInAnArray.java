// Last updated: 5/25/2026, 7:19:19 PM
class Solution {
    public List<Integer> findDuplicates(int[] nums) {
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
                l.add(nums[j]);
            }
        }
        return l;
    }
}

//  [1,2,3,4,3,2,7,8]
