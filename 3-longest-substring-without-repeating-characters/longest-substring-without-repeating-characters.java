class Solution {
    public int lengthOfLongestSubstring(String s) {
        int st=0,e=0,mx=0;
        int n=s.length();
        Map<Character,Integer> f=new HashMap<>();
        if(s==null || s.isEmpty()){
            return 0;
        }else{
        for(e=0;e<n;e++){
            char c=s.charAt(e);
            f.put(c,1+f.getOrDefault(c,0));
            if(f.get(c)<=1){
                mx=Math.max(mx,e-st+1);
            }else{
                while(st<=e){
                    char r=s.charAt(st);
                    st++;
                    f.put(r,f.get(r)-1);
                    if(f.get(r)==1){
                        break;
                    }
                }
            }
        }
    }
    return mx;
    }
}