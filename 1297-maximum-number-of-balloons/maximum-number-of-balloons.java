class Solution 
{
    public int maxNumberOfBalloons(String text)
    {
        HashMap<Character,Integer> mp = new HashMap<>();
        char[] c1=text.toCharArray();
        for(char c:c1)
        {
            if(c=='b' ||  c=='a' || c=='l' || c=='o' || c=='n')
            {
                mp.put(c,mp.getOrDefault(c,0)+1);
            }
        }
        int res=Integer.MAX_VALUE;
        for(int k:mp.values())
        {
            res=Math.min(res,k);
        }
         if(!mp.containsKey('b') || !mp.containsKey('a') || !mp.containsKey('l') || !mp.containsKey('o') || !mp.containsKey('n'))
         {
            return 0;
         }
        
        int l=-1;
        int o=-1;
        
        int chk=mp.get('l');
        chk=Math.min(chk,mp.get('o'));
       while(2*res>chk)
        {
             res=res-1;;
        }
        return res;
    }
}