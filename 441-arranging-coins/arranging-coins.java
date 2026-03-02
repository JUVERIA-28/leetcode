class Solution {
    public int arrangeCoins(int n) {
        long s=1;
        long e=n;
        long a=0;
        long m=0;
        while(s<=e){
            m=s+(e-s)/2;
            long c=(m*(m+1))/2;
            if(c<=n){
                a=m;
                s=m+1;
            }else{
                e=m-1;
            }
        }
        return (int)a;
    }
}