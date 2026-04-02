class Solution {
    public int[] constructRectangle(int area) {
        int n=(int)Math.sqrt(area);
        while(area%n!=0){
            n--;
        }
        int l=area/n;
        int[] a={l,n};
        return a;
    }
}