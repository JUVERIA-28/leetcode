class Solution {
    public int countPrimeSetBits(int left, int right) {
        int c=0;
        for(int i=left;i<=right;i++){
            int s=Integer.bitCount(i);
            if(prime(s)){
                c++;
            }
        }
        return c;
    }
    private boolean prime(int n){
        if(n<=1){
            return false;
        }
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}