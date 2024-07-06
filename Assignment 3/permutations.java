class Solution {
    public List<List<Integer>> permute(int[] nums) {
      List<List<Integer>>ls=new ArrayList<>();
      List<Integer>ls1=new ArrayList<>();
      solve(ls,ls1,nums);
      return ls;
    }
    public void solve(List<List<Integer>>ls,List<Integer>ls1,int[]nums){
if(ls1.size()==nums.length){
    ls.add(new ArrayList<>(ls1));
    return;
}
for(int i=0;i<nums.length;i++){
    if(nums[i]!='*'){
        int temp=nums[i];
        ls1.add(nums[i]);
        nums[i]='*';
        solve(ls,ls1,nums);
    ls1.remove(ls1.size()-1);
    nums[i]=temp;
    }
}
    }

}