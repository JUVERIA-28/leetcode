class Solution {
    List<List<Integer>> res=new ArrayList<>();
    List<Integer> t=new ArrayList<>();
    boolean[] u;
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        u=new boolean[nums.length];
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
            if(i>0 && nums[i]==nums[i-1] && !u[i-1]){
                continue;
            }
            u[i]=true;
            t.add(nums[i]);
            back(nums);
            t.remove(t.size()-1);
            u[i]=false;
        }
    }
}