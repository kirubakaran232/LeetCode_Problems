// Last updated: 5/25/2026, 7:11:13 PM
class Solution {
    public int garbageCollection(String[] gar, int[] t) {
        int g = 0, p = 0, m = 0;
        int sum = 0;
        for (int i = 0; i < gar.length; i++) {
            String s = gar[i];
            for (char c : s.toCharArray()) {
                sum++;
                if (c == 'G') g = i;
                else if (c == 'P') p = i;
                else if (c == 'M') m = i;
            }
        }
        for (int i = 0; i < g; i++) sum += t[i];
        for (int i = 0; i < p; i++) sum += t[i];
        for (int i = 0; i < m; i++) sum += t[i];
        return sum;
    }
}
