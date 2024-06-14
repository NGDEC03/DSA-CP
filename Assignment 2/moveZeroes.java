class Solution {
    public void moveZeroes(int[] nums) {
        int i=0,j=0,c=0;
        while(j<nums.length){
            if(nums[j]!=0){
                nums[i]=nums[j];
                i++;
            }
            j++;
        }
        for(int l=i;l<nums.length;l++){
            nums[l]=0;
        }
    }
}