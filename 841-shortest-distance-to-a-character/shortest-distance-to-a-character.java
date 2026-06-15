class Solution {
    public int[] shortestToChar(String s, char c) 
    {
        int n = s.length();
        int a[] = new int[n];
        int p1=0,p2=0;
        int pr=-100000;
        while(p2<n && p1<n)
        {
            if(s.charAt(p2)==c)
            {
                int x=Math.abs(p1-pr);
                if(p2-p1<=x)
                {
                    a[p1]=p2-p1;
                }
                else{
                    a[p1]=x;
                }
                if(p1==p2)
                {
                    pr=p2;
                    p2++;
                }
                p1++;
            }
            else if(p2==n-1){
                a[p1]=Math.abs(p1-pr);
                p1++;
            }
            else{
                p2++;
            }
        }
        return a;
    }
}