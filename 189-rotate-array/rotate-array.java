class Solution {
    public void rotate(int[] nums, int k) 
    {
        int n=nums.length;
        k=k%n;
        reverse(nums,0,n-1);
        reverse(nums,0,k-1);
        reverse(nums,k,n-1);    
    }
    public void reverse(int[] n,int s,int e)
    {
        while(s<e)
        {
            int t=n[s];
            n[s]=n[e];
            n[e]=t;
            s++;e--;
        }
    }
    
}