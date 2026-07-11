class Solution {
    public int numSteps(String s) 
    {
        int st=0,c=0;
        for(int i=s.length()-1;i>0;i--)
        {
            int b=s.charAt(i)&1;
            st=st+1+(b^c);
            c=c|b;
        }
        int ans=c+st;
        return ans;
        
    }
}