// Last updated: 7/13/2026, 12:00:25 AM
1public class Solution {
2    static boolean[][] visited;
3    public boolean exist(char[][] board, String word) {
4        visited = new boolean[board.length][board[0].length];
5        for(int i = 0; i < board.length; i++){
6            for(int j = 0; j < board[i].length; j++){
7                if((word.charAt(0) == board[i][j]) && search(board, word, i, j, 0)){
8                    return true;
9                }
10            }
11        }
12        return false;
13    }
14    private boolean search(char[][]board, String word, int i, int j, int index){
15        if(index == word.length()){
16            return true;
17        }
18        if(i >= board.length || i < 0 || j >= board[i].length || j < 0 || board[i][j] != word.charAt(index) || visited[i][j]){
19            return false;
20        }
21        visited[i][j] = true;
22        if(search(board, word, i-1, j, index+1) || 
23           search(board, word, i+1, j, index+1) ||
24           search(board, word, i, j-1, index+1) || 
25           search(board, word, i, j+1, index+1)){
26            return true;
27        }
28        visited[i][j] = false;
29        return false;
30    }
31}