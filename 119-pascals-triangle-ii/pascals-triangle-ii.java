class Solution {
    public List<Integer> getRow(int rowIndex) {
       List<Integer> r=new ArrayList<>();
       r.add(1);
       for(int i=0;i<rowIndex;i++){
        List<Integer> nr=new ArrayList<>();
        nr.add(1);
        for(int j=1;j<r.size();j++){
            nr.add(r.get(j-1)+r.get(j));
        }
        nr.add(1);
        r=nr;
       } 
       return r;
    }
}