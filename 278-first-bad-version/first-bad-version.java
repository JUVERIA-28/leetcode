/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int l=0,r=n;
        int res=Integer.MAX_VALUE;
        while(l<=r){
            int m=l+(r-l)/2;
            boolean b=isBadVersion(m);
            if(b){
                res=m;
                r=m-1;
            }else{
                l=m+1;
            }
        }
        return res;
    }
}