// Last updated: 8/21/2026, 3:49:10 PM
1class Solution {
2    public List<String> twoEditWords(String[] q, String[] d) {
3        List<String> l = new ArrayList<>();
4        for(String s:q){
5            for(String st:d){
6                int dif = 0;
7                for(int i=0;i<s.length();i++){
8                    if(s.charAt(i)!=st.charAt(i)) dif++;
9                    if(dif>2){
10                        break;
11                    }
12                }
13                if (dif <= 2) {
14                    l.add(s);
15                    break;
16                }
17            }
18        }
19        return l;
20    }
21}