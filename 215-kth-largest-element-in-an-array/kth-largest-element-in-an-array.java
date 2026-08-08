class Solution {
    public int findKthLargest(int[] nums, int k)
    {
    PriorityQueue<Integer> q=new PriorityQueue<>(Collections.reverseOrder());
    for(int x : nums)
    {
        q.add(x);
    }   
    k--;
    while(k>0)
    {
        q.remove();
        k--;
    }
    return q.peek();
    }
}