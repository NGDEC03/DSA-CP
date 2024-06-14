import java.util.Scanner;

public class numLength {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int len=0;
        while(n>0){
            len++;
            n/=10;
        }

        System.out.println("number length is"+len);
// Optimised Approach:
        double lenOpti=Math.log10(n)+1;



    }
}
