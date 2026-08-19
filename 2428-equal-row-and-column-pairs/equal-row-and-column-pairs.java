class Solution {
    public int equalPairs(int[][] grid)
    {
     int cnt=0;
     int n=grid.length;
     for(int i=0;i<n;i++)
     {
        List<Integer> r=new ArrayList<>();
        for(int j=0;j<grid[i].length;j++)
        {
            r.add(grid[i][j]);
        }
        for(int j=0;j<n;j++)
        {
            List<Integer> c=new ArrayList<>();
            for(int k=0;k<n;k++)
            {
                c.add(grid[k][j]);
            }
            if(r.equals(c))
            {
                cnt++;
            }
        }
     }  
     return cnt; 
    }
}