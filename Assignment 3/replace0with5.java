//{ Driver Code Starts
import java.util.Scanner;
import java.lang.Math;

class Convert_To_Five {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            System.out.println(new GfG().convertfive(N));
            T--;
        }
    }
}
// } Driver Code Ends


class GfG {
    int convertfive(int num) {
        StringBuilder a=new StringBuilder("");
        while(num>0){
            if(num%10==0)a.insert(0,5);
            else a.insert(0,num%10);
            num/=10;
        }
        return Integer.parseInt(a.toString());
    }
}