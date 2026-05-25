// Last updated: 5/25/2026, 7:10:36 PM
class Solution {
    public int countDigits(int num) {
       int count=0;
       int val=num;
        while(num>0){
            int temp=num%10;
            if(val%temp==0)count++;
            num=num/10;
        }
       return count; 
    }
}