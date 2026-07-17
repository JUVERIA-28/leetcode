class Solution {
    static List<String> ans;
    public List<String> generateParenthesis(int n) 
    {
        ans=new ArrayList<>();
        String s="";
        help(n,s,0,0);
        return ans;
    }
    public static void help(int n,String s,int o,int e)
    {
        if(s.length()==2*n){
            ans.add(s);
            return ;
        }
        if(o<n){
            help(n,s+"(",o+1,e);
        }
        if(e<o){
            help(n,s+")",o,e+1);
        }
        
    }
}