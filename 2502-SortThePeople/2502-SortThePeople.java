// Last updated: 5/25/2026, 7:11:02 PM
class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        HashMap<Integer, String> m = new HashMap<>();
        for(int i=0;i<heights.length;i++){
            m.put(heights[i],names[i]);
        }
        Arrays.sort(heights);
        String[] res = new String[names.length];
        int ind =0;
        for(int i=names.length-1;i>=0;i--){
            res[ind]=m.get(heights[i]);
            ind++;
        }
        return res;
    }
}