class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> mp=new HashMap<>();
        for(String str:strs){
            char[] a=str.toCharArray();
            Arrays.sort(a);
            String k=new String(a);
            mp.putIfAbsent(k,new ArrayList<>());
            mp.get(k).add(str);
        }
        return new ArrayList<>(mp.values());
    }
}