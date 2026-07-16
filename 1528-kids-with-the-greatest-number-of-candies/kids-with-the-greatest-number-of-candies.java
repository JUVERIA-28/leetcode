class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        /*Arrays.sort(candies);
        int n=candies.length;
        int max=candies[n-1];*/
        int max=0;
        for(int x:candies)
        {
            max=Math.max(max,x);
        }
        List<Boolean> ans=new ArrayList<>();
        for(int i=0;i<candies.length;i++)
        {
            int x=candies[i]+extraCandies;
            if(x>=max){
                ans.add(true);
            }else{
                ans.add(false);
            }
        }
        return ans;
    }
}