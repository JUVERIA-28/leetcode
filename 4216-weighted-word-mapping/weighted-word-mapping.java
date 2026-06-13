class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        StringBuilder ans = new StringBuilder();
        for(String w : words){
            int s=0;
            for(char c : w.toCharArray()){
                s+=weights[c-'a'];
            }
            int a=s%26;
            char c=(char)('z'-a);
            ans.append(c);
        }
        return ans.toString();
    }
}