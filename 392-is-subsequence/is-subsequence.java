class Solution {
    public boolean isSubsequence(String s, String t)
    {
     if(s.length()>t.length())
     {
        return false;
     }   
     if(s.isEmpty())
     {
        return true;
     }
     int i=0,c=0,j=0;
     while(i<s.length() && j<t.length())
     {
        if(s.charAt(i)==t.charAt(j))
        {
            i++;c++;
        }
        j++;
     }
     return c==s.length();
    }
}