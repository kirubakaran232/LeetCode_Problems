// Last updated: 5/25/2026, 7:13:15 PM
class Solution {
    public String sortSentence(String s) {
        String words[] = s.split("\\s+");
        String[] result = new String[words.length];
        for(String i:words){
            int pos = i.charAt(i.length()-1)-'0';
            result[pos-1]=i.substring(0,i.length()-1);
        }
        return String.join(" ",result);
    }
}