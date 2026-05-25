// Last updated: 5/25/2026, 7:14:44 PM
class Solution {
    public int numSplits(String s) {
        Map<Character,Integer> l = new HashMap<>();
        Map<Character,Integer> r = new HashMap<>();
        int c = 0;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            r.put(ch,r.getOrDefault(ch,0)+1);
        }
        for(int i=0;i<s.length()-1;i++){
            char ch = s.charAt(i);
            l.put(ch,l.getOrDefault(ch,0)+1);
            r.put(ch,r.get(ch)-1);
            if(r.get(ch)==0) r.remove(ch);
            if(l.size()==r.size()){
                c++;
            }
        }
        return c;
    }
}