import java.math.BigInteger;
class Solution {
    public List<Integer> splitIntoFibonacci(String num) {
        List<Integer>ls=new ArrayList<>();
        solve(num,0,ls);
        return ls;
    }
    public boolean solve(String num,int idx,List<Integer>ls){
        if(idx>=num.length()){
            if(ls.size()>=3)return true;
        return false;
        }
        for(int i=idx;i<num.length();i++){
            // if(num.substring(idx,i+1).charAt(0)==0 && num.substring(idx,i+1).length()>1)continue;
            // System.out.println(num.substring(idx,i+1));
            Integer temp=Integer.parseInt(num.substring(idx,i+1));
            if(startsWithZero(num.substring(idx,i+1)) && isValid(temp,ls)){
                // System.out.println(temp);
                ls.add(temp);
                if(solve(num,i+1,ls))return true;
                ls.remove(ls.size()-1);
            }
        }
        return false;
    }
    public boolean isValid(Integer num,List<Integer>ls){
        // System.out.printl
        if(ls.size()<2)return true;
        return num==ls.get(ls.size()-1)+ls.get(ls.size()-2);
    }
    public boolean startsWithZero(String num){
        if(num.length()==1)return true;
        return num.charAt(0)!='0';
    }
}