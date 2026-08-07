class Solution {
    public int lengthOfLIS(int[] nums) 
    {
    Set<Integer> set= new TreeSet<>();
    for(int x:nums)
    {
        set.add(x);
    }
    int[] n2=new int[set.size()];
    int i=0;
    for(int x:set)
    {
        n2[i++]=x;
    }    
    return lcs(nums,n2,0,0);
    }
    int lcs(int[] a,int[] b,int i,int j)
    {
        int n1=a.length;
        int n2=b.length;
        int[][] dp = new int[n1+1][n2+1];
        for(i=n1-1;i>=0;i--)
        {
            for(j=n2-1;j>=0;j--)
            {
                if(a[i]==b[j])
                {
                    dp[i][j] = 1 + dp[i+1][j+1];
                }
                else{
                    dp[i][j] = Math.max(dp[i][j+1] , dp[i+1][j]);
                }
            }
        }
        return dp[0][0];
    }
}