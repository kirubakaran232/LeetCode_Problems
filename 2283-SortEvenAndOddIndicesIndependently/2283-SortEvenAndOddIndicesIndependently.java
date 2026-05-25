// Last updated: 5/25/2026, 7:11:54 PM
class Solution {
    public int[] sortEvenOdd(int[] nums) {
        List<Integer> even = new ArrayList<>();
        List<Integer> odd = new ArrayList<>(); 

        for(int i=0;i<nums.length;i++){
            if(i%2==0){
                even.add(nums[i]);
            }
            else{
                odd.add(nums[i]);
            }
        }
        Collections.sort(even);
        Collections.sort(odd,Collections.reverseOrder());

        int ei=0,oi=0;
        for(int i=0;i<nums.length;i++){
            if(i%2==0){
                nums[i]=even.get(ei++);
            }
            else{
                nums[i]=odd.get(oi++);
            }
        }
        return nums;
    }
}