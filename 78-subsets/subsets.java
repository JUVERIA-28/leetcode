class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        int n=nums.length;
        List<List<Integer>> ot = new ArrayList<>();
        for(int i=0;i<(1<<n);i++){
            List<Integer> in = new ArrayList<>();
            for(int k=0;k<n;k++){
                if((i & (1<<k))!=0){
                    in.add(nums[k]);
                }
            }
            ot.add(in);
        }
        return ot;
    }
}