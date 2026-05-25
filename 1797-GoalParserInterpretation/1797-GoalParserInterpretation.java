// Last updated: 5/25/2026, 7:14:06 PM
class Solution {
    public String interpret(String command) {
	StringBuilder S = new StringBuilder(command.length());
	for(int i = 0 ; i < command.length() ; i++){
		if(command.charAt(i)=='G') S.append('G');
		if(command.charAt(i)=='('){
			if(command.charAt(i+1)==')') {S.append('o'); i++;}
			else{S.append("al"); i = i + 3;}
		}
	}
	return S.toString();
}
}