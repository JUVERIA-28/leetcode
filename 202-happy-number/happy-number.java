class Solution {
    public boolean isHappy(int n) {
        Set<Integer> s = new HashSet<>();
        while(!s.contains(n)){
            int r=0;
            s.add(n);
            while(n>0){
                int d=n%10;
                r+=d*d;
                n=n/10;
            }
            n=r;
            if(n==1){
                return true;
            }
        }

        return false;
    }
}