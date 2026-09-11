class Solution {
    public int totalNumbers(int[] digits) 
    {
        int[] f=new int[10];
        for(int d : digits)
        {
            f[d]++;
        }
        int cnt=0;
        for(int h=1;h<=9;h++)
        {
            if(f[h]==0)
            {
                continue;
            }
            f[h]--;
            for(int t=0;t<=9;t++)
            {
                if(f[t]==0)
                {
                    continue;
                }
                f[t]--;
            
            for(int u=0;u<=8;u+=2)
            {
                if(f[u]>0)
                {
                    cnt++;
                }
                //f[t]++;
            }
            f[t]++;
            }
            f[h]++;
        }
        return cnt;
    }
}