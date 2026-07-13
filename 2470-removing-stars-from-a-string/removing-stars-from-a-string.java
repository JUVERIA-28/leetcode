class Solution {
    public String removeStars(String s) 
    {
        Stack<Character> stk=new Stack<>();
        for(char c:s.toCharArray())
        {
            if(c!='*'){
                stk.push(c);
            }else{
                stk.pop();
            }
        }
        if(stk.isEmpty())
        {
            return "";
        }
        StringBuilder sb=new StringBuilder();
        while(!stk.isEmpty())
        {
            char c=stk.peek();
            sb.append(c);
            stk.pop();
        }
        sb.reverse();
        return sb.toString();
        
    }
}