class Solution {
    List<List<Integer>> res=new ArrayList<>();
    List<Integer> tmp=new ArrayList<>();
    public List<List<Integer>> combinationSum3(int k, int n) {
      
      back(1,k,n);
      return res;
      }  
      public void back(int idx,int k,int n){
        if(n==0 && tmp.size()==k){
            res.add(new ArrayList<>(tmp));
            return;
        }
        for(int i=idx;i<=9;i++){
            if(i>n){
                continue;
            }
            tmp.add(i);
            back(i+1,k,n-i);
            tmp.remove(tmp.size()-1);
        }
      }
    }
