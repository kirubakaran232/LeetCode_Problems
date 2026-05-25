// Last updated: 5/25/2026, 7:17:08 PM
class Solution {
    public int bitwiseComplement(int n) {
        String str = Integer.toBinaryString(n);
        String res = "";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) == '0'){
                res += '1';
            }
            else{
                res += '0';
            }
        }
        return Integer.parseInt(res,2);
    }
}