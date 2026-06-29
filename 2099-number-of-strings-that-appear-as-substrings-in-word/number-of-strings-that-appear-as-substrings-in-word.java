class Solution {
    public int numOfStrings(String[] patterns, String word)
    {
        int ans=0;
        for(String p:patterns)
        {
            if(chk(p,word))
            {
                ans++;
            }
        }
        return ans;
    }
    public boolean chk(String p,String w)
    {
        int m = p.length();
        int n=w.length();
        for(int i=0;i+m<=n;i++)
        {
            boolean s=true;
            for(int j=0;j<m;j++)
            {
                if(w.charAt(i+j)!=p.charAt(j))
                {
                    s=false;
                    break;
                }
            }
            if(s)
            {
                return true;
            }
        }
        return false;
    }
}