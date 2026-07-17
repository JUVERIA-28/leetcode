class Solution {
    String[] op={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    StringBuilder path;
    List<String> allPath;
    public List<String> letterCombinations(String digits) 
    {
        path=new StringBuilder();
        allPath=new ArrayList<>();
        help(digits,0);
        return allPath;


    }
    public void help(String digit,int i)
    {
        if(i>=digit.length())
        {
            allPath.add(path.toString());
            return;
        }
        for(char ch:op[digit.charAt(i) -'0'].toCharArray())
        {
            path.append(ch);
            help(digit,i+1);
            path.setLength(path.length()-1);
        }
    }
}