class Solution {
    public boolean exist(char[][] board, String word) {
    for(int i=0;i<board.length;i++){
        for(int j=0;j<board[0].length;j++){
            // if(word.length()==1 && board[i][j]==word.charAt(0))return true;
            if(board[i][j]==word.charAt(0) && solve(board,i,j,word,0))return true;
        }
    }
    return false;
    }
    public boolean solve(char[][]board,int i,int j,String word,int index){
         if(index>=word.length())return true;
         if(i>=board.length || j>=board[0].length || j<0 || i<0 || board[i][j]=='$')return false;
         if(board[i][j]!=word.charAt(index))return false;
        
         char temp=board[i][j];
         board[i][j]='$';
int[][]directions={{0,1},{1,0},{0,-1},{-1,0}};
for(int[]dir:directions){
    if(solve(board,i+dir[0],j+dir[1],word,index+1))return true;
}
         board[i][j]=temp;
return false;
    }
}