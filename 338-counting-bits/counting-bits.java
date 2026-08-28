class Solution
{
    public int[] countBits(int n) {
        int[] ans=new int[n+1];
        int c=1;
        for(int i=1;i<=n;i++)
        {
            if(c*2==i)
            {
                c=i;
            }
            ans[i]=ans[i-c]+1;
        }
        return ans;
    }
}