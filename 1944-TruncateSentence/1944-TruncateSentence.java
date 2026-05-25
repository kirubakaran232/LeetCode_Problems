// Last updated: 5/25/2026, 7:13:28 PM
class Solution {
    public String truncateSentence(String s, int k) {
        int n = s.length();
        int count = 0;
        int i = 0;
        while(i<n){
            if(s.charAt(i)==' '){
                count++;
                if(count==k) 
                    return s.substring(0,i);
            }
            i++;
        }
        return s;
    }
}