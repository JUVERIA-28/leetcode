class Solution {
    public void sortColors(int[] nums) {
        int l=0,m=0,h=nums.length-1;
        while(m<=h){
            if(nums[m]==0){
                swap(m,l,nums);
                l++;m++;
            }else if(nums[m]==1){
                m++;
            }else{
                swap(m,h,nums);
                h--;
            }
        }
    }
    void swap(int i,int j,int[] num){
        int t=num[i];
        num[i]=num[j];
        num[j]=t;
    }
}