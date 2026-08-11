class Solution {
    public int maxVowels(String s, int k)
    {
        int res=0;
        int l=0,vw=0;
        int n=s.length();
        for(int r=0;r<n;r++)
        {
            if(v(s.charAt(r)))
            {
                vw++;
            }
            if((r-l+1)==k)
            {
                res=Math.max(res,vw);
                if(v(s.charAt(l)))
                {
                    vw--;
                }
                l++;
            }
        }    
        return res;
    }
    public boolean v(char c)
    {
        if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u')
        {
            return true;
        }
        return false;
    }
}