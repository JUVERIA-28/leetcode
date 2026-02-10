class Solution {
    private static int[] s = new int[100001];
    private static int l=0;
    public int longestBalanced(int[] nums) {
        l++;
        int n = nums.length;
        int res=0;
        for(int i=0;i<n && n-i >res ; i++){
            int[] a = new int[2];
            int m=(l<<16)|(i+1);
            for(int j=i;j<n;j++){
                int v=nums[j];
                if(s[v]!=m){
                    s[v]=m;
                    a[v&1]++;
                }
                if(a[0]==a[1]){
                    res = Math.max(res,j-i+1);
                }
            }
        }
        return res;
    }
}