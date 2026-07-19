class Solution {
    public int uniquePaths(int m, int n)
    {
        int[][] mt=new int[m][n];
        for(int i=0;i<m;i++)
        {
            mt[i][0]=1;
        }
        for(int i=0;i<n;i++)
        {
            mt[0][i]=1;
        }
        for(int i=1;i<m;i++)
        {
            for(int j=1;j<n;j++){
                mt[i][j]=mt[i-1][j]+mt[i][j-1];
            }
        }
        
        return mt[m-1][n-1];
        
    }
}