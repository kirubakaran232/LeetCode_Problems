// Last updated: 5/25/2026, 7:22:32 PM
class Solution {
    public String minWindow(String s, String t) {
        if(s.length()<t.length()) return "";
        Map<Character,Integer> need = new HashMap<>();
        for(int i=0;i<t.length();i++){
            need.put(t.charAt(i),need.getOrDefault(t.charAt(i),0)+1);
        }
        int have = 0;
        int len = Integer.MAX_VALUE;
        int l = 0, st = 0;
        Map<Character,Integer> win = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            win.put(c,win.getOrDefault(c,0)+1);
            if(need.containsKey(c) && win.get(c).intValue() == need.get(c).intValue()){
                have++;
            }
            while(have==need.size()){
                if((i-l+1)<len){
                    len = i-l+1;
                    st = l;
                }
                char leftchar = s.charAt(l);
                win.put(leftchar,win.get(leftchar)-1);
                if(need.containsKey(leftchar) && win.get(leftchar) < need.get(leftchar)){
                    have--;
                }
                l++;
            }
        }
        return len == Integer.MAX_VALUE
                ? ""
                : s.substring(st, st + len);
    }
}