// Last updated: 5/25/2026, 7:12:31 PM
class Solution {
    public int minMovesToSeat(int[] seats, int[] students) {
        Arrays.sort(seats);
        Arrays.sort(students);
        int count =0;
        for(int i=0;i<seats.length;i++){
            count=count+ Math.abs(seats[i]-students[i]);
        }
        return count;
    }
}