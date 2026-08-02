class Solution {
    public String reverseWords(String s) {
        String[] s1 = s.trim().split("\\s+");

        StringBuilder sb=new StringBuilder();
        int n=s1.length;
        for(int i=n-1;i>0;i--)
        {
            sb.append(s1[i]);
            sb.append(" ");
        }
        sb.append(s1[0]);
        return sb.toString();
    }
}