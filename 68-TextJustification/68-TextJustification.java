// Last updated: 5/26/2026, 7:11:48 PM
1class Solution {
2    public List<String> fullJustify(String[] words, int maxW) {
3        ArrayList<String> l = new ArrayList<>();
4        int ind = 0,len = 0;
5        for(int i=0;i<=words.length;i++){
6            if(i<words.length && len+words[i].length()+(i-ind)<=maxW){
7                len+=words[i].length();
8            }else{
9                StringBuilder sb = new StringBuilder();
10                int sp = (i-ind) - 1;
11                int ex = maxW - len;
12                if(i==words.length || sp==0){
13                    for(int j=ind;j<i;j++){
14                        sb.append(words[j]);
15                        if (j < i - 1) {
16                            sb.append(" ");
17                            ex--;
18                        }
19                    }
20                    while(ex>0){
21                        sb.append(" ");
22                        ex--;
23                    }
24                }else{
25                    int eq = ex/sp;
26                    int more = ex%sp;
27                    for(int j=ind;j<i;j++){
28                        sb.append(words[j]);
29                        if(j<i-1){
30                            for(int k=0;k<eq;k++){
31                                sb.append(" ");
32                            }
33                            if(more>0){
34                                sb.append(" ");
35                                more--;
36                            }
37                        }                    
38                    }
39                }
40                l.add(sb.toString());
41                len = 0;
42                ind = i;
43                if (i < words.length) {
44                    i--;
45                }
46            }
47        }
48        return l;
49    }
50}