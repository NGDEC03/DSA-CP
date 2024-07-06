class Solution {
    public int totalNQueens(int n) {
        char[][]board=new char[n][n];
        List<String>ls=new ArrayList<>();
        List<List<String>>ls1=new ArrayList<>();
        solve(board,n,0,ls,ls1);
        // System.out.println(ls1);
        return ls1.size();
    }
    public static void solve(char[][]board,int n,int row,List<String>ls,List<List<String>>ls1){
if(row==n){
    ls=new ArrayList<>();
    for(int i=0;i<n;i++){
        String str="";
        for(int j=0;j<n;j++){
            if(board[i][j]=='Q')str+='Q';
            else str+='.';
        }
        ls.add(str);
    }
    ls1.add(ls);
    return;
}
// if(col>=n){
// row+=1;
// col=0;
// }
for(int i=0;i<n;i++){
if(board[row][i]!='Q'){
if(isSafe(board,row,i)){
    board[row][i]='Q';
    solve(board,n,row+1,ls,ls1);
    board[row][i]='.';
}}
}
    }
    public static boolean isSafe(char[][]board,int row,int col){
        int rr=row,cr=col;
        for(int i=0;i<board.length;i++){
            if(board[rr][i]=='Q')return false;
        }
        for(int j=0;j<board.length;j++){
            if(board[j][cr]=='Q')return false;
        }
        for(int c=cr;c<board.length && rr>=0;c++,rr-- ){
            if(board[rr][c]=='Q')return false;
        }
        rr=row;
        for(int c=cr;c<board.length && rr<board.length;c++,rr++){
            if(board[rr][c]=='Q')return false;
        }
        rr=row;
        for(int c=cr;rr<board.length && c>=0;rr++,c--){
            if(board[rr][c]=='Q')return false;
        }
        rr=row;
for(int c=cr;c>=0 && rr>=0;c--,rr--){
    if(board[rr][c]=='Q')return false;
}
return true;
    }
}