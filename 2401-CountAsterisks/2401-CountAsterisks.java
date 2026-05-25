// Last updated: 5/25/2026, 7:11:30 PM
class Solution {
    public int countAsterisks(String s) {
        boolean insidePipe = false;
        int count = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '|'){
                insidePipe = !insidePipe;
            }
            if(!insidePipe && s.charAt(i) == '*'){
                count++;
            }
        }
        return count;
    }
}