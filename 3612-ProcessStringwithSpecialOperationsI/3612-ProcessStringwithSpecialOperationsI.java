// Last updated: 6/16/2026, 9:17:00 AM
1class Solution {
2    public String processStr(String s) {
3        StringBuilder sb = new StringBuilder();
4        for(int i=0;i<s.length();i++){
5            char ch = s.charAt(i);
6            if(ch>='a' && ch<='z'){
7                sb.append(ch);
8            }else if(ch=='*' && sb.length()>0){
9                sb.deleteCharAt(sb.length()-1);
10            }else if(ch=='#'){
11                sb.append(sb.toString());
12            }else{
13                sb.reverse();
14            }
15        }
16        return sb.toString();
17    }
18}