// Last updated: 5/25/2026, 7:09:32 PM
class Solution {
    public String finalString(String s) {
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!='i'){
                sb.append(s.charAt(i));
            }
            else{
                sb.reverse();
            }
        }
        return sb.toString();
    }
}