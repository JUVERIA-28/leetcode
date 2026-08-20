class Solution
{
    public String decodeString(String s)
    {
    StringBuilder sb = new StringBuilder();
    Stack<StringBuilder> stk = new Stack<>();
    Stack<Integer> st = new Stack<>();
    int n=0;
    for(int i=0;i<s.length();i++)
    {
        if(Character.isDigit(s.charAt(i)))
        {
            n = n*10+(s.charAt(i)-'0');
        }
        else if(s.charAt(i)=='[')
        {
            st.push(n);
            n=0;
            stk.push(sb);
            sb=new StringBuilder();
        }
        else if(s.charAt(i)==']')
        {
            //stk.push(sb);
            int n1=st.pop();
            StringBuilder s1=stk.pop();
            while(n1-->0)
            {
                s1.append(sb);
            }
            sb=s1;
        }
        else{
            sb.append(s.charAt(i));
        }
    }
    return sb.toString();
    }
}