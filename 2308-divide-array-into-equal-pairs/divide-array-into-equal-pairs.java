class Solution {
    public boolean divideArray(int[] nums) 
    {
        Map<Integer,Integer> mp = new HashMap<>();
        for(int n:nums)
        {
            mp.put(n,mp.getOrDefault(n,0)+1);
        }
        for(int cnt:mp.values())
        {
            if(cnt%2!=0){
                return false;
            }
        }
        return true;
    }
}