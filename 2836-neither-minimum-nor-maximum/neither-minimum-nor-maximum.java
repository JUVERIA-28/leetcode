class Solution {
    public int findNonMinOrMax(int[] nums) {
        int mn=Integer.MAX_VALUE;
        int mx=Integer.MIN_VALUE;
        if(nums.length<=2){
            return -1;
        }
        for(int x:nums){
            mn=Math.min(mn,x);
            mx=Math.max(mx,x);
        }
        for(int x:nums){
            if(x!=mn && x!=mx){
                return x;
            }
        }
        return -1;
    }
}