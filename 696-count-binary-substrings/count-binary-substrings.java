class Solution {
    public int countBinarySubstrings(String s) {
        int c=1,p=0,a=0;
        for(int i=1;i<s.length();i++){
            if(s.charAt(i) == s.charAt(i-1)){
                c++;
            }else{
                a+=Math.min(c,p);
                p=c;
                c=1;
            }
        }
        return a+Math.min(c,p);
    }
}