// Last updated: 5/25/2026, 7:07:02 PM
class Solution {
    public int maxProduct(int n) {
        ArrayList<Integer> l = new ArrayList<>();
        int dig = 0;
        while(n>0){
            dig = n%10;
            l.add(dig);
            n=n/10;
        }
        Collections.sort(l);
        int len = l.size();
        return l.get(len-1)*l.get(len-2);
    }
}