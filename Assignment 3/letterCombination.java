class Solution {
    
    public List<String> letterCombinations(String digits) {
        if(digits.length()==0)return new ArrayList<>();
        String[]arr={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
List<String>ls=new ArrayList<String>();
        solve(arr,digits,"",ls);
        return ls;
    }
    public void solve(String[]arr,String digits,String ans,List<String>ls){
        if(digits.length()==0){
            // System.out.println(ans);
            ls.add(ans);
            return;
        }
        for(int i=0;i<arr[digits.charAt(0)-'0'].length();i++){
        solve(arr,digits.substring(1),ans+arr[digits.charAt(0)-'0'].charAt(i),ls);}
        // solve(arr,digits.substring(1),)
    } 
}