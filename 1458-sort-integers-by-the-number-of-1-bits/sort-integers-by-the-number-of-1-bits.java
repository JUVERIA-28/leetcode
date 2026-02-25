class Solution {
    public int[] sortByBits(int[] arr) {
        int m=10001;
        for(int i=0;i<arr.length;i++){
            arr[i]+=Integer.bitCount(arr[i])*m;
            //arr[i]%=m;
        }
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            arr[i] %=m;
        }
        return arr;
    }
}