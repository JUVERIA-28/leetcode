class Solution {
    public boolean detectCapitalUse(String word) {
        int cnt = 0;
        int n =word.length();
        char[] ans = word.toCharArray();
        for(int i=0;i<word.length();i++){
            if(Character.isUpperCase(ans[i])){
                cnt++;
            }
        }
        if(cnt==0){
            return true;
        }
        else if(cnt==n){
            return true;
        }else if(cnt == 1 && Character.isUpperCase(ans[0])){
            return true;
        }
        else{
            return false;
            
        }
    }
}