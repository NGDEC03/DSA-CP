class Solution {
    public int firstMissingPositive(int[] nums) {
        int isOne=0,ans=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1)isOne=1;
            if(nums[i]>nums.length || nums[i]<=0)nums[i]=1;

        }
        for(int i=0;i<nums.length;i++){
            int index=Math.abs(nums[i])-1;
            if(nums[index]>0)nums[index]*=-1;
        }
        // System.out.println(Arrays.toString(nums)+"->"+isOne);
        for(int i=0;i<nums.length;i++){
            // System.out.print(ans+" ");
            if(nums[i]>0){ans=i+1;
                break;}
        }
        // System.out.println(ans);
        if(isOne!=1)return 1;
        return ans==0?nums.length+1:ans;
    }
}