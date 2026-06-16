class Solution {
    public int[] evenOddBit(int n)
    {
        int[] res=new int[2];
        int a=0;
        while(n>0)
        {
            if(n%2!=0)
            {
                res[a%2]++;
            }
            n>>=1;
            a++;
        }
        return res;
    }
}