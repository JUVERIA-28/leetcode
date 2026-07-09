class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2)
    {
        double ans=0.0;
        double prev=0.0;
        int n=nums1.length+nums2.length;
        int chk=nums1.length+nums2.length;
        n=n/2;
        int n1=0;
        int i=0,j=0;

        while(n1<=n)
        {
            if(i<nums1.length && j<nums2.length)
            {
                if(nums1[i]<nums2[j]){
                    prev=ans;
                    ans=nums1[i++];
                }else{
                    prev=ans;
                    ans=nums2[j++];
                }
            }
            else if(i<nums1.length){
                prev=ans;
                ans=nums1[i++];
            }else{
                prev=ans;
                ans=nums2[j++];
            }
            n1++;
        }
        if(chk%2==0)
        {
            return (ans+prev)/2;
        }
        
        return ans;

        
    }
}