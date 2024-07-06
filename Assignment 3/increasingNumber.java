class Solution {
    public static ArrayList<Integer> increasingNumbers(int n) {
       ArrayList<Integer>ls=new ArrayList<>();
       solve(n,"",ls,-1);
       return ls;
    }
    static void solve(int n,String ans,ArrayList<Integer>ls,int prev){
        if(n==0){
            if(ans.length()!=1 && ans.charAt(0)=='0')return;
            ls.add(Integer.parseInt(ans));
            return;
        }
        for(int i=prev+1;i<10;i++){
            solve(n-1,ans+i,ls,i);
        }
    }
}