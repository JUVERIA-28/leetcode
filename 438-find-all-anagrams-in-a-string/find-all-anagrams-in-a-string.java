class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int n=s.length();
        int k=p.length();
        List<Integer> ans=new ArrayList<>();
        if(k>n){
            return ans;
        }
        int[] fs=new int[26];
        int[] fp=new int[26];

        for(int i=0;i<k;i++){
            fs[s.charAt(i)-'a']++;
            fp[p.charAt(i)-'a']++;
        }
        if(Arrays.equals(fs,fp)){
            ans.add(0);
        }
        int st=0,e=p.length();
        while(e<n){
            fs[s.charAt(st)-'a']--;
            fs[s.charAt(e)-'a']++;
            if(Arrays.equals(fs,fp)){
                ans.add(st+1);
            }
            st++;e++;
        }
        return ans;
    }
}