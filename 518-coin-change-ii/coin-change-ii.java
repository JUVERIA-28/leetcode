class Solution {
    public int change(int amount, int[] coins) 
    {
    int n=coins.length;
    int[][] dp=new int[n+1][amount+1];
    for(int i=0;i<n+1;i++)
    {
        dp[i][0]=1;
    }  
    for(int i=1;i<n+1;i++)
    {
        for(int j=1;j<amount+1;j++)
        {
            int inc=0;
            int exc=dp[i-1][j];
            int x=coins[i-1];
            if(x<=j){
                inc=dp[i][j-x];
            }
            dp[i][j]=inc+exc;
        }
    } 
    return dp[n][amount];
    }
}