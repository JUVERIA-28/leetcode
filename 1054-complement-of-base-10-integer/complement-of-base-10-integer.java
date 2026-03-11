class Solution {
    public int bitwiseComplement(int n) {
       if(n==0){
        return 1;
       } 
       int b=(int)(Math.log(n)/Math.log(2))+1;
       int m=(1<<b)-1;
       return n^m;
    }
}