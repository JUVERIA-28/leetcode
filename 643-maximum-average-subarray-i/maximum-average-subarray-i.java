class Solution {
    public double findMaxAverage(int[] nums, int k) 
    {
    int ans=0;
    int sm=0;
    for(int i=0;i<k;i++)
    {
        sm+=nums[i];
    }  
    ans=sm; 
    for(int i=k;i<nums.length;i++)
    {
        //ans=Math.max(ans,sm);
        sm+=nums[i]-nums[i-k];
        ans=Math.max(ans,sm);
    }
    return (double)ans/k;
    }
}