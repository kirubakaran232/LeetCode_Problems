// Last updated: 5/25/2026, 7:15:09 PM
class Solution {
    public int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        int n = endTime.length;
        int count = 0;
        for(int i=0;i<n;i++){
            if(startTime[i]<=queryTime && endTime[i]>=queryTime){
                count++;
            }
        }
        return count;
    }
}