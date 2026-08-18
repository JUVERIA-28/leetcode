class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) 
    {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> a1=new ArrayList<>();
        List<Integer> a2=new ArrayList<>();
        Set<Integer> s1=new HashSet<>();
        Set<Integer> s2=new HashSet<>();
        for(int x : nums1)
        {
            s1.add(x);
        }
        for(int x : nums2)
        {
            s2.add(x);
        }
        for(int x : s1)
        {
            if(!s2.contains(x))
            {
                a1.add(x);
            }
        }
        ans.add(a1);
        for(int x : s2)
        {
            if(!s1.contains(x))
            {
                a2.add(x);
            }
        }
        ans.add(a2);
        return ans;
    }
}