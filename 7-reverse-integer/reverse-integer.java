class Solution {
    public int reverse(int num) {
    int reverse=0;
    while(num!=0)
    {
        int reminder=num%10;
        if(reverse>Integer.MAX_VALUE/10 ||(reverse==Integer.MAX_VALUE/10 && reminder>7))return 0;
        if(reverse<Integer.MIN_VALUE/10 || (reverse==Integer.MIN_VALUE/10 && reminder<-8))return 0;
        reverse=reverse*10+reminder;
        num/=10;
    }
    
    return reverse;
    }
}