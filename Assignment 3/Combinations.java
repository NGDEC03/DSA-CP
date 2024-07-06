class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>>ls=new ArrayList<>();
        List<Integer>ls1=new ArrayList<>();
       psolve(n,k,"",0,ls,ls1);
        return ls;
    }
    private static void psolve(int n, int k, String s,int lp,List<List<Integer>>ls,List<Integer>ls1) {
        if(ls1.size()==k){
            ls.add(new ArrayList<>(ls1));
            // System.out.println(s);
            // if(ls1.get(ls1.size()-1)!=n)ls1.remove(ls1.size()-1);
            // else ls1.clear();
            return;
        }
        for(int i=lp+1;i<=n;i++){
            ls1.add(i);
            psolve(n,k,s+i,i,ls,ls1);
            ls1.remove(Integer.valueOf(i));
        }
    }
}