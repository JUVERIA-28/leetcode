class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int cnt=words.length;
        int[] s=new int[26];
        for(char c:allowed.toCharArray())
        {
            s[c-'a']++;
        }
        for(String w:words)
        {
            for(char c : w.toCharArray())
            {
                if(s[c-'a']<=0)
                {
                    cnt--;
                    break;
                }
            }
        }
        return cnt;
    }
}