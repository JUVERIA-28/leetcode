class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int t=0;
        for(int i=0;i<timeSeries.length-1;i++){
            if(timeSeries[i+1]<=timeSeries[i]+duration-1){
                t+=timeSeries[i+1]-timeSeries[i];
            }else{
                t+=duration;
            }
        }
        t+=duration;
        return t;
    }
}