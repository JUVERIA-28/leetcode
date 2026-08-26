class Solution {
    public int tribonacci(int n) {
        int[] a=new int[38];
        a[0]=0;
        a[1]=1;
        a[2]=1;
        if(n==0)
        {
            return a[0];
        }
        if(n<=2)
        {
            return 1;
        }
        for(int i=3;i<=n;i++)
        {
            a[i]=a[i-1]+a[i-2]+a[i-3];
        }
        return a[n];
    }
}