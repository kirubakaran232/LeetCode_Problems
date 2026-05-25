// Last updated: 5/25/2026, 7:23:09 PM
class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        backtrack(res,new ArrayList<>(),nums);
        return res;
    }
    public void backtrack(List<List<Integer>> res,List<Integer> l,int nums[]){
        if(l.size()==nums.length) res.add(new ArrayList<>(l));
        else{
            for(int i=0;i<nums.length;i++){
                if(l.contains(nums[i])) continue;
                l.add(nums[i]);
                backtrack(res,l,nums);
                l.remove(l.size()-1);
            }
        }
    }
}