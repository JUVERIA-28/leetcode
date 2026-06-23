class Solution {
    public int maxProfit(int[] prices) 
    {
        int min=Integer.MAX_VALUE;
        int p=0;
        for(int x : prices)
        {
            if(x<min)
            {
                min=x;
            }
            else{
                p=Math.max(p,x-min);
            }
        }
        return p;
    }
}