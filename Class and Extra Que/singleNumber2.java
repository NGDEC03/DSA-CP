class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer>mp=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(mp.containsKey(nums[i])==true)mp.put(nums[i],mp.get(nums[i])+1);
            else mp.put(nums[i],1);
        }
        for(int i:mp.keySet()){
            if(mp.get(i)==1)return i;
        }
        return 0;
    }
}