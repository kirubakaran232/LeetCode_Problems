// Last updated: 5/25/2026, 7:18:17 PM
class Solution {
    public boolean isOneBitCharacter(int[] bits) {
        for(int i = 0; i < bits.length; i++) {
            if(i == bits.length - 1) return true;
            if(bits[i] == 1) i++;
        }
        return false;
    }
}