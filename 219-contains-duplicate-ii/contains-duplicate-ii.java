class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer,Integer> z=new HashMap<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            int x=nums[i];
            if(z.containsKey(x) && i-z.get(x)<=k){
                return true;
            }
            z.put(x,i);
        }
        return false;
    }
}