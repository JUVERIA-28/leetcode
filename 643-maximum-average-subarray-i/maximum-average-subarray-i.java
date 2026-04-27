class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sm=0;
        for(int i=0;i<k;i++){
            sm+=nums[i];
        }
        int max=sm;
        for(int i=k;i<nums.length;i++){
            sm+=nums[i]-nums[i-k];
            max=Math.max(max,sm);
        }
        return (double)max/k;
    }
}