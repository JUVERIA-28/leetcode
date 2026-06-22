class Solution {
    public int maxIceCream(int[] costs, int coins)
    {
        int res=0;
        int cnt=0;
        Arrays.sort(costs);
        for(int c:costs)
        {
            cnt+=c;
            if(cnt<=coins){
                res++;
            }else{
                break;
            }
        }
        return res;
    }
}