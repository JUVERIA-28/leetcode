class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> ans = new ArrayList<>();
        int n=nums.length;
        if(n==0){
            return ans;
        }
        int i=0;
        while(i<n){
            int s=nums[i];
            int j=i;
            while(j+1<n && nums[j+1]==nums[j]+1){
                j++;
            }
            if(nums[j]==s){
                ans.add(String.valueOf(s));
            }else{
                ans.add(s+"->"+nums[j]);
            }
            i=j+1;
        }
        return ans;
    }
}