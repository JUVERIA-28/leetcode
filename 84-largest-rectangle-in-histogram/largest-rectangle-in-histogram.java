class Solution {
    public int largestRectangleArea(int[] heights) {
        int n=heights.length;
        int res=0;
        int max=0;
        int[] nse=new int[n];
        Arrays.fill(nse,n);
        int[] pse=new int[n];
        Arrays.fill(pse,-1);
        Stack<Integer> s = new Stack<>();
        Stack<Integer> s1 = new Stack<>();
        for(int i=0;i<n;i++){
            while(!s.empty() && heights[i]<heights[s.peek()]){
                nse[s.peek()]=i;
                s.pop();
            }
            s.push(i);
        }
        for(int i=n-1;i>=0;i--){
            while(!s1.empty() && heights[i]<heights[s1.peek()]){
                pse[s1.peek()]=i;
                s1.pop();
            }
            s1.push(i);
        }
        int[] w=new int[n];
        for(int i=0;i<n;i++){
            w[i]=nse[i]-pse[i]-1;
        }
        for(int i=0;i<n;i++){
            max = Math.max(max,w[i]*heights[i]);
        }
        return max;
    }
}