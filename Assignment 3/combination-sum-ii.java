class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>>ls1=new ArrayList<>();
List<Integer>ls=new ArrayList<>();
Arrays.sort(candidates);
solve(candidates,target,ls1,ls,0);
return ls1;
    }
    public void solve(int[]candidates,int target,List<List<Integer>>ls,List<Integer>ls1,int lp){
        if(target==0){
            ls.add(new ArrayList<>(ls1));
            return;
        }
        if(target<0)return;
        for(int i=lp;i<candidates.length;i++){
           if(i!=lp && candidates[i]==candidates[i-1]) {continue;}
           else{
                  ls1.add(candidates[i]);
                  solve(candidates,target-candidates[i],ls,ls1,i+1);
            // System.out.println(ls1);
ls1.remove(Integer.valueOf(candidates[i]));}
        }
    }
}