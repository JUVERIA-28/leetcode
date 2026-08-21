class Solution
{
    public boolean canPartition(int[] nums) 
    {
     int t=0;
     int n=nums.length;
     for(int x:nums)
     {
        t+=x;
     }
     if(t%2!=0)
     {
        return false;
     }
     t=t/2;
     
     int[][] dp = new int[n+1][t+1];
     for(int i=0;i<=n;i++)
     {
        dp[i][0]=1;
     }
     for(int i=1;i<=n;i++)
     {
        for(int j=1;j<=t;j++)
        {
            int inc=0,exc=dp[i-1][j];
            if(nums[i-1]<=j)
            {
                inc=dp[i-1][j-nums[i-1]];
            }
            dp[i][j]=inc+exc;
        }
     }
     if(dp[n][t]!=0)
     {
        return true;
     }
     return false;
}
}

