class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>>ls=new ArrayList<>();
        List<Integer>ls1=new ArrayList<>();
        solve(ls,ls1,k,n,0);
        return ls;
    }
    public void solve(List<List<Integer>>ls,List<Integer>ls1,int k,int n,int lp){
if(n==0){
    if(ls1.size()==k)ls.add(new ArrayList<>(ls1));
    return;
}
if(n<0)return;
for(int i=lp+1;i<10;i++){
    ls1.add(i);
    solve(ls,ls1,k,n-i,i);
    ls1.remove(Integer.valueOf(i));
}
    }
}