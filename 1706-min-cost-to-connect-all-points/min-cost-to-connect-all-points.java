class Solution {
    public int minCostConnectPoints(int[][] points)
    {
        int n=points.length;
        List<Edge> edge=new ArrayList<>();
        for(int i=0;i<n-1;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                int x1=points[i][0];
                int y1=points[i][1];
                int x2=points[j][0];
                int y2=points[j][1];
                int w=Math.abs(x1-x2)+Math.abs(y1-y2);
                edge.add(new Edge(i,j,w));
            }
        }
        Collections.sort(edge,(e1,e2)->
        {
            return e1.w-e2.w;
        });
        int min=0;
        int sel=0;
        UFDS ds=new UFDS(n);
        for(Edge e:edge)
        {
            if(ds.merge(e.u,e.v))
            {
                min+=e.w;
                sel++;
            }
            if(sel==n-1)
            {
                break;
            }
        }
    return min;

    }
}
class UFDS
{
    int n;
    int[] p;
    UFDS(int n){
        this.n=n;
        p=new int[n];
        for(int i=0;i<n;i++)
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
        if(lx==ly){
            return false;
        }
        p[lx]=ly;
        return true;
    }
}
class Edge
{
    int u;
    int v;
    int w;
    Edge(int u,int v,int x){
        this.u=u;
        this.v=v;
        this.w=x;
    }
}