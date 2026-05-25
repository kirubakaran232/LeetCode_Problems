// Last updated: 5/25/2026, 7:23:02 PM
class Solution {
    public boolean isSafe(int n,char[][] board,int row,int col){
        for(int i=0;i<n;i++){
            if(board[i][col]=='Q')
            return false;
        }
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--){
            if(board[i][j]=='Q')
            return false;
        }
        for(int i = row - 1, j = col + 1; i >= 0 && j < n; i--, j++){
            if(board[i][j]=='Q')
            return false;
        }
        return true;
    }
    public void backtrack(int n,int row,List<List<String>> res,char[][] board){
        if(row==n){
            ArrayList<String> l = new ArrayList<>();
            for(char[] r:board){
                l.add(new String(r));
            }
            res.add(l);
            return;
        }
        for(int col=0;col<n;col++){
            if(isSafe(n,board,row,col)){
                board[row][col] = 'Q';
                backtrack(n,row+1,res,board);
                board[row][col] = '.';
            }
        }
    }
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> res = new ArrayList<>();
        char[][] board = new char[n][n];
        for(int i=0;i<n;i++){
            Arrays.fill(board[i],'.');
        }
        backtrack(n,0,res,board);
        return res;
    }
}