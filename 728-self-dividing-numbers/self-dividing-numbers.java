class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> ans = new ArrayList<>();
        int l=left;
        int r=right;
        for(int i=left;i<=right;i++){
            int c=0,c1=0;
            int t=i;
            int n=i;
            while(n>0){
                int z=n%10;
                c++;
                if(z!=0 && t%z==0){
                    c1++;
                }
                n=n/10;
            }
        
        if(c==c1){
            ans.add(t);
        }
        }
        return ans;
    }
}