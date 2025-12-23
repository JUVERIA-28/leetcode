class Solution {
    public String addStrings(String num1, String num2) {
        StringBuilder s = new StringBuilder();
        int a=num1.length()-1;
        int b=num2.length()-1;
        int c=0;
        int sum,d1,d2;
        while(a>=0 || b>=0 ||c>0){
            if(a>=0){
                d1=num1.charAt(a)-'0';
                a--;
            }else{
                d1=0;
            }
            if(b>=0){
                d2=num2.charAt(b)-'0';
                b--;
            }else{
                d2=0;
            }
            sum = d1 + d2 + c;
            s.append(sum%10);
            c = sum/10;
        }
        return s.reverse().toString();
    }
}