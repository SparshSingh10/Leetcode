class Solution {
    public int reverse(int n) {
        long rev=0;
        int r;
        while(n!=0){
            r=n%10;
            rev=rev*10+r;
            n/=10;
        }
        if(rev<=Integer.MAX_VALUE && rev>=Integer.MIN_VALUE)
            return (int)rev;
        else
            return 0;
    }
    
}
