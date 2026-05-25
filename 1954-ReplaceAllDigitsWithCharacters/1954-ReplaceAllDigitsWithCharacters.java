// Last updated: 5/25/2026, 7:13:21 PM
class Solution {
    public String replaceDigits(String s) {
        StringBuilder sb = new StringBuilder();
        char last = 0;
        for(char c:s.toCharArray()){
            if(Character.isLetter(c)){
                sb.append(c);
                last = c;
            }else{
                int shift = c -'0';
                sb.append((char)(last+shift));
            }
        }
        return sb.toString();
    }
}