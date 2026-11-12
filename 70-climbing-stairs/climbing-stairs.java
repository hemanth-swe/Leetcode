class Solution {
    public int climbStairs(int n) {
        int cur=1;
        int prev=1;
        for(int i=0;i<n-1;i++)
        {
            int temp=cur;
            cur=prev+cur;
            prev=temp;
        }
        return cur;
    }
}