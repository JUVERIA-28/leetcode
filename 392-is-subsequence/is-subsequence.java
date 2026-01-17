class Solution {
    public boolean isSubsequence(String s, String t) {
        boolean res = false;
        int i=0,j=0,c=0;
        if(s.isEmpty()){
            return true;
        }
        while(i<s.length() && j<t.length()){
            if(s.charAt(i)==t.charAt(j)){
                i++;
                c++;
            }
            j++;
        }
        if(c==s.length()){
            return true;
        }
        return false;
    }
}