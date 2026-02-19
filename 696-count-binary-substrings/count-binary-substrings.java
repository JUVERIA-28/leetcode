class Solution {
    public int countBinarySubstrings(String s) {
        int res=0,p=0,stk=1;
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)==s.charAt(i-1)){
                stk++;
            }else{
                p=stk;
                stk=1;
            }if(stk<=p){
                res++;
            }
        }
        return res;
    }
}