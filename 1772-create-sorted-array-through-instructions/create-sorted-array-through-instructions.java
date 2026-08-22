class Solution 
{
    public int createSortedArray(int[] instructions) 
    {
        long ans=0;
        int mx=100000;

        ST obj=new ST(mx);
        for(int x:instructions)
        {
            long c1 = obj.rangequery(0,x-1);
            long c2 = obj.rangequery(x+1,mx);
            ans=ans+Math.min(c1,c2);
            ans=ans%1000000007;
            obj.inc(x);

        }
        return (int)ans;
    }
}

class ST
{
    long[] st;
    int n=0;
    public ST(int m)
    {
        this.n=m;
        st=new long[4*n];
        
    }
    long rangequery(int l,int r)
    {
        return range(0,0,n,l,r);
    }
    long range(int idx,int ss,int se,int qs,int qe)
    {
        if(qe<ss || qs>se)
        {
            return 0;
        }
        if(qs <= ss && se <= qe)
        {
            return st[idx];
        }
        int m=(ss+se)/2;
        long l=range(2*idx+1,ss,m,qs,qe);
        long r=range(2*idx+2,m+1,se,qs,qe);
        // st[idx]=st[2*idx+1]+st[2*idx+2];
        return l+r;

    }
    void inc(int x)
    {
        int idx=0,ss=0,se=n;
        
        while(ss<se)
        {
            int m=(ss+se)/2;
        if(x<=m)
        {
            idx=2*idx+1;
            se=m;
        }else{
            idx=2*idx+2;
            ss=m+1;
        }
        }
        while(true)
        {
            st[idx]+=1;
            if(idx==0)
            {
                break;
            }
            idx=(idx-1)/2;
        }
    }
}