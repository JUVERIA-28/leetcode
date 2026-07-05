class Solution {
    public void setZeroes(int[][] matrix) 
    {
        int r=matrix.length;
        int c=matrix[0].length;
        int[] ra=new int[r];
        int[] ca=new int[c];
        Arrays.fill(ra,1);
        Arrays.fill(ca,1);
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                if(matrix[i][j]==0){
                    ra[i]=0;
                    ca[j]=0;
                }
            }
        }
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                if(ra[i]==0 || ca[j]==0)
                {
                    matrix[i][j]=0;
                }
            }
        }

        
    }
}