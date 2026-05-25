// Last updated: 5/25/2026, 7:08:26 PM
class Solution {
    public int countCompleteDayPairs(int[] hours) {
        int count = 0;
        for (int i = 0; i < hours.length; i++) {
            for (int j = i + 1; j < hours.length; j++) {
                int day = hours[i] + hours[j];
                if (day % 24 == 0) {
                    count++;
                }
            }
        }
        return count;
    }
}
