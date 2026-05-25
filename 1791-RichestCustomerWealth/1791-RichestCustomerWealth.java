// Last updated: 5/25/2026, 7:14:08 PM
class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxsum =0;
        for(int i=0;i<accounts.length;i++){
            int sum =0;
            for(int j=0;j<accounts[i].length;j++){
                sum+=accounts[i][j];
            }
            if(sum>maxsum){
            maxsum=sum;
        }
        }
        return maxsum;
    }
}