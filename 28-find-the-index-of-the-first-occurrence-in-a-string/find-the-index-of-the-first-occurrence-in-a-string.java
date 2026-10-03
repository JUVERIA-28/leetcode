class Solution {
    public int strStr(String hs, String nd) 
    {
        int h=hs.length();
        int n=nd.length();
        int s=0;
        while(s<=h-n)
        {
            int i=s,j=0;
            while(j<n)
            {
                if(hs.charAt(i)==nd.charAt(j))
                {
                    j++;i++;
                
                    if(j==n)
                    {
                        return s;
                    }
                }
                else{
                    s++;
                    break;
                }
            }
        }  
        return -1;  
    }
}