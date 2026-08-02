class Solution {
    public String reverseVowels(String s) 
    {
    StringBuilder v=new StringBuilder();    
    StringBuilder s1=new StringBuilder();  
    for(int i=0;i<s.length();i++)
    {
        char ch=s.charAt(i);
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' ||ch=='U')
        {
            v.append(ch);
        }
    }
    v.reverse();
    String a=new String(v);
    int j=0;
    for(int i=0;i<s.length();i++)
    {
        char ch=s.charAt(i);
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' ||ch=='U')
        {
            s1.append(a.charAt(j));
            j++;
        }else{
            s1.append(s.charAt(i));
        }
    }
    return s1.toString();  
    }
}