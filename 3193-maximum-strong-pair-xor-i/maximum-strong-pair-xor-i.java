class Solution {
    public int maximumStrongPairXor(int[] nums) 
    {
        int mx=0;
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            int x=nums[i];
            for(int j=i;j<n;j++)
            {
                if(Math.abs(x-nums[j])<=Math.min(x,nums[j])){
                    mx=Math.max(mx,x^nums[j]);
                }
            }
        } 
        return mx;  
    }
}