// Last updated: 8/22/2026, 11:59:15 AM
1class Solution {
2    public int maximumGap(String sk, String st) {
3        int f[] = new int[sk.length()];
4        int l[] = new int[sk.length()];
5        int idx=0;
6        for(int i=0;i<sk.length();i++){
7            while(idx<st.length()){
8                if(sk.charAt(i)==st.charAt(idx)){
9                    f[i] = idx;
10                    idx++;
11                    break;
12                }
13                idx++;
14            }
15        }
16        int ind = st.length()-1;
17        for(int i=sk.length()-1;i>=0;i--){
18            while(ind>=0){
19                if(sk.charAt(i)==st.charAt(ind)){
20                    l[i] = ind;
21                    ind--;
22                    break;
23                }
24                ind--;
25            }
26        }
27        int max = 0;
28        for(int i=0;i<sk.length()-1;i++){
29            int gap = l[i+1] - f[i];
30            max = Math.max(max,gap);
31        }
32        return max;
33    }
34}