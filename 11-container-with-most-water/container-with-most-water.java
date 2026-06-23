class Solution {
    public int maxArea(int[] height) {
        int l=0,r=height.length-1;
        int max=0;
        while(l<r)
        {
            int min=Math.min(height[l],height[r]);
            int w=r-l;
            int wtr=w*min;
            max=Math.max(max,wtr);
            if(height[l]<height[r])
            {
                l++;
            }
            else{
                r--;
            }
        }
        return max;
    }
}