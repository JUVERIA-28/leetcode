class Solution 
{
    public int countSymmetricIntegers(int low, int high) 
    {
        int cnt=0;
        for(int j=low;j<=high;j++)
        {
            String s=String.valueOf(j);
            int n=s.length();
            if( n%2!=0)
            {
               continue;
            }
            if(s.length()==2 && s.charAt(0)==s.charAt(1))
            {
                cnt++;
                continue;
            }
            int l=0,r=0;
            for(int i=0;i<n/2;i++)
            {
                int x=s.charAt(i)-'0';
                l+=x;
            }
            for(int i=n/2;i<n;i++)
            {
                int x=s.charAt(i)-'0';
                r+=x;
            }
            if(r==l)
            {
                cnt++;
            }
        }
        return cnt;
    }
}