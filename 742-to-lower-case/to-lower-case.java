class Solution {
    public String toLowerCase(String s) {
     int n=s.length();
     char[] c = new char[n];
     for(int i=0;i<n;i++){
        c[i]=Character.toLowerCase(s.charAt(i));
     }
     String res = new String(c);
     return res;   
    }
}