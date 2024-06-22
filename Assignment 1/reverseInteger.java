
class Main {
    public int reverse(int x) {
        long rev=0;
        while(Math.abs(x)>0){
            int temp=x%10;
            rev=rev*10+temp;
            x/=10;
        }
        if(rev>(Math.pow(2,31)-1) || rev<Math.pow(-2,31)){
            return 0;
        }


        return (int)rev;
        // return 0;
    }
}