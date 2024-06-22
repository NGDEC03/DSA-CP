class Solution {
    static String armstrongNumber(int n) {
        int k=n;
        int sum=0;
        while(n>0){
            int temp=n%10;
            sum+=temp*temp*temp;
            n/=10;
        }
        if(sum==k)return "true";
        return "false";
    }
}