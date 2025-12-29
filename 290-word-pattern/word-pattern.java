class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character,String> a = new HashMap<>();
        String b[] = s.trim().split("\\s+");
        int n = pattern.length();
        if(n!=b.length){
            return false;
        }
        for(int i=0;i<n;i++){
            char c = pattern.charAt(i);
            if(a.containsKey(c)){
                if(!a.get(c).equals(b[i])){
                    return false;
                }
            }
            else{
                if(a.containsValue(b[i])){
                    return false;
                }
                a.put(c,b[i]);
            }
        }
        return true;
    }
}