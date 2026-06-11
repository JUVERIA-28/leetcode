class Solution {
    public int sumIndicesWithKSetBits(List<Integer> nums, int k)
    {
        int sm=0;
        for(int i=0;i<nums.size();i++)
        {
            int tmp=i;
            int cnt=0;
            while(tmp>0)
            {
                tmp&=(tmp-1);
                cnt++;
            }
            if(cnt==k)
            {
                sm+=nums.get(i);
            }
        } 
        return sm;       
    }
}