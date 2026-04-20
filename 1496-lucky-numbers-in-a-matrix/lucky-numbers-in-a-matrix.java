class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        int r=matrix.length;
        int c=matrix[0].length;
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i=0;i<r;i++){
            int n=Integer.MAX_VALUE;
            int idx=-1;
            for(int j=0;j<c;j++){
                if(matrix[i][j]<n){
                    n=matrix[i][j];
                    idx=j;
                }
            }
            boolean chk=true;
            for(int r1=0;r1<r;r1++){
                if(matrix[r1][idx]>n){
                    chk=false;
                }
            }
            if(chk){
                ans.add(n);
            }
        }
        return ans;

    }
}