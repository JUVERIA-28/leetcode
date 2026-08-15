class Solution {
    public boolean increasingTriplet(int[] nums)
    {
     int m1=Integer.MAX_VALUE;
     int m2=Integer.MAX_VALUE;
     for(int x : nums )
     {
        if(x<=m1)
        {
            m1=x;
        }else if(x<=m2)
        {
            m2=x;
        }
        else{
            return true;
        }
     }   
     return false;
    }
}