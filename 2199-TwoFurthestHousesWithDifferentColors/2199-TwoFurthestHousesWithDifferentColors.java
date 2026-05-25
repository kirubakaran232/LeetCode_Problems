// Last updated: 5/25/2026, 7:12:23 PM
class Solution {
    public int maxDistance(int[] colors) {
        int l = colors.length;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < l - 1; i++) {
            for (int j = i + 1; j < l; j++) {
                if (colors[i] != colors[j]) {
                    max = Math.max(max, Math.abs(i - j));
                }
            }
        }
        return max;
    }
}