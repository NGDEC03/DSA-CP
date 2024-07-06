class Solution {
    public void solveSudoku(char[][] board) {
        solve(board);
    }
    public static boolean solve(char[][]board){
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                if(board[i][j]=='.'){
                    for(int i1=1;i1<10;i1++){
                        if(isValidMove((char)(i1+48),board,i,j)){
                            board[i][j]=(char)(i1+48);
                            if(solve(board))return true;
                            board[i][j]='.';
                        }
                    }
                    return false;
                }
               
            }

        }
        return true;
}
 public static boolean isValidMove(char digit,char[][]board,int row,int col){
        for(int i=0;i<9;i++){
            if(board[row][i]==digit)return false;
        }
        for(int j=0;j<9;j++){
            if(board[j][col]==digit)return false;
        }
        int srow=(row/3)*3;
        int scol=(col/3)*3;
        for(int m=srow;m<srow+3;m++){
            for(int n=scol;n<scol+3;n++){
                if(board[m][n]==digit)return false;
            }
        }
        return true;
    }
}