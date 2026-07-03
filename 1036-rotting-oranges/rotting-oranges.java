class Solution {
    public int orangesRotting(int[][] grid)
    {
        int r=grid.length;
        int c=grid[0].length;
        Queue<int[]> q=new LinkedList<>();
        int f=0;
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                if(grid[i][j]==2){
                    q.offer(new int[]{i,j});
                }
                else if(grid[i][j]==1){
                    f++;
                }
            }
        }
        if(f==0)
        {
            return f;
        }
        int min=0;
        int[][] dr = {
            {1,0},{-1,0},{0,1},{0,-1}
        };
        while(!q.isEmpty() && f>0)
        {
            int s=q.size();
            for(int k=0;k<s;k++)
            {
                int[] cr=q.poll();
                int a=cr[0];
                int b=cr[1];
                for(int[] d : dr)
                {
                    int x=a+d[0];
                    int y=b+d[1];
                    if(x>=0 && x<r && y>=0 && y<c && grid[x][y]==1)
                    {
                        grid[x][y]=2;
                        f--;
                        q.offer(new int[]{x,y});
                    }
                }
            }
            min++;
        }
        return f==0?min:-1;
    }
    
}