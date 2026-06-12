class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        Map<Integer,Integer> frq = new HashMap<>();
        int xr=0;
        for(int n : nums)
        {
            frq.put(n,frq.getOrDefault(n,0)+1);
            if(frq.get(n)==2){
                xr^=n;
            }
        }
        return xr;

    }
}