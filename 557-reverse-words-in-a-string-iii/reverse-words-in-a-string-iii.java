class Solution {
    public String reverseWords(String s) {
        String[] w=s.split(" ");
        StringBuilder res = new StringBuilder();
        for(String w1 : w){
            StringBuilder rev=new StringBuilder(w1).reverse();
            res.append(rev).append(" ");
        }res.deleteCharAt(res.length()-1);
        String ans=new String(res);
        return ans;
    }
}