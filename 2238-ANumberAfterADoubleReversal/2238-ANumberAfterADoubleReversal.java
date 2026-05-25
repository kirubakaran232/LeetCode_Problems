// Last updated: 5/25/2026, 7:12:08 PM
class Solution {
    public boolean isSameAfterReversals(int num) {
        if(num==0) return true;
        return num%10!=0;
    }
}