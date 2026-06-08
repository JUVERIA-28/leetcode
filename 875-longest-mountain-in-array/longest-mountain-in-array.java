class Solution {
    public int longestMountain(int[] arr) 
    {
        if(arr.length<3){
            return 0;
        }
        int ans=0;
        int s=0;
        int i=s+1;
        while(i<arr.length)
        {
            if(arr[i]<=arr[i-1]){
                s=i;
                i++;
                continue;
            }
            while(i<arr.length && arr[i]>arr[i-1])
            {
                i++;
            }
            if(i==arr.length || arr[i]==arr[i-1]){
                continue;
            }
            while(i<arr.length && arr[i]<arr[i-1]){
                i++;
            }
            ans=Math.max(i-s,ans);
            s=i-1;
        }
        return ans;
    }
}