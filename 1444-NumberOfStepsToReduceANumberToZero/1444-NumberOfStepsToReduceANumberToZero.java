// Last updated: 5/25/2026, 7:15:44 PM
class Solution {
    public int numberOfSteps(int num) {
        int count =0;
        while(num!=0){
            if(num%2==0){
                num=num/2;
                count++;
            }
            else{
                num=num-1;
                count++;
            }
            
        }
        return count;
    }
}