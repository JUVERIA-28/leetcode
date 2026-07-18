class Solution {
    public int[] findRedundantConnection(int[][] edges)
    {
        //Map<Integer,List<Integer>> t=new HashMap<>();
        UDFS g=new UDFS(edges.length);
        int[] ans=new int[2];
        for(int[] e:edges)
        {
            int u=e[0];
            int v=e[1];
            if(!g.merge(u,v))
            {
                ans[0]=u;
                ans[1]=v;
            }
        }
        return ans;

        
    }
}
class UDFS
{
    int n;
    int[] p;
    UDFS(int n)
    {
        this.n=n;
        p=new int[n+1];
        for(int i=0;i<=n;i++)
        {
            p[i]=i;
        }
    }
    int find(int x)
    {
        if(x==p[x])
        {
            return x;
        }
        return p[x]=find(p[x]);
    }
    boolean merge(int x,int y)
    {
        int lx=find(x);
        int ly=find(y);
        if(find(x)==find(y)){
            return false;
        }
        p[lx]=ly;
        return true;
    }
}