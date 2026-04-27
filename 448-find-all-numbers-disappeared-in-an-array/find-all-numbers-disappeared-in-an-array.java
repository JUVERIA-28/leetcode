class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        boolean[] chk=new boolean[nums.length+1];
        for(int i=0;i<nums.length;i++){
            chk[nums[i]]=true;
        }
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i=1;i<chk.length;i++){
            if(!chk[i]){
                ans.add(i);
            }
        }
        return ans;
    }
}