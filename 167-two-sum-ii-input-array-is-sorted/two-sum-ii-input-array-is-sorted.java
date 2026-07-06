class Solution {
    public int[] twoSum(int[] numbers, int target) 
    {
        int[] ans=new int[2];
        int i=0,j=numbers.length-1;
        while(i<j)
        {
            int x=numbers[i]+numbers[j];
            if(numbers[i]+numbers[j]==target)
            {
                ans[0]=i+1;
                ans[1]=j+1;
                break;
                //return ans;
            }else if(x<target){
                i++;
            }else{
                j--;
            }
        }
        return ans;
    }
}