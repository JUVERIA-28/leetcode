class Solution {
    public String reverseOnlyLetters(String s) {
        char[] a = s.toCharArray();
        int l=0;
        int r = s.length()-1;
        while(l<r){
            if(!Character.isLetter(a[l])){
                l++;
            }else if(!Character.isLetter(a[r])){
                r--;
            }else{
                char t=a[l];
                a[l]=a[r];
                a[r]=t;

                l++;r--;
            }
        }
        return new String(a);
    }
}