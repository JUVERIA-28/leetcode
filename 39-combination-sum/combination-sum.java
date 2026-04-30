class Solution {
    List<List<Integer>> res=new ArrayList<>();
    List<Integer> t=new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        backtrck(0,candidates,target);
        return res;
    }
    public void backtrck(int idx,int[] c,int trgt){
        if(trgt==0){
            res.add(new ArrayList<>(t));
            return;
        }
        for(int i=idx;i<c.length;i++){
            if(c[i]>trgt){
                continue;
            }
            t.add(c[i]);
            backtrck(i,c,trgt-c[i]);
            t.remove(t.size()-1);
        }
    }
}