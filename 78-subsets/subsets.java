class Solution {
    List<List<Integer>> res= new ArrayList<>();
    List<Integer> tmp=new ArrayList<>();
     public List<List<Integer>> subsets(int[] nums) {
        backtrack(nums,0);
        return  res;
    }
    public void backtrack(int[] nums,int idx){
        res.add(new ArrayList<>(tmp));
        for(int i=idx;i<nums.length;i++)
        {
            tmp.add(nums[i]);
            backtrack(nums,i+1);
            tmp.remove(tmp.size()-1);
        }
    }

}