class Solution {
    public List<List<String>> partition(String s) {
        List<String>ls1=new ArrayList<>();
        List<List<String>>ls=new ArrayList<>();
        solve(s,ls1,ls,"");
        return ls;
    }
    public void solve(String s,List<String>ls1,List<List<String>>ls,String ans){
        if(s.length()==0){
            ls.add(new ArrayList<>(ls1));
            return;
        }
        for(int i=1;i<=s.length();i++){
            String temp=s.substring(0,i);
            if(isPalindrome(temp)){
                // System.out.println(temp);
                ls1.add(temp);
                solve(s.substring(i),ls1,ls,ans);
                ls1.remove(temp);
            }
        }
       
    }
     public boolean isPalindrome(String a){
            int left=0,right=a.length()-1;
            while(left<=right){
                if(a.charAt(left)!=a.charAt(right))return false;
                left++;
                right--;
            }
            return true;
        }
}