class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>>ls=new ArrayList<>();
        List<Integer>ls1=new ArrayList<>();
        solve(nums,ls,ls1,0);
        return ls;
    }
    public static  void solve(int[]nums,List<List<Integer>>ls,List<Integer>ls1,int i){
        if(i>=nums.length){
            ls.add(new ArrayList<>(ls1));
            // System.out.println()
            return;
        }
        ls1.add(nums[i]);
    solve(nums,ls,ls1,i+1);
        ls1.remove(ls1.size()-1);
        solve(nums,ls,ls1,i+1);
    }
}