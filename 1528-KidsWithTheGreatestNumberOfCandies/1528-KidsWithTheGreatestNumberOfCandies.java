// Last updated: 5/25/2026, 7:15:18 PM
import java.util.*;

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int n = candies.length;
        List<Boolean> result = new ArrayList<>();
        int maxCandies = 0;
        for (int i = 0; i < n; i++) {
            if (candies[i] > maxCandies) {
                maxCandies = candies[i];
            }
        }
        for (int i = 0; i < n; i++) {
            int sum = candies[i] + extraCandies;
            if (sum >= maxCandies) {
                result.add(true);
            } else {
                result.add(false);
            }
        }
        return result;
    }
}
