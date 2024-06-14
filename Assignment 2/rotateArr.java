
class Solution {
    // Function to rotate an array by d elements in counter-clockwise direction.
    static void rotateArr(int nums[], int k, int n) {
        k=k%n;
        reverse(nums,0,nums.length-1);
        reverse(nums,0,n-k-1);
        reverse(nums,n-k,n-1);
    }
    static void reverse(int[]nums,int left,int right){
        while(left<right){int temp=nums[left];
            nums[left]=nums[right];
            nums[right]=temp;
            left++;
            right--;}
    }
}