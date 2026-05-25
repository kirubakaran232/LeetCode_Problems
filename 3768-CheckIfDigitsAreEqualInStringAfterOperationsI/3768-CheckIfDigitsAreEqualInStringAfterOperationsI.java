// Last updated: 5/25/2026, 7:07:26 PM
class Solution {
    public boolean hasSameDigits(String s) {
        while (s.length() > 2) {
            StringBuilder next = new StringBuilder();
            char[] arr = s.toCharArray();
            int n = arr.length;
            for (int i = 0; i < n - 1; i++) {
                int sum = (arr[i] - '0' + arr[i + 1] - '0') % 10;
                next.append(sum);
            }
            s = next.toString();
        }
        return s.charAt(0) == s.charAt(1);
    }
}
