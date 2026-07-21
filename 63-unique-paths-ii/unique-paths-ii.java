class Solution {
    public int uniquePathsWithObstacles(int[][] grid) 
    {
        if(grid==null || grid.length==0 || grid[0].length==0 || grid[0][0]==1)
        {
            return 0;

        }
        int r=grid.length;
        int c=grid[0].length;
        int[] p=new int[c];
        p[0]=1;
        int[] cr=new int[c];
        for(int i=0;i<r;i++)
        {
            cr[0]=grid[i][0]==0?p[0]:0;
            for(int j=1;j<c;j++)
            {
                cr[j]=grid[i][j]==0?cr[j-1]+p[j]:0;
            }
            System.arraycopy(cr,0,p,0,c);
        }
        return p[c-1];
    }
}