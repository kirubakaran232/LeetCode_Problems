// Last updated: 5/25/2026, 7:06:43 PM
class Solution {
    public int[] maxKDistinct(int[] nums, int k) {
        HashSet<Integer> h = new HashSet<>();
        for(int i:nums){
            h.add(i);
        }
        ArrayList<Integer> l = new ArrayList<>(h);
        Collections.sort(l);
        int n = h.size();
        int ans[] = new int[Math.min(k,n)];
        for(int i=0;i<ans.length;i++){
            ans[i]=l.get(n-1);
            n--;
        }
        return ans;
    }
}