class Solution {
    public int maxProduct(int[] nums) {
        int max=nums[0];
        int min=nums[0];
        int mp=nums[0];
        
        for(int i=1;i<nums.length;i++){
            if(nums[i]<0){
                int t=max;
                max=min;
                min=t;
            }
            max=Math.max(max*nums[i],nums[i]);
            min=Math.min(min*nums[i],nums[i]);

            mp=Math.max(mp,max);
        }
        return mp;
    }
}