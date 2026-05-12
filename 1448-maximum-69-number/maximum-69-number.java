class Solution {
    public int maximum69Number (int num) {
        StringBuilder sb = new StringBuilder();
        String s=num+"";
        boolean f=true;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='6' && f){
                sb.append('9');
                f=false;
            }else{
                sb.append(s.charAt(i));
            }
        }
        int res=Integer.parseInt(String.valueOf(sb));
        return res;
    }
}