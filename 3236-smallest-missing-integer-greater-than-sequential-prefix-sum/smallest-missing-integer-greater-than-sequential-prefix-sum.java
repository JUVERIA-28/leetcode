class Solution {
    public int missingInteger(int[] nums) 
    {
        int ps = nums[0];
        int n=nums.length;
        Set<Integer> s=new HashSet<>();
        for(int x:nums)
        {
            s.add(x);
        }    
        int i=1;
        while(i<n && nums[i]==nums[i-1]+1)
        {
            ps+=nums[i++];
        }
        while(s.contains(ps))
        {
            ps++;
        }
        return ps;
    }
}