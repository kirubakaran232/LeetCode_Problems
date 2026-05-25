// Last updated: 5/25/2026, 7:16:39 PM
class Solution {
    public int[] distributeCandies(int candies, int num_people) {
        int[] res = new int[num_people];
        int give = 1;
        int i = 0;
        while (candies > 0) {
            res[i] += Math.min(give, candies);
            candies -= give;
            give++;
            i = (i + 1) % num_people; 
        }
        return res;
    }
}
