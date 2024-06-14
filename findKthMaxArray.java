class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer>pq=new PriorityQueue<>();
        for(int i:nums)pq.offer(i);
        System.out.println(pq.size());
        while(pq.size()>k){
            pq.poll();
        }
        return pq.poll();

    }
}