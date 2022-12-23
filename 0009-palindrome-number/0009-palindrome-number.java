class Solution {
    public boolean isPalindrome(int x) {
        int s=0,r,rev=0,n=x;
        while(n!=0){
            r=n%10;
            rev=rev*10+r;
            n=n/10;
        }
        if(rev==x && rev>=0)
            return true;
        else 
            return false;
    }
    
}