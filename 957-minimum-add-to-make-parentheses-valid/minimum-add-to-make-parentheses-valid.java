class Solution {
    public int minAddToMakeValid(String s) {
        int openParentheses=0;
        int colsedParentheses=0;
        for(char ch:s.toCharArray())
        {
           if(ch=='(')openParentheses++;
           else
           {
            if(openParentheses>0)openParentheses--;
            else colsedParentheses++;
           }
        }
        return openParentheses+colsedParentheses;
    }
}