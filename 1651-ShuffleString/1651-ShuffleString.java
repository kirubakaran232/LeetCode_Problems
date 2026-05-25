// Last updated: 5/25/2026, 7:14:37 PM
class Solution {
    public String restoreString(String s, int[] indices) {
        char ch[] = new char[indices.length];
        for(int i=0;i<indices.length;i++){
            ch[indices[i]]=s.charAt(i);
        }
        return new String(ch);
    }
}