class Solution {
    public int numIdenticalPairs(int[] nums) {
        int res=0;
        int c[]=new int[101];
        for(int n:nums){
            res+=c[n]++;
        }
        return res;
        
    }
}