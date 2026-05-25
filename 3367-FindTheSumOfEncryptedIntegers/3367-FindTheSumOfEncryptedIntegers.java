// Last updated: 5/25/2026, 7:08:40 PM
class Solution {
    public int sumOfEncryptedInt(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<10){
                sum+=nums[i];
            }
            else{
                int temp=nums[i];
                int maxdig=0;
                int len = 0;
                while(temp>0){
                    int digit = temp%10;
                    maxdig=Math.max(maxdig,digit);
                    temp/=10;
                    len++;
                }
                int encrypt =0;
                for(int j=0;j<len;j++){
                    encrypt = encrypt*10+maxdig;
                }
                sum+=encrypt;
            }
        }
        return sum;
    }
}