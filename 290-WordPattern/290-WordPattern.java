// Last updated: 5/25/2026, 7:20:02 PM
class Solution {
    public boolean wordPattern(String p, String s) {
        String w[] = s.split("\\s+");
        if(p.length()!=w.length) return false;
        HashMap<Character,String> hm = new HashMap<>();
        for(int i=0;i<p.length();i++){
            if(hm.containsKey(p.charAt(i))){
                if(!(w[i].equals(hm.get(p.charAt(i))))){
                    return false;
                }
            }else{
                if(hm.containsValue(w[i])) return false;
                hm.put(p.charAt(i),w[i]);
            }
        }
        return true;
    }
}