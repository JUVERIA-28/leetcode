class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        String l=paragraph.toLowerCase();
        String[] w=l.split("[^a-z]+");
        HashMap<String,Integer> mp = new HashMap<>();
        HashSet<String> b=new HashSet<>();
        for(String s:banned){
            b.add(s);
        }
        for(String s:w){
            if(!b.contains(s)){
                mp.put(s,mp.getOrDefault(s,0)+1);
            }
        }
        String res="";
        int mx=0;
        for(Map.Entry<String,Integer> e:mp.entrySet()){
            if(e.getValue()>mx){
                mx=e.getValue();
                res=e.getKey();
            }
        }
        return res;
    }
}