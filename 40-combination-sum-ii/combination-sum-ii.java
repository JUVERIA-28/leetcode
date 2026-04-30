class Solution {
    List<List<Integer>> res=new ArrayList<>();
    List<Integer> tmp=new ArrayList<>();
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        back(0,candidates,target);
        return res;
    }
    public void back(int idx,int[] c,int t){
        if(t==0){
            res.add(new ArrayList<>(tmp));
        }
        for(int i=idx;i<c.length;i++){
            if(c[i]>t ){
                continue;
            }
            if(i>idx && c[i]==c[i-1]){
                continue;
            }
            tmp.add(c[i]);
            back(i+1,c,t-c[i]);
            tmp.remove(tmp.size()-1);
        }
    }
}