class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        ArrayList<Integer> res = new ArrayList<>();
        
        for(int n : nums){
            int i = Math.abs(n)-1;
            if(nums[i]<0){
                res.add(Math.abs(n));
            }else{
                nums[i] = -nums[i];
            }
            
        }
        return res;
    }
}