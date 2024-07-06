class Solution {
    public List<List<String>> solveNQueens(int n) {
        char[][]board=new char[n][n];
        List<String>ls=new ArrayList<>();
        List<List<String>>ls1=new ArrayList<>();
        int[]count=new int[1];
        solve(board,n,0,ls,ls1,count);
        System.out.println(count[0]);
        return ls1;
    }
    public void solve(char[][]board,int n,int row,List<String>ls1,List<List<String>>ls,int[]count){
        if(row==n){
            count[0]++;
       String r="";
       ls1.clear();
            for(int i=0;i<n;i++){
                r="";
                for(int j=0;j<n;j++){
                    if(board[i][j]!='Q')r+=".";
                    else r+="Q";
                }
                ls1.add(r);
                // System.out.println();
            }
            ls.add(new ArrayList<>(ls1));
            // System.out.println();
            return;
        }
        for(int col=0;col<n;col++){
            if(board[row][col]!='Q'){
                if(isSafe(board,row,col,n)){
                    board[row][col]='Q';
                    solve(board,n,row+1,ls1,ls,count);
                    board[row][col]='.';
                } 
            }
        }
    }
    private static boolean isSafe(char[][] board, int row, int col,int n) {
int r=row;
int c=col;
for(int i=0;i<n;i++){
    if(board[row][i]=='Q')return false;
}
for(int j=0;j<n;j++){
    if(board[j][c]=='Q')return false;
}
for(int i=r,j=c;i<n && j<n;i++,j++){
    if(board[i][j]=='Q')return false;
}
for(int i=r,j=c;i>=0 && j>=0;i--,j--){
    if(board[i][j]=='Q')return false;
}
for(int i=r,j=c;i>=0 && j<n;i--,j++){
    if(board[i][j]=='Q')return false;
}
for(int i=r,j=c;i<n && j>=0;i++,j--){
    if(board[i][j]=='Q')return false;
}
return true;
	}

	}