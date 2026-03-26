class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] ans=new int[2];
        int n=nums.length;
        HashSet<Integer> s=new HashSet<>();
        for(int i=0;i<n;i++){
            if(s.contains(nums[i])){
                ans[0]=nums[i];
            }
            s.add(nums[i]);
        }
        for(int i=1;i<=nums.length;i++){
            if(!s.contains(i)){
                ans[1]=i;
            }
        }
        return ans;
    }
}