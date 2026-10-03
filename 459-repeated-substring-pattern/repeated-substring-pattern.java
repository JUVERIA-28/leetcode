class Solution 
{
    public boolean repeatedSubstringPattern(String s) 
    {
        int n = s.length();
        if(n<=1)
        {
            return false;
        }
        // int i=0;
        // int j=n/2;

        // while(i<n/2 && j<n)
        // {
        //     if(s.charAt(i)==s.charAt(j))
        //     {
        //         i++;
        //         j++;
        //     }
        //     else{
        //         return false;
        //     }
        // } 
        for(int i=1;i<=n/2;i++)
        {
            if(n%i!=0)
            {
                continue;
            }
            String sub = s.substring(0,i);
            boolean chk=true;
            for(int j=0;j<n;j++)
            {
                
                if(s.charAt(j)!=sub.charAt(j%i))
                {
                    chk=false;
                    break;
                }
            }
            if(chk)
            {
                return true;
            }
        }

        return false;
    }
}