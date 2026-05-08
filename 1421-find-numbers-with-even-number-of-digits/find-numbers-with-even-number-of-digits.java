class Solution {
    public int findNumbers(int[] nums) {
        int ans=0;
        for(int n:nums){
            if(chk(n)){
                ans++;
            }
            
        }
        return ans;
    }
    public boolean chk(int n){
        
        int c=0;
        while(n!=0){
            n=n/10;
            c++;
        }
        if(c%2==0){
            return true;
        }
        return false;
    }
}