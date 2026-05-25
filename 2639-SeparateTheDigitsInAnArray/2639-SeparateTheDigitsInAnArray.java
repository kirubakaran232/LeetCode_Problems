// Last updated: 5/25/2026, 7:10:27 PM
class Solution {
    public int[] separateDigits(int[] nums) {
        ArrayList<Integer> a = new ArrayList<>();
        int d;
        for(int i=nums.length-1;i>=0;i--){
            while(nums[i]>0){
                d=nums[i]%10;
                a.add(d);
                nums[i]/=10;
            }
        }
        int ans[] = new int[a.size()];
        for(int i=0;i<ans.length;i++){
            ans[i]=a.get(ans.length-i-1);
        }
        return ans;
    }
}