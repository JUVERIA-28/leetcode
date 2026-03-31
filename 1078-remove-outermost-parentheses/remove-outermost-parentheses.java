class Solution {
    public String removeOuterParentheses(String s) {
        int n=s.length();
        if(n<=2){
            return "";
        }
        char[] c=s.toCharArray();
        StringBuilder ans=new StringBuilder();
        int a=1;
        for(int i=1;i<n;i++){
            if(c[i]=='('){
                a++;
                if(a>1){
                    ans.append('(');
                }
            }else{
                if(a>1){
                    ans.append(')');
                    
                }
                a--;
            }
        }
        
        return ans.toString();
    }
}