class Solution {
    public String toHex(int num) {
        if(num==0){
            return "0";
        }
        String h="0123456789abcdef";
        StringBuilder s=new StringBuilder();
        while(num!=0){
            int d=num&15;
            s.append(h.charAt(d));
            num>>>=4;
        }
        return s.reverse().toString();
    }
}