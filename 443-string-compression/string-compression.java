class Solution {
    public int compress(char[] chars) 
    {
        int i=0,idx=0;
        while(i<chars.length)
        {
            char ch=chars[i];
            int cnt=0;
            while(i<chars.length && chars[i]==ch)
            {
                cnt++;
                i++;
            }
            chars[idx++]=ch;
            if(cnt>1)
            {
                String s=String.valueOf(cnt);
                for(char c:s.toCharArray())
                {
                    chars[idx++]=c;
                }
            }
        } 
        return idx;   
    }
}