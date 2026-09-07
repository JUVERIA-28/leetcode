class Solution {
    public int orangesRotting(int[][] grid) 
    {
     int r=grid.length;
     int c=grid[0].length;
     Queue<int[]>q=new LinkedList<>();
     int cnt=0;
     int[] x={0,0,1,-1};
     int[] y={1,-1,0,0};
     for(int i=0;i<r;i++)
     {
        for(int j=0;j<c;j++)
        {
            if(grid[i][j]==2)
            {
                q.add(new int[]{i,j});
            }
        }
     } 
     while(!q.isEmpty())
     {
        int n=q.size();
        while(n-->0)
        {
            int[] a=q.remove();
            for(int i=0;i<4;i++)
            {
               int x1=a[0]+x[i];
               int y1=a[1]+y[i];
               if(x1>=0 && x1<r && y1>=0 && y1<c && grid[x1][y1]==1)
               {
                    grid[x1][y1]=2;
                    q.add(new int[]{x1,y1});
               } 
            }
        }
        if(!q.isEmpty())
        {
            cnt++;
        }
     }  
     for(int i=0;i<r;i++)
     {
        for(int j=0;j<c;j++)
        {
            if(grid[i][j]==1)
            {
                return -1;
            }
        }
     }
     return cnt;

    }
}