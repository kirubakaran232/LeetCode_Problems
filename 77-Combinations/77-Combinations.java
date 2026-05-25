// Last updated: 5/25/2026, 7:22:30 PM
class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> l = new ArrayList<>();
        backtrack(1,res,l,n,k);
        return res;
    }
    public void backtrack(int st,List<List<Integer>> res,List<Integer> l,int n,int k){
        if(l.size()==k){
            res.add(new ArrayList<>(l));
            return;
        }
        for(int i=st;i<=n;i++){
            l.add(i);
            backtrack(i+1,res,l,n,k);
            l.remove(l.size()-1);
        }
    }
}