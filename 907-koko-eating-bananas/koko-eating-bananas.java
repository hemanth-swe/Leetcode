class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l=1;
        int r=Arrays.stream(piles).max().getAsInt();
        int res=r;
        while(l<=r)
        {int m=(l+r)/2;
            int t=0;
            for(int pile:piles)
            {
                t+=Math.ceil((double)pile/m);
            }
            if(t<=h)
            {
                res=m;
                r=m-1;
            }
            else
            l=m+1;
        }
        return res;
    }
}