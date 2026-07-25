class Solution {
    public int maxProduct(int n) 
    {
        int l=n%10;
        n/=10;
        int s=n%10;
        n/=10;
       if(s>l)
       {
        int t=l;
        l=s;
        s=t;
       }
        while(n!=0)
        {
            int x=n%10;
            if(x>=l){
                s=l;
                l=x;
            }else if(x>s){
                s=x;
            }
            n/=10;
        }
        return l*s;
        
    }
}