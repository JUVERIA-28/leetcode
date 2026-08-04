class Solution {
    public int longestOnes(int[] nums, int k) 
    {
     int cnt=0;
     int z=0,l=0;
     for(int i=0;i<nums.length;i++)
     {
        if(nums[i]==0)
        {
            z++;
        }
        while(z>k)
        {
            if(nums[l]==0)
            {
                z--;
            }
            l++;
        }
        cnt=Math.max(cnt,(i-l+1));
     }   
     return cnt;
    }
}