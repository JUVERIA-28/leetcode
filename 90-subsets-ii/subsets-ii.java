class Solution {
    List<List<Integer>> res=new ArrayList<>();
    List<Integer> tmp=new ArrayList<>();
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        backtrack(nums,0);
        return res;
    }
    public void backtrack(int[] nums,int idx){
        //Arrays.sort(nums);
        res.add(new ArrayList<>(tmp));
        for(int i=idx;i<nums.length;i++){
            if(i > idx && nums[i]==nums[i-1])
                continue;
            tmp.add(nums[i]);
            backtrack(nums,i+1);
            tmp.remove(tmp.size()-1);
        }
    }
}