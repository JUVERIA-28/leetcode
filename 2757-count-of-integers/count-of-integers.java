class Solution 
{
    long mod = 1000000007;
    static int[][][] dp ;
    
    int countFill(String limit,int minsum,int maxsum)
    {
        int n=limit.length();
        dp = new int[25][401][2];
        for (int i = 0; i < 25; i++) {
            for (int j = 0; j <= 400; j++) {
                for (int k = 0; k < 2; k++) {
                    dp[i][j][k] = -1;
                }
            }
        }
        return helper(limit,0,0,1,minsum,maxsum);
    }
    int helper(String limit , int i,int cds,int res,int minsum,int maxsum)
    {
        if(i>=limit.length())
        {
            if(cds>=minsum && cds<=maxsum)
            {
                return 1;
            }
            else{
                return 0;
            }
        }
        if (dp[i][cds][res] != -1)
        {
            return dp[i][cds][res];
        }
        int mxdgt=(res==0)?9:(limit.charAt(i)-'0');
        int ttl=0;
        int d=0;
        for(d=0;d<=mxdgt;d++)
        {
            int nres = 0;
            if(res==1)
            {
                if(d==mxdgt)
                {
                    nres=1;
                }
            }
            ttl+=helper(limit,i+1,cds+d,nres,minsum,maxsum);
            ttl=ttl%1000000007;
        }
            dp[i][cds][res] = ttl;
        
        return ttl;
    }
    String subtract(String s) {
        char[] arr = s.toCharArray();
        int i = arr.length - 1;
        while (arr[i] == '0')
        {
            arr[i] = '9';
            i--;
        }
        arr[i]--;
        int start = 0;
        while (start<arr.length-1&&arr[start]=='0') {
            start++;
        }
        return new String(arr,start,arr.length-start);
    }
    public int count(String num1, String num2, int min_sum, int max_sum) 
    {
        //long mod = 1000000007;
        int r= countFill(num2,min_sum,max_sum);
        String bf=subtract(num1);
        int l= countFill(bf,min_sum,max_sum);
        return (r-l+(int) mod)%(int)mod;
    }
}