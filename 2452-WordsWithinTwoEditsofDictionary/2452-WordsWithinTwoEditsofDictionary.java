// Last updated: 8/21/2026, 3:53:36 PM
1class Solution {
2    public List<String> twoEditWords(String[] q, String[] d) {
3        List<String> l = new ArrayList<>();
4        for(String s:q){
5            for(String st:d){
6                Boolean b = false;
7                int dif = 0;
8                for(int i=0;i<s.length();i++){
9                    if(s.charAt(i)!=st.charAt(i)) dif++;
10                    if(dif>2){
11                        b = true;
12                        break;
13                    }
14                }
15                if(!b){
16                    l.add(s);
17                    break;
18                }
19            }
20        }
21        return l;
22    }
23}