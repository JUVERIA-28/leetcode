class Solution 
{
    public int subarraySum(int[] nums, int k)
    {
        int n=nums.length;
        int[] p=new int[n];
        p[0]=nums[0];
        for(int i=1;i<n;i++)
        {
            p[i]=p[i-1]+nums[i];
        }
        int cnt=0;
        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int j=0;j<n;j++)
        {
            if(p[j]==k)
            {
                cnt++;
            }
            int val=p[j]-k;
            if(mp.containsKey(val))
            {
                cnt+=mp.get(val);

            }
            mp.put(p[j],mp.getOrDefault(p[j],0)+1);
        }
        return cnt;
    }
}