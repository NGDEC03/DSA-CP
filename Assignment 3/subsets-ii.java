class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>>ls=new ArrayList<>();
        List<Integer>ls1=new ArrayList<>();
        Arrays.sort(nums);
        solve(nums,ls,ls1,0);
        return ls;
    }
    public static  void solve(int[]nums,List<List<Integer>>ls,List<Integer>ls1,int lp){
        ls.add(new ArrayList<>(ls1));
        for(int i=lp;i<nums.length;i++){
            if(i!=lp && nums[i]==nums[i-1])continue;
            ls1.add(nums[i]);
            solve(nums,ls,ls1,i+1);
            ls1.remove(Integer.valueOf(nums[i]));
        }
    }}