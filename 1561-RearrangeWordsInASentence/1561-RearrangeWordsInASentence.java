// Last updated: 5/25/2026, 7:15:08 PM
class Solution {
    public String arrangeWords(String text) {
        text = text.toLowerCase();
        StringBuilder sb = new StringBuilder();
        String words[] = text.split(" ");
        Arrays.sort(words,(a,b)-> a.length() - b.length());
        for(int i=0;i<words.length;i++){
            if(i==0){
                words[i]=Character.toUpperCase(words[i].charAt(0))+ words[i].substring(1);
                sb.append(words[i]);
            }else{
                sb.append(words[i]);
            }
            sb.append(" ");
        }
        return sb.toString().trim();
    }
}