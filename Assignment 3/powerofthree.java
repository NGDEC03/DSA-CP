class Solution {
    public boolean isPowerOfTwo(int n) {
     int maxRange=(int)Math.sqrt(n);
     int left=0,right=maxRange;
    while(left<=right){
        int mid=left+(right-left)/2;
        if(Math.pow(3,mid)==n)return true;
        else if(Math.pow(3,mid)<n)left=mid+1;
        else right=mid-1;
    }
    return false;
        
    }
   
}