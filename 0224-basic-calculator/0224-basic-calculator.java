class Solution {
    public int calculate(String s) {
        int res = 0;
        int num = 0;
        int sign = 1;
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(Character.isDigit(ch)){
                num = num*10+(ch-'0');
            }else if(ch=='+'){
                res = res + sign * num;
                sign = 1;
                num = 0;
            }else if(ch=='-'){
                res = res + sign * num;
                sign = -1;
                num = 0;
            }else if(ch=='('){
                st.push(res);
                st.push(sign);
                res = 0;
                sign = 1;
            }else if(ch==')'){
                res = res + sign *num;
                num = 0;
                res = res*st.pop();
                res = res+st.pop();
            }
        }
        res = res + sign * num;
        return res;
    }
}