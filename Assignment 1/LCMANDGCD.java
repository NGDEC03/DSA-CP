import java.lang.Math;
class Solution {
    public boolean isPalindrome(int x) {
        long rev=0;
        int k=x;
        while((x)>0){
            int temp=x%10;
            rev=rev*10+temp;
            x/=10;
        }
        if(rev==k)
            return true;
        return false;