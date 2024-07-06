class Solution {
    public boolean isPowerOfFour(int n) {
       double res=Math.log(n)/Math.log(4);
       int res1=(int)(Math.log(n)/Math.log(4));
       if(res==res1)return true;
       return false;
    }
}