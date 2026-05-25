// Last updated: 5/25/2026, 7:22:46 PM
class Solution {
    public int[] plusOne(int[] d) {
        int l=d.length,c=0;
        while(l>0){
            l--;
            if(d[l]==9){
                d[l]=0;
                c=1;
            }else {
                d[l]+=1;
                c=0;
                break;
            }
        }
        if(c==1){
            int[] newArray = new int[d.length + 1];
            newArray[0]=1;
            for (int i = 0; i < d.length; i++) {
                newArray[i + 1] = d[i];
            }
            return newArray;
        }
        return d;
    }
}