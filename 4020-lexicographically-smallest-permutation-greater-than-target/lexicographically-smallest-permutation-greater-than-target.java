class Solution {
    public String lexGreaterPermutation(String s, String target) {
        int n=s.length();
        int cost[]=new int[26];
        for(char ch:s.toCharArray())
        {
            cost[ch-'a']++;
        }
        int match=0;
        while(match<n)
        {
           int ch=target.charAt(match)-'a';
           if(cost[ch]==0)break;
           cost[ch]--;
           match++;
        }

        for(int pos=Math.min(match,n-1);pos>=0;pos--)
        {
            if(pos<match){cost[target.charAt(pos)-'a']++;}
            int cur=target.charAt(pos)-'a';
            for(int cp=cur+1;cp<26;cp++)
            { if(cost[cp]>0){cost[cp]--;
                StringBuilder result=new StringBuilder();
                result.append(target,0,pos);
                result.append((char)('a'+cp));

                for(int i=0;i<26;i++)
                {
                    while(cost[i]>0)
                    {
                        result.append((char)('a'+i));
                        cost[i]--;
                    }
                }
                return result.toString();
            }
            }

        }
        return "";
    }
}