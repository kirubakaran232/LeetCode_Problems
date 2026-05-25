// Last updated: 5/25/2026, 7:11:38 PM
class Solution {
    public int percentageLetter(String s, char letter) {
        int count = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==letter) count++;
        }
        return (count*100)/s.length();
    }
}