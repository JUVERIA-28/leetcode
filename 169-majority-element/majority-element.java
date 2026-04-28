class Solution {
    public int majorityElement(int[] nums) {
        int cd=0;
        int cnt=0;
        for(int i:nums){
            if(cnt==0){
                cd=i;
            }if(cd==i){
                cnt++;
            }else{
                cnt--;
            }
        }
        return cd;
    }
}