class Solution {
    public String smallestPalindrome(String s) 
    {
    int[] f=new int[26];
    for(char c : s.toCharArray())
    {
        f[c-'a']++;
    }    
    int n=s.length();
    char[] res=new char[n];
    int l=0,r=n-1;
    for(int i=0;i<26;i++)
    {
        while(f[i]>=2)
        {
            res[l++]=(char)('a'+i);
            res[r--]=(char)('a'+i);
            f[i]-=2;
        }
        if(f[i]==1)
        {
            res[n/2]=(char)('a'+i);
        }
    }
    String anss=new String(res); 
    return anss;
    }
}