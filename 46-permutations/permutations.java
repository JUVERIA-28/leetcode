class Solution {
    List<List<Integer>> res=new ArrayList<>();
    List<Integer> t=new ArrayList<>();
    boolean[] u;
    public List<List<Integer>> permute(int[] nums) {
        u = new boolean[nums.length];
        back(nums);
        return res;
    }
    public void back(int[] nums){
        if(t.size()==nums.length){
            res.add(new ArrayList<>(t));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(u[i]){
                continue;
            }
            t.add(nums[i]);
            u[i]=true;
            back(nums);
            t.remove(t.size()-1);
            u[i]=false;
        }
    }
}