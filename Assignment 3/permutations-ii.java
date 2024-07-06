class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>>ls=new ArrayList<>();
      List<Integer>ls1=new ArrayList<>();
      solve(ls,ls1,nums);
      return ls;
    }
    public void solve(List<List<Integer>>ls,List<Integer>ls1,int[]nums){
if(ls1.size()==nums.length){
    if(!ls.contains(ls1))ls.add(new ArrayList<>(ls1));
    return;
}
boolean flag=false;
for(int i=0;i<nums.length;i++){
    if(i!=nums.length-1)flag=checkNum(nums,nums[i],i);
    else flag=true;
    if(nums[i]!='*' && flag){
        int temp=nums[i];
        ls1.add(nums[i]);
        nums[i]='*';
        solve(ls,ls1,nums);
    ls1.remove(ls1.size()-1);
    nums[i]=temp;
    }
}
    }
public boolean checkNum(int[]nums,int num,int i){
    for(int i1=i+1;i<nums.length;i++){
        if(nums[i1]==nums[i])return false;
    }
    return true;
}
}