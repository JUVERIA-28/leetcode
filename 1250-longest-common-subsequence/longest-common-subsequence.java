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
     int i=0,j=0;
     StringBuilder sb=new StringBuilder();
     while(i<n1 && j<n2)
     {
        if(t1.charAt(i)==t2.charAt(j)){
            sb.append(t1.charAt(i));
            i++;j++;
        }else if(dp[i+1][j]>dp[i][j+1])
        {
            i++;
        }else{
            j++;
        }
     } 
     System.out.println(sb.toString());

     return dp[0][0];
    }
}