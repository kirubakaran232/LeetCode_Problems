// Last updated: 8/28/2026, 11:53:39 AM
1class Solution {
2    public String shiftingLetters(String s, int[] sh) {
3        char ch[] = s.toCharArray();
4        long c = 0;
5        for(int i=s.length()-1;i>=0;i--){
6            c+=sh[i];
7            ch[i] = (char)('a'+(ch[i]-'a' + c)%26);
8        }
9        return new String(ch);
10    }
11}
12
13