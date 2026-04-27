class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] ans=new int[2];
        int i=0,j=numbers.length-1;
        while(i<j){
            int sm=numbers[i]+numbers[j];
            if(sm==target){
                i++;j++;
                break;
            }else if(sm<target){
                i++;
            }else{
                j--;
            }
        }
        ans[0]=i;ans[1]=j;
        return ans;
    }   
}