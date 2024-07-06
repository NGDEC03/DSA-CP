class Solution {
    public List<String> generateParenthesis(int n) {
        if(n==1){
            return new ArrayList<String>(Arrays.asList("()"));
            }
   ArrayList<String>     ls=new ArrayList<String>();
     solve(n,0,0,"",ls);      
        return ls;
    }
    public void solve(int n,int open,int close,String ans,ArrayList<String>ls){
        if(open==n && close==n){
            ls.add(ans);
            return;
            }
        if(open<n){
            solve(n,open+1,close,ans+'(',ls);
            }
        if(close<open){
            solve(n,open,close+1,ans+')',ls);
            }
        }
}