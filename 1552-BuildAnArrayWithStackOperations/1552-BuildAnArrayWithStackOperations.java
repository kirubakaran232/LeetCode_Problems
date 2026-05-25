// Last updated: 5/25/2026, 7:15:11 PM
class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> ans = new ArrayList<String>();
        int curr =1;
        for(int i =0;i<target.length;i++){
            while(curr<target[i]){
                ans.add("Push");
                ans.add("Pop");
                curr++;
            }
            ans.add("Push");
            curr++;
        }
        return ans;
    }
}