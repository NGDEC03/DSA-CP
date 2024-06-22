public class factorial {
    public static void main(String[] args) {
   int[]arr={4,5,7,8};
        subsetSum(123);
    }
    public static void stringCheck(int left,int right,String s){
        if(left>right)return;
        if(s.charAt(left)!=s.charAt(right))return;
        stringCheck(left+1,right-1,s);
    }
}


//sum of n natural no
//factorial
//power with n/2
//subsets of array whose sum is equal to target
//sum of digit of a num
//gcd of fac(m,n) -> Ans: fac(min(m,n))
//Palindrome String
//subSequence String
