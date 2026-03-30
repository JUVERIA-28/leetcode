class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int n=image[sr][sc];
        if(image[sr][sc]==color){
            return image;
        }
        fun(image,sr,sc,color,n);
        return image;
    }
    public static void fun(int[][] img,int i,int j,int c,int n){
        if(i<0 || j<0 || i>=img.length || j>=img[0].length || img[i][j]!=n){
            return;
        }
        img[i][j]=c;
        fun(img,i+1,j,c,n);
        fun(img,i-1,j,c,n);
        fun(img,i,j-1,c,n);
        fun(img,i,j+1,c,n);
    }
}