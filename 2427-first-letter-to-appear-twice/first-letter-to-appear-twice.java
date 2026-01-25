class Solution {
    public char repeatedCharacter(String s) {
        char ch ='a';int c=0;
        
        Map<Character,Integer> m = new HashMap<>();
        for(int i=0;i<s.length();i++){
            m.put(s.charAt(i),m.getOrDefault(s.charAt(i),0)+1);
            if(m.get(s.charAt(i))>1){
                ch=s.charAt(i);
                break;
            }
        }
        return ch;
    }
}