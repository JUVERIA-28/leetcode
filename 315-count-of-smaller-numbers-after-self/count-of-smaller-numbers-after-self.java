class Solution 
{
    public List<Integer> countSmaller(int[] nums) 
    {
        List<Integer> ans=new ArrayList<>();
        int mx=20001;
        ST obj=new ST(20001);
        for(int i=nums.length-1;i>=0;i--)
        {
            int x=nums[i];
            x+=10000;
            int s=obj.rangequery(0,x-1);
            ans.add(s);
            obj.inc(x);
        }
        Collections.reverse(ans);
        return ans;
    }
}
class ST
{
    int[] st;
    int n=0;
    public ST(int m)
    {
        this.n=m;
        st=new int[4*n];
        
    }
   int rangequery(int l,int r)
    {
        return range(0,0,n,l,r);
    }
    int range(int idx,int ss,int se,int qs,int qe)
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
        int l=range(2*idx+1,ss,m,qs,qe);
        int r=range(2*idx+2,m+1,se,qs,qe);
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