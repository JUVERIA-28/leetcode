class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int a=nums1.length;
        int b=nums2.length;
        int[] ans = new int[a];
        HashMap<Integer,Integer> m = new HashMap<>();
        for(int i=0;i<b;i++){
            m.put(nums2[i],i);
        }
        for(int i=0;i<a;i++){
            int k=m.get(nums1[i]);
            int n=-1;
            for(int j=k+1;j<b;j++){
                if(nums2[j]>nums1[i]){
                    n=nums2[j];
                    break;
                }
            }
            ans[i]=n;
        }
        return ans;
    }
}