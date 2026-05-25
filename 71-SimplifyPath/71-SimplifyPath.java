// Last updated: 5/25/2026, 7:22:41 PM
class Solution {
    public String simplifyPath(String path) {
        StringBuilder sb = new StringBuilder();
        String[] w = path.split("/");
        Stack<String> st = new Stack<>();
        for(int i=0;i<w.length;i++){
            if(w[i].equals("") ||w[i].equals(".")) continue;
            if(w[i].equals("..")){
                if(!st.isEmpty()) st.pop();
            }
            else st.push(w[i]);
        }
        for(String i:st){
            sb.append("/").append(i);
        }

        return sb.length()==0 ? "/" : sb.toString();
    }
}