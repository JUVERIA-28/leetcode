class Solution {
    public int projectionArea(int[][] grid) {
        int[] f=new int[grid.length];
        int b=0,bk=0,total=0;
        for(int i=0;i<grid.length;i++){
            int t=0;
            for(int j=0;j<grid.length;j++){
                if(grid[i][j]!=0){
                    b+=1;
                    if(grid[i][j] > t){
                        t=grid[i][j];
                    }
                    if(grid[i][j]>f[j]){
                        f[j]=grid[i][j];
                    }
                }
            }
            total+=t;

        }
        for(int i=0;i<f.length;i++){
            bk+=f[i];
        }
        return total+bk+b;
    }
}