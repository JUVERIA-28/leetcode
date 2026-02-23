class Solution {
    public int maxCount(int m, int n, int[][] ops) {
        int mr=m;
        int mc=n;
        for(int i=0;i<ops.length;i++){
            if(ops[i][0]<mr){
                mr=ops[i][0];
            }if(ops[i][1]<mc){
                mc=ops[i][1];
            }
        }
        return mc*mr;
    }
}