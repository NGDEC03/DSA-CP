class Solution {
    static Long[] lcmAndGcd(Long A , Long B) {
        Long C=A,D=B;
        Long[]arr=new Long[2];
        while(A>0 && B>0){
            if(B>A)B=B%A;
            else A=A%B;
        }
        if(A>0)arr[1]=A;
        else arr[1]=B;
        arr[0]=(C*D)/arr[1];
        return arr;
    }
}