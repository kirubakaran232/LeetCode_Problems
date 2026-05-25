// Last updated: 5/25/2026, 7:12:17 PM
class Solution {
    public int mostWordsFound(String[] sentences) {
        int max =0;
        for(int i=0;i<sentences.length;i++){
            int cmax=sentences[i].split(" ").length;
            if(cmax>max){
                max=cmax;
            }
        }
        return max;

    }
}