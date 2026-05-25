// Last updated: 5/25/2026, 7:18:14 PM
class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> l = new ArrayList<>();
        for(int i=left;i<=right;i++){
            int n=i;
            boolean div = true;
            while(n>0){
                int d=n%10;
                if(d==0||i%d!=0){
                    div = false;
                    break;
                }
                n=n/10;
            }
            if(div){
                l.add(i);
            }
        }
        return l;
    }
}