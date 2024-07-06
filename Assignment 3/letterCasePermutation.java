class Solution {
    public List<String> letterCasePermutation(String s) {
        List<String>ls=new ArrayList<>();
        solve(ls,s,"",0);
        return ls;

    }
    public void solve(List<String>ls,String s,String res,int index){
if(index>=s.length()){
    ls.add(res);
    return;
}
if(s.charAt(index)=='0' ||s.charAt(index)=='1' ||s.charAt(index)=='2' ||s.charAt(index)=='3' ||s.charAt(index)=='4' ||s.charAt(index)=='5' ||s.charAt(index)=='6' ||s.charAt(index)=='7' ||s.charAt(index)=='8' ||s.charAt(index)=='9' ){
solve(ls,s,res+s.charAt(index),index+1);
}
else if(s.charAt(index)>=97){
    solve(ls,s,res+(char)(s.charAt(index)-32),index+1);
    solve(ls,s,res+s.charAt(index),index+1);
}
else{
    solve(ls,s,res+(char)(s.charAt(index)+32),index+1);
    solve(ls,s,res+s.charAt(index),index+1);
}
    }
}