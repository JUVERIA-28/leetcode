class Solution 
{
    public int totalMoney(int n)
    {
        int mon=1;
        int cnt=0;
        
        if(n<=7)
        {
           return (n*(n+1)/2);
        }
        int d=n/7;
        int r=n%7;
        cnt+=(7*(7+1)/2);
        mon++;
        d--;
        int m;
        while(d>0)
        {
            m=mon;
            for(int i=1;i<=7;i++)
            {
                cnt+=m;
                m++;
            }
            
            mon++;d--;

        }
        while(r>0)
        {
            cnt+=mon;
            mon++;
            r--;
        }
       return cnt;
    }
}