class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int r=ransomNote.length();
        int m=magazine.length();
        if(r>m){
            return false;
        }
        int[] c1=new int[30];
        for(char c : magazine.toCharArray()){
            c1[c-'a']++;
        }
        for(char c:ransomNote.toCharArray()){
            if(c1[c-'a']==0){
                return false;
            }
            c1[c-'a']--;
        }
        return true;
    }
}