class Solution {
    public int countSegments(String s) {
        String[] w=s.split(" ");
        int c=0;
        for(String a:w){
            if(!a.isEmpty()){
                c++;
            }
        }
        return c;
    }
}