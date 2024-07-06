class Solution {
    public List<Integer> lexicalOrder(int n) {
       
       ArrayList<Integer>ls=new ArrayList<>();
     solve(n,0,ls);
        ls.remove(0);
        return ls;
    }
    public static void solve(int n,int ans,ArrayList<Integer>ls){
        if(ans>n){
            return;
        }
        int i=0;
        if(ans==0)i=1;
        if(ans<=n ) {ls.add(ans);}
        for(;i<=9;i++){
            solve(n,ans*10+i,ls);
        }
    }
}

    