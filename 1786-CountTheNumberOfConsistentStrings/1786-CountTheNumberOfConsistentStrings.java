// Last updated: 5/25/2026, 7:14:11 PM
class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int count=0;
        for(int j=0;j<words.length;j++){
            for(int i=0;i<allowed.length();i++){
                words[j]=words[j].replace(String.valueOf(allowed.charAt(i)),"");
            }
            if(words[j].equals("")){
                count++;
            }
        }
        return count;
    }
}