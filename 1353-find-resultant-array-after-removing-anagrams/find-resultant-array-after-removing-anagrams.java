class Solution {
    public List<String> removeAnagrams(String[] words) {
        List<String> ans=new ArrayList<>();
        ans.add(words[0]);
        for(int i=1;i<words.length;i++){
            if(!chk(words[i-1],words[i])){
                ans.add(words[i]);
            }
        }
        return ans;
    }
    public boolean chk(String a,String b){
        if(a.length()!=b.length()){
            return false;
        }
        Map<Character,Integer> mp=new HashMap<>();
        for(char c:a.toCharArray()){
            mp.put(c,mp.getOrDefault(c,0)+1);
        }
        for(char c:b.toCharArray()){
            if(mp.containsKey(c)){
                mp.put(c,mp.get(c)-1);
                if(mp.get(c)==0){
                    mp.remove(c);
                }
            }else{
                return false;
            }
        }
        return true;
    }
}