//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
        while(t-->0){
            String S = br.readLine();
            Solution ob = new Solution();
            String ans = ob.rremove(S).trim();
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    String rremove(String s) {
        Stack<Character>st=new Stack<>();
// 		String s="geeksforgeekseefe";
		for(int i=0;i<s.length();i++){
		    boolean flag=false;
		    while(!st.isEmpty() && i<s.length() && st.peek()==s.charAt(i)){
		        flag=true;
		        i++;
		        st.pop();
		    }
		  //  System.out.println(st);
		    if(flag){i--;st.pop();}
		    else {st.push(s.charAt(i));}
		}
// 		System.out.println(st);
StringBuilder str=new StringBuilder("");
for(char i:st){
    str.append(i);
    
}
		return str.toString();
    }
    String solve(String s,int i,String ans){
        if(i>=s.length()){
            if(s.charAt(s.length()-1)!=s.charAt(s.length()-2))ans+=s.charAt(s.length()-1);
            return ans;
            
        }
        if(i!=s.length()-1 && s.charAt(i)!=s.charAt(i-1))return solve(s,i+1,ans+s.charAt(i));
        return solve(s,i+2,ans);
    }
}