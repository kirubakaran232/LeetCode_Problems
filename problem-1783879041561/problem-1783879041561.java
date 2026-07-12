// Last updated: 7/12/2026, 11:27:21 PM
1class Solution {
2    public String licenseKeyFormatting(String str, int k) {
3        String temp="",ans="";
4        for(int i=str.length()-1;i>=0;i--){
5            char ch=str.charAt(i);
6            if(ch!='-')
7                temp=temp+Character.toUpperCase(ch);
8        }
9        int c=k;
10        for(int i=0;i<temp.length();i++){
11            char ch=temp.charAt(i);
12            if(c==0){
13                c=k;
14                ans='-'+ans;
15            }
16            ans=ch+ans;
17            c--;
18        }
19        return ans;
20    }
21}