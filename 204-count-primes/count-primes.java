class Solution {
    public int countPrimes(int n) {
        int c=0;
        boolean[] p=new boolean[n];
        Arrays.fill(p,true);
       
        for(int i=2;i<=Math.sqrt(n);i++){
            if(p[i]){
                for(int j=i*i;j<n;j+=i){
                    p[j]=false;
                }
            }
        }
        for(int i=2;i<n;i++){
            if(p[i]){
                c++;
            }
        }
        return c;
    }
}