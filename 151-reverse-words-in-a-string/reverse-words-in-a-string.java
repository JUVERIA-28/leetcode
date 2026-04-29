class Solution {
    public String reverseWords(String s) {
        //s=s.trim(" ");
        String[] wrd=s.split("\\s+");
        StringBuilder sb=new StringBuilder();
        for(int i=wrd.length-1;i>=0;i--){
            if(i!=0){
                sb.append(wrd[i]).append(" ");
            }else{
                sb.append(wrd[i]);
            }
        }
        return sb.toString().trim();
    }
}