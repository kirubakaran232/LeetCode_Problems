// Last updated: 5/25/2026, 7:13:04 PM
class Solution {
    public int countTriples(int n) {
        int count = 0;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                int csq =(i*i)+(j*j);
                int c = (int)Math.sqrt(csq);
                if(c*c== csq && c<=n){
                    count++;
                }
            }
        }
        return count;
    }
}