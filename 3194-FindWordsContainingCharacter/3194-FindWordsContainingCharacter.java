// Last updated: 5/25/2026, 7:09:10 PM
class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        ArrayList<Integer>al=new ArrayList<>();
        for(int i=0;i<words.length;i++){
            if(words[i].indexOf(x)!=-1){
                al.add(i);
            }
        }
        return al;
    }
}