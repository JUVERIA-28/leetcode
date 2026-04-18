class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> mp=new HashMap<>();
        for(int n:nums1){
            int f=mp.getOrDefault(n,0);
            mp.put(n,f+1);
        }
        ArrayList<Integer> lst=new ArrayList<>();
        for(int n:nums2){
            if(mp.get(n)!=null && mp.get(n)>0){
                lst.add(n);
                mp.put(n,mp.get(n)-1);
            }
        }
        int[] r=new int[lst.size()];
        for(int i=0;i<lst.size();i++){
            r[i]=lst.get(i);
        }
        return r;
    }
}