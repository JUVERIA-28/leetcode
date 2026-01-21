class Solution {
    public boolean checkRecord(String s) {
        int l=0,a=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='A'){
                a++;
            }if(s.charAt(i)!='L' ){
                l=0;
            }
            if(s.charAt(i)=='L' ){
                l++;
            }
            if(a==2 || l==3){
                return false;
            }
        }
        return true;
    }
}
