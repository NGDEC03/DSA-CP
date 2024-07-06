class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>>ls=new ArrayList<>();
        List<Integer>ls1=new ArrayList<>();
        solve(ls,ls1,candidates,target,0);
        return ls;
    }
    public void solve(List<List<Integer>>ls ,List<Integer>ls1 ,int[]candidates ,int target ,int lp){
if(target==0){
    ls.add(new ArrayList<>(ls1));
    return;
}
if(target<0)return;
for(int i=lp;i<candidates.length;i++){
    ls1.add(candidates[i]);
    solve(ls,ls1,candidates,target-candidates[i],i);
    ls1.remove(Integer.valueOf(candidates[i]));
}
    }
}