class Solution {
    public int[] productExceptSelf(int[] nums) 
    {
        int n=nums.length;
        int[] prev=new int[n];
        int[] next=new int[n];
        prev[0]=1;
        next[n-1]=1;

        for(int i=1;i<n;i++)
        {
            prev[i]=prev[i-1] * nums[i-1];

        }   

        for(int i=n-2;i>=0;i--)
        {
            next[i]=next[i+1] * nums[i+1];
        } 
        for(int i=0;i<n;i++)
        {
            nums[i]=next[i]*prev[i];
        }
        return nums;
    }
}