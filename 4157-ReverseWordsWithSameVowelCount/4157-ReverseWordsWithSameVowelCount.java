// Last updated: 5/25/2026, 7:06:25 PM
class Solution {
    public String reverseWords(String s) {
        String words[] = s.split(" ");
        String fw = words[0];
        int c = 0;
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<fw.length();i++){
            if(fw.charAt(i)=='a'||fw.charAt(i)=='e'||fw.charAt(i)=='i'||fw.charAt(i)=='o'||fw.charAt(i)=='u'){
                c++;
            }
        }
        sb.append(fw);
        for(int i=1;i<words.length;i++){
            String w = words[i];
            int v = 0;
            for(int j=0;j<w.length();j++){
                if(w.charAt(j)=='a'||w.charAt(j)=='e'||w.charAt(j)=='i'||w.charAt(j)=='o'||w.charAt(j)=='u'){
                    v++;
                }
            }
            sb.append(" ");
            if(v==c){
                sb.append(new StringBuilder(w).reverse());
            }else{
                sb.append(w);
            }
        }
        return sb.toString();
    }
}