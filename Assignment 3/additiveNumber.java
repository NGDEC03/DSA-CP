import java.math.BigInteger;
class Solution {
    // ArrayList<Integer>ls=new ArrayList<>();
    public boolean isAdditiveNumber(String num) {
        return solve(num,0,new ArrayList<BigInteger>());
    }
    public boolean solve(String num,int idx,ArrayList<BigInteger>ls){
        if(idx>=num.length()){
            if(ls.size()>=3)return true;
        return false;
        }
        for(int i=idx;i<num.length();i++){
            // if(num.substring(idx,i+1).charAt(0)==0 && num.substring(idx,i+1).length()>1)continue;
            // System.out.println(num.substring(idx,i+1));
            BigInteger temp=new BigInteger(num.substring(idx,i+1));
            if(startsWithZero(num.substring(idx,i+1)) && isValid(temp,ls)){
                // System.out.println(temp);
                ls.add(temp);
                if(solve(num,i+1,ls))return true;
                ls.remove(ls.size()-1);
            }
        }
        return false;
    }
    public boolean isValid(BigInteger num,ArrayList<BigInteger>ls){
        // System.out.printl
        if(ls.size()<2)return true;
        return num.equals(ls.get(ls.size()-1).add(ls.get(ls.size()-2)));
    }
    public boolean startsWithZero(String num){
        if(num.length()==1)return true;
        return num.charAt(0)!='0';
    }
}