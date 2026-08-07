class Solution {
    public int longestCommonSubsequence(String t1, String t2) 
    {
     int n1=t1.length();   
     int n2=t2.length();
     int[][] dp=new int[n1+1][n2+1];
     for(int i=n1-1;i>=0;i--)
     {
        for(int j=n2-1;j>=0;j--)
        {
            if(t1.charAt(i)==t2.charAt(j))
            {
                dp[i][j] = 1 + dp[i+1][j+1];
            }
            else{
                dp[i][j]=Math.max(dp[i][j+1],dp[i+1][j]);
            }
        }
     }   
     return dp[0][0];
    }
}