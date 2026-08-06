class Solution {
    public boolean uniqueOccurrences(int[] arr)
    {
     HashMap<Integer,Integer> mp=new HashMap<>();
     Set<Integer> st=new HashSet<>();
     for(int x:arr)
     {
        mp.put(x,mp.getOrDefault(x,0)+1);
     }   
     for(Integer n : mp.values())
     {
        if(st.contains(n)){
            return false;
        }else{
            st.add(n);
        }
     }
     return true;
    }
}