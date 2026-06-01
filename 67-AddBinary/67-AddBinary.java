// Last updated: 6/1/2026, 9:52:25 AM
1class Solution {
2  public String addBinary(String a, String b){
3    StringBuilder sb = new StringBuilder();
4    int carry = 0;
5    int i = a.length() - 1;
6    int j = b.length() - 1;
7    while (i >= 0 || j >= 0 || carry == 1){
8      if(i >= 0)
9        carry += a.charAt(i--) - '0';
10      if(j >= 0)
11        carry += b.charAt(j--) - '0';
12      sb.append(carry % 2);
13      carry /= 2;
14    }
15    return sb.reverse().toString();
16  }
17}