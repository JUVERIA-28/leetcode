class Solution {
    public int climbStairs(int n) {
        if(n<=3){
            return n;
        }
        int f=1,s=2,w=0;
        for(int i=3;i<=n;i++){
            w = f+s;
            f=s;
            s=w;

        }
        return w;

    }
}