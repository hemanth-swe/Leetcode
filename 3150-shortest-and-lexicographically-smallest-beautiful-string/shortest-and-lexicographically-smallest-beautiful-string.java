class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        int n=s.length();
        String result="";
        int ones=0;
        int left=0;
        int minlength=Integer.MAX_VALUE;

        for(int right=0;right<n;right++)
        {
            if(s.charAt(right)=='1')ones++;
            
            while(ones==k)
            {
               while(left<right&&s.charAt(left)=='0')left++;
               int curlength=right-left+1;
               String cursub=s.substring(left,right+1);
               if(curlength<minlength){
               minlength=curlength;
               result=cursub;}
               else if(curlength==minlength)
               {
                if(result.compareTo(cursub)>0)
                result=cursub;
               }
               if(s.charAt(left)=='1')ones--;
               left++;


               


            }
        }
        return result;
    }
}