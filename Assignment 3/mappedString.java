class Solution{
    public static void main(String[]args){
        solve("123","");
    }
    static void solve(String n,String ans){
      if(n.length()==0){
            System.out.println(ans);
            return;
      }
        solve(n.substring(1),ans+(char)(n.charAt(0)-'0'+'A'-1));
        if(n.length()>1){
            int num=(n.charAt(0)-'0')*10+(n.charAt(1)-'0');
            if(num<=26){
                solve(n.substring(2),ans+(char)(num+'A'-1));
            }
        }
    }
}