class Solution {
    public int coinChange(int[] coins, int amount)
    {
        int n=coins.length;
        int[][] dp=new int[coins.length+1][amount+1];
        for(int i=0;i<=n;i++)
        {
            dp[i][0]=0;
        }
        for(int j=1;j<=amount;j++)
        {
            dp[0][j] = amount+1;
        }
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=amount;j++)
            {
                int exc=dp[i-1][j];
                int inc=amount+1;
                int c=coins[i-1];
                if(c<=j)
                {
                    inc=1+dp[i][j-c];
                }
                dp[i][j]=Math.min(inc,exc);
            }
        }
        return dp[n][amount]>amount?-1:dp[n][amount];
    }
}