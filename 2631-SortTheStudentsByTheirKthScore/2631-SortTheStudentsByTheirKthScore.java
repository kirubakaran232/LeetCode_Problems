// Last updated: 5/25/2026, 7:10:29 PM
class Solution {
    public int[][] sortTheStudents(int[][] score, int k) {
        Arrays.sort(score,(a,b)-> b[k] - a[k]);
        return score;
    }
}