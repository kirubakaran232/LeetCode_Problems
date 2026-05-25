// Last updated: 5/25/2026, 7:08:46 PM
class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        Arrays.sort(capacity);
        int sum=0,count=0,csum=0;
        for(int i=0;i<apple.length;i++){
            sum+=apple[i];
        }
        for(int i=capacity.length-1;i>=0;i--){
            csum+=capacity[i];
            if(sum>csum){
                count++;
            }
        }
        return count+1;
    }
}