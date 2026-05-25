// Last updated: 5/25/2026, 7:21:52 PM
class Solution {
    public int maxProfit(int[] p) {
        int min = Integer.MAX_VALUE;
        int max = 0;
        for(int i=0;i<p.length;i++){
            if(min>p[i]){
                min = p[i];
            }else if(p[i]-min>max){
                max=p[i]-min;
            }
        }
        return max;
    }
}