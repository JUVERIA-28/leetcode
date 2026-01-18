class Solution {
    void reverse(char[] a,int l,int r){
        while(l<r){
            char t = a[l];
            a[l] = a[r];
            a[r] = t;
            r--;l++;
        }
    }
    public String reverseStr(String s, int k) {
        char[] a=s.toCharArray();
        for(int i=0;i<a.length;i+=2*k){
            reverse(a,i,Math.min(i+k-1,a.length-1));
        }
        String ans = new String(a);
        return ans;
    }
}