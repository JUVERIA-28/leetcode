class Solution {
    public int numIslands(char[][] grid) {
        if(grid==null || grid.length==0){
            return 0;
        }
        int c1=0;
        int r=grid.length;
        int c=grid[0].length;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(grid[i][j]=='1'){
                    c1++;
                    dfs(grid,i,j);
                }
            }
        }return c1;
    }
    public void dfs(char[][] g,int i,int j){
        int r=g.length;
        int c=g[0].length;
        if(i<0 || i>r-1 || j<0 || j>c-1){
            return;
        }if(g[i][j]=='0'){
            return;
        }
        g[i][j]='0';
        dfs(g,i+1,j);
        dfs(g,i,j+1);
        dfs(g,i-1,j);
        dfs(g,i,j-1);
    }
}