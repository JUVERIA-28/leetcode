class Solution {
    public int longestPalindrome(String s) {
        int o=0;
        Map<Character,Integer> mp=new HashMap<>();
        for(char c : s.toCharArray()){
            mp.put(c,mp.getOrDefault(c,0)+1);
            if(mp.get(c)%2==0){
                o--;
            }else{
                o++;
            }
        }
        if(o>1){
            return s.length()-o+1;
        }
        return s.length();

    }
}