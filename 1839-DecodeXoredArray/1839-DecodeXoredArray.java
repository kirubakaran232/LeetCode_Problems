// Last updated: 5/25/2026, 7:13:49 PM
class Solution {
    public int[] decode(int[] encoded, int first) {
        int[] num = new int[encoded.length + 1];
        num[0] = first;
        for (int i = 0; i < encoded.length; i++) {
            num[i + 1] = encoded[i] ^ num[i];
        }
        return num;
    }
}