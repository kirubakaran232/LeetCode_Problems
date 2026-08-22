// Last updated: 8/22/2026, 3:53:55 PM
1class Solution {
2    public String customSortString(String o, String s) {
3        StringBuilder sb = new StringBuilder();
4        int freq[] = new int[26];
5        for(int i=0;i<s.length();i++){
6            freq[s.charAt(i)-'a']++;
7        }
8        for(int i=0;i<o.length();i++){
9            if(freq[o.charAt(i)-'a']!=0){
10                sb.repeat(o.charAt(i),freq[o.charAt(i)-'a']);
11                freq[o.charAt(i)-'a'] = 0;
12            }
13        }
14        for(int i=0;i<26;i++){
15            if(freq[i]!=0)
16            sb.repeat(((char)97+i),freq[i]);
17        }
18        return sb.toString();
19    }
20}