class Solution {
    public int sumOddLengthSubarrays(int[] arr) 
    {
        int n=arr.length;
        int sm=0;
        for(int i=0;i<n;i++)
        {
            sm+=(((n-i)*(i+1)+1)/2)*arr[i];
        }
        return sm;
        
    }
}