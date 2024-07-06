/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int t=sc.nextInt();
	    while(t-->0){
	        int A=sc.nextInt();
	        int B=sc.nextInt();
	        int C=sc.nextInt();
	        System.out.println(solve(A,B,C,sc.nextInt()));
	    }
// 		solve()
	}
	public static int solve(int A,int B,int C,int N){
	    if(N==1)return A;
	    if(N==2)return B;
	    if(N==3)return C;
	    return solve(A,B,C,N-1)+solve(A,B,C,N-2)+solve(A,B,C,N-3);
	}
}